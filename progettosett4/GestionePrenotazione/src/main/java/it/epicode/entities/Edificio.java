package it.epicode.entities;




import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import lombok.*;

@EqualsAndHashCode(callSuper = true)
@Entity
@Builder(setterPrefix = "with")
@Table(name = "edifici")
@AllArgsConstructor
@NoArgsConstructor
@Data
public class Edificio extends Base{
    private String name;
    private String indirizzo;
    private String citta;

}




