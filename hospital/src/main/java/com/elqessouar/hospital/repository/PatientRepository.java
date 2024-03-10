package com.elqessouar.hospital.repository;

import com.elqessouar.hospital.entities.Patient;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.Optional;

public interface PatientRepository extends JpaRepository<Patient,Long> {
    List<Patient> findByNom(String name);
    Patient findPatientById(Long id);
    List<Patient> findByNomAndScore(String name, int score);
    List<Patient> findByMaladeIsTrue();

    @Transactional
    @Modifying
    @Query("update Patient p set p.nom = ?1 where p.id = ?2")
    void updatePatientByNom(String name, Long id);
    @Transactional
    void removePatientById(Long id);

}
