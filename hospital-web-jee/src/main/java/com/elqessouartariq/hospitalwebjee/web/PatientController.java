package com.elqessouartariq.hospitalwebjee.web;

import com.elqessouartariq.hospitalwebjee.entities.Patient;
import com.elqessouartariq.hospitalwebjee.repository.PatientRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;

@Controller
@AllArgsConstructor
public class PatientController {
    private PatientRepository patientRepository;
    @GetMapping(path = "/")
    public String index(Model model) {
        List<Patient> patientsList = patientRepository.findAll();
        model.addAttribute("patients", patientsList);
        return "patients";
    }
}
