package it.epicode.repository;

import it.epicode.entities.Postazioni;
import it.epicode.entities.TipoPostazione;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface PostazioneRepository extends JpaRepository<Postazioni,Long> {
    public List<Postazioni> findBytipoAndEdificioCitta(TipoPostazione tipo, String citta);
}
