package com.elqessouar.hospital.service;

import com.elqessouar.hospital.entities.Consultation;
import com.elqessouar.hospital.entities.Medecin;
import com.elqessouar.hospital.entities.Patient;
import com.elqessouar.hospital.entities.RendezVous;

public interface IHospital {
    Patient savePatient(Patient p);
    Medecin saveMedecin(Medecin m);
    RendezVous saveRendezVous(RendezVous r);
    Consultation saveConsultation(Consultation c);
}