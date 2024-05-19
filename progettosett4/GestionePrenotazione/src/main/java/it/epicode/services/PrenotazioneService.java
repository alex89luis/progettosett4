package it.epicode.services;

import it.epicode.entities.Prenotazione;
import it.epicode.entities.Utente;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import it.epicode.repository.PrenotazioneRepository;

import java.time.LocalDate;
@Slf4j
@Service
public class PrenotazioneService {
    @Autowired
    PrenotazioneRepository prenotazioneRepository;
    @Autowired
    PostazioneService postazioneService;

    public void creaPrenotazione(Long postazioneId, Utente utente, LocalDate dataPrenotazione) {
        var postazione = postazioneService.findById(postazioneId);
        if (postazione == null) {
            log.warn("postazione inesistente");
        } else if ((postazione.getMaxoccupanti() - prenotazioneRepository.findBydataPrenotazioneAndPostazioniId(dataPrenotazione, postazione.getId()).size()) == 0) {
            log.warn("non puoi prenotare, posti sono esauriti per questa data " + dataPrenotazione);
        } else if (prenotazioneRepository.findBydataPrenotazioneAndUtentiId(dataPrenotazione, utente.getId()) != null) {
            log.warn("non è possibile prenotare per lo stesso giorno ");
        } else {
            log.info("prenotazione andata a buon fine");
            prenotazioneRepository.save(new Prenotazione(postazione, utente, dataPrenotazione));

        }
    }
}
