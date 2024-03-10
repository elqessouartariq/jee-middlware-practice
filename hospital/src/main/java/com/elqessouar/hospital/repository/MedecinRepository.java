package com.elqessouar.hospital.repository;

import com.elqessouar.hospital.entities.Medecin;
import jakarta.transaction.Transactional;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.List;

public interface MedecinRepository  extends JpaRepository<Medecin, Long> {
    @Query("select m from Medecin m where m.id = :id")
    Medecin searchMedecin(@Param("id")long id);
    @Transactional
    @Modifying
    @Query("UPDATE Medecin m SET m.id = :name WHERE m.id = :id")
    void updateMedecin(@Param("id") long id, @Param("name") String nom);
    @Transactional
    void deleteMedecinById(long id);
}