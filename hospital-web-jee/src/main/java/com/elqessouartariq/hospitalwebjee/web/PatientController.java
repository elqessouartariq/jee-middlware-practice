package com.elqessouartariq.hospitalwebjee.web;

import com.elqessouartariq.hospitalwebjee.entities.Patient;
import com.elqessouartariq.hospitalwebjee.repository.PatientRepository;
import lombok.AllArgsConstructor;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;

@Controller
@AllArgsConstructor
public class PatientController {
    private PatientRepository patientRepository;
    @GetMapping(path = "/")
    public String index(Model model,
                        @RequestParam(name = "page", defaultValue = "0") int page,
                        @RequestParam(name = "size", defaultValue = "4") int size,
                        @RequestParam(name = "keyword", defaultValue = "") String keyword) {
        //Page<Patient> pagePatients = patientRepository.findAll(PageRequest.of(page, size));
        Page<Patient> pagePatients = patientRepository.findByNomContains(keyword,PageRequest.of(page, size));
        model.addAttribute("patients", pagePatients.getContent());
        model.addAttribute("pages", new int[pagePatients.getTotalPages()]);
        model.addAttribute("currentPage", page);
        model.addAttribute("keyword", keyword);
        return "patients";
    }

    @GetMapping(path = "/delete")
    public String delete(
            @RequestParam(name = "id") Long id,
            @RequestParam(name = "page", defaultValue = "0") int page,
            @RequestParam(name = "keyword", defaultValue = "") String keyword)
    {
        patientRepository.deleteById(id);
        return "redirect:/?page=" + page + "&keyword=" + keyword;
    }

}
