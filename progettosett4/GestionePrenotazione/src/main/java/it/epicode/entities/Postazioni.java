package it.epicode.entities;

import jakarta.persistence.*;
import lombok.*;

@EqualsAndHashCode(callSuper = true)
@Entity
@Table(name="postazioni")
@Data



public class Postazioni extends Base {

   private Long id;
   private String descrizione;
   private TipoPostazione tipo;
   private Integer Maxoccupanti;
   private Integer occupati;

   @OneToOne
   @JoinColumn(name = "edificio_id")
   private Edificio edificio;

   public Postazioni() {

   }

@Builder(setterPrefix = "with")
   public Postazioni(Long id, Long id1, String descrizione, Edificio edificio, Integer maxoccupanti, TipoPostazione tipo) {
      super(id);
      this.id = id1;
      this.descrizione = descrizione;
      this.edificio = edificio;
      this.occupati = 0;
      Maxoccupanti = maxoccupanti;
      this.tipo = tipo;
   }

}
