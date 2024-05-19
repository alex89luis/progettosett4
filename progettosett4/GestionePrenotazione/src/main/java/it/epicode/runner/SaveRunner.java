package it.epicode.runner;

import it.epicode.entities.*;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.autoconfigure.data.web.SpringDataWebProperties;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import org.springframework.stereotype.Component;
import it.epicode.services.EdificioService;
import it.epicode.services.PostazioneService;
import it.epicode.services.PrenotazioneService;
import it.epicode.services.UtenteService;

import java.time.LocalDate;

@Component
@Slf4j
public class SaveRunner implements CommandLineRunner {
    @Autowired
    private EdificioService edificioService;
    @Autowired
    private PostazioneService postazioneService;
    @Autowired
    private PrenotazioneService prenotazioneService;
    @Autowired
    private UtenteService utenteService;
    @Autowired
    AppConfig appConfig;



    @Override
    public void run(String... args) throws Exception {
       // AnnotationConfigApplicationContext ctx = new AnnotationConfigApplicationContext(AppConfig.class);

        //utenteService.save(ctx.getBean("Dany", Utente.class));
        //utenteService.save(ctx.getBean("Jo",Utente.class));
        //utenteService.save(ctx.getBean("Carlo",Utente.class));

        //edificioService.save(ctx.getBean("EdificioEst", Edificio.class));
        //edificioService.save(ctx.getBean("EdificioOvest", Edificio.class));

        //postazioneService.save(ctx.getBean("postazione1", Postazioni.class));
        //postazioneService.save(ctx.getBean("postazione2", Postazioni.class));
    try {

        var utente1 = appConfig.DanyBean();
        utenteService.save(utente1);
        var utente2 = appConfig.Jojo();
        utenteService.save(utente2);
        var utente3 = appConfig.Carlo();
        utenteService.save(utente3);
        ///////////////////
        var edificio1 = appConfig.PrimoEdificio();
        edificioService.save(edificio1);
        var edificio2 = appConfig.SecondoEdificio();
        edificioService.save(edificio2);
        var postazione1 = appConfig.postazione1();
        postazioneService.save(postazione1);
        var postazione2 = appConfig.SecondaPostazione();
        postazioneService.save(postazione2);


        prenotazioneService.creaPrenotazione(1L,utente2,LocalDate.now());
        //prova che non posso prenotare per lo stesso giorno
        prenotazioneService.creaPrenotazione(2L,utente2, LocalDate.now());

        //cerca postazione per tipo e città
        postazioneService.cercaPostazione(TipoPostazione.OPENSPACE,"Napoli");

    }catch (Exception e){
        System.out.println(e.getMessage());
    }

    }

}
