package com.elqessouar.hospital.repository;

import com.elqessouar.hospital.entities.Consultation;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ConsultationRepository  extends JpaRepository<Consultation, Long> {
}
