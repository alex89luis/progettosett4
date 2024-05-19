package it.epicode.repository;

import it.epicode.entities.Prenotazione;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.time.LocalDate;
import java.util.List;

@Repository
public interface PrenotazioneRepository extends JpaRepository<Prenotazione,Long> {
    List<Prenotazione> findBydataPrenotazioneAndPostazioniId(LocalDate data, Long PostazioniId);

    Prenotazione findBydataPrenotazioneAndUtentiId(LocalDate data, Long UtenteId);
}
