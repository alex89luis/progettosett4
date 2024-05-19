package it.epicode.entities;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class AppConfig {

    @Bean(name="Dany")
    public Utente Jojo(){
        return Utente.builder()
                .withUsername("JOJO")
                .withNome("giovanni")
                .withCognome("kekw")
                .withEmail("jojo23")
                .build();
    }

    @Bean(name="Jo")
    public Utente DanyBean(){
        return Utente.builder()
                .withUsername("wesker")
                .withNome("Daniele")
                .withCognome("Luise")
                .withEmail("Daniele03")
                .build();
    }

    @Bean(name="Carlo")
    public Utente Carlo(){
        return Utente.builder()
                .withUsername("killer")
                .withNome("Carlos")
                .withCognome("Ingi")
                .withEmail("Carlossosa10")
                .build();
    }


    @Bean(name="EdificioEst")
    public Edificio PrimoEdificio(){
        return Edificio.builder()
                .withName("TorreEst")
                .withCitta("Napoli")
                .withIndirizzo("Via delle pigne")
                .build();
    }
    @Bean(name="EdificioOvest")
    public Edificio SecondoEdificio(){
        return Edificio.builder()
                .withName("TorreOvest")
                .withCitta("Medellin")
                .withIndirizzo("Via de los bandito")
                .build();
    }

    @Bean(name="postazione1")
    public Postazioni postazione1(){
        return Postazioni.builder()
                .withDescrizione("futuristica")
                .withTipo(TipoPostazione.PRIVATO)
                .withMaxoccupanti(2)
                .withEdificio(PrimoEdificio())
                .build();
    }
    @Bean(name="postazione2")
    public Postazioni SecondaPostazione(){
        return Postazioni.builder()
                .withDescrizione("vecchia")
                .withTipo(TipoPostazione.OPENSPACE)
                .withMaxoccupanti(4)
                .withEdificio(SecondoEdificio())
                .build();
    }



}
