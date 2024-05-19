package it.epicode.entities;

import jakarta.persistence.*;
import lombok.Builder;
import lombok.Data;
import lombok.EqualsAndHashCode;

import java.time.LocalDate;

@Entity
@Table(name="prenotazioni")
@EqualsAndHashCode(callSuper = true)
@Data
public class Prenotazione extends Base{
    @OneToOne
    @JoinColumn(name = "postazione_id")
    private Postazioni postazioni;
    @ManyToOne
    @JoinColumn(name= "utente_id")
    private Utente utenti;
    private LocalDate dataPrenotazione;
    private LocalDate dataScadenza;
 @Builder
    public Prenotazione( Postazioni postazioni, Utente utenti, LocalDate dataPrenotazione) {

        this.postazioni = postazioni;
        this.utenti = utenti;
        this.dataPrenotazione = dataPrenotazione;
        this.dataScadenza = dataPrenotazione.plusDays(1);
    }


}
