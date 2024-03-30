package com.elqessouartariq.hospitalwebjee;

import com.elqessouartariq.hospitalwebjee.entities.Patient;
import com.elqessouartariq.hospitalwebjee.repository.PatientRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.Date;

@SpringBootApplication
public class HospitalWebJeeApplication implements CommandLineRunner {
    @Autowired
    private PatientRepository patientRepository;
    public static void main(String[] args) {
        SpringApplication.run(HospitalWebJeeApplication.class, args);
    }

    @Override
    public void run(String... args) throws Exception {
//
//        patientRepository.save(new Patient(null, "Tariq", new Date(), false, 5));
//        patientRepository.save(new Patient(null, "Yassine", new Date(), false, 99));
    }
}
