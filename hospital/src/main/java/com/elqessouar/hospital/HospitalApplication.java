package com.elqessouar.hospital;

import com.elqessouar.hospital.entities.Patient;
import com.elqessouar.hospital.repository.MedecinRepository;
import com.elqessouar.hospital.repository.PatientRepository;
import com.elqessouar.hospital.repository.RendezVousRepository;
import com.elqessouar.hospital.service.IHospital;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.transaction.annotation.Transactional;

import java.util.Date;
import java.util.List;
import java.util.stream.Stream;


@SpringBootApplication
public class HospitalApplication  {
    @Autowired
    private PatientRepository patientRepository;
    public static void main(String[] args) {
        SpringApplication.run(HospitalApplication.class, args);
    }
    @Bean
    CommandLineRunner  start(IHospital HospitalService, PatientRepository patientRepository, MedecinRepository medecinRepository, RendezVousRepository rendezVousRepository) {
        return args -> {
            Stream.of("Tariq", "Yassin", "Aya").
                    forEach(name -> {
                        Patient patient = new Patient();
                        patient.setNom(name);
                        patient.setDateNaissance(new Date());
                        patient.setMalade(true);
                        HospitalService.savePatient(patient);
                        patientRepository.save(patient);
                    });
            Patient patient = patientRepository.findPatientById(1L);
            System.out.println(patient.toString());
        };
    }
}
