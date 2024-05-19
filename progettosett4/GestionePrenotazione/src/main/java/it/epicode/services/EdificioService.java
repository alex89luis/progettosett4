package it.epicode.services;

import it.epicode.entities.Edificio;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import it.epicode.repository.EdificioRepository;
@Service
public class EdificioService {

    @Autowired
    EdificioRepository edificioRepository;
    public void save(Edificio edificio){
        edificioRepository.save(edificio);
    }
}
