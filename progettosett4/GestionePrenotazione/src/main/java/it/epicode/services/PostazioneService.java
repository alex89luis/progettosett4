package it.epicode.services;

import it.epicode.entities.Postazioni;
import it.epicode.entities.TipoPostazione;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import it.epicode.repository.PostazioneRepository;
@Slf4j
@Service
public class PostazioneService {
    @Autowired
    PostazioneRepository postazioneRepository;

    public void save(Postazioni postazioni){
        postazioneRepository.save(postazioni);

    }
        public Postazioni findById(Long id){
        return postazioneRepository.findById(id).orElseThrow();
        }public void cercaPostazione(TipoPostazione tipo, String citta){
        var ris = postazioneRepository.findBytipoAndEdificioCitta(tipo, citta);
        if (ris.size() != 0){
            for(Postazioni e: ris){
                log.info(e.toString());
            }
        } else log.warn("Not result");
    }

}
