package com.elqessouar.hospital.service;
import com.elqessouar.hospital.entities.Consultation;
import com.elqessouar.hospital.entities.Medecin;
import com.elqessouar.hospital.entities.Patient;
import com.elqessouar.hospital.entities.RendezVous;
import org.springframework.stereotype.Service;
import jakarta.transaction.Transactional;


@Service
@Transactional
public class IHospitalImpl implements IHospital {
    @Override
    public Patient savePatient(Patient p) {
        return null;
    }

    @Override
    public Medecin saveMedecin(Medecin m) {
        return null;
    }

    @Override
    public RendezVous saveRendezVous(RendezVous r) {
        return null;
    }

    @Override
    public Consultation saveConsultation(Consultation c) {
        return null;
    }
}
