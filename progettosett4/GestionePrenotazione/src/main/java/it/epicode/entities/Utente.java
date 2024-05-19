package it.epicode.entities;

import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import lombok.*;

@Entity
@Table(name="utenti")
@Builder(setterPrefix = "with")
@EqualsAndHashCode(callSuper = true)
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Utente extends Base {
    private String username;
    private String nome;
    private String cognome;
    private String email;

}
