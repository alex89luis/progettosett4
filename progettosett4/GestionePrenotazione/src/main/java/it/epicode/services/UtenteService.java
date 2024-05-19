package it.epicode.services;

import it.epicode.entities.Utente;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import it.epicode.repository.UtenteRepository;
@Service
public class UtenteService {
    @Autowired
   UtenteRepository utenteRepository;

    public void save(Utente utente){
        utenteRepository.save(utente);
    }
}
