package it.epicode.pizze_spring.runners;

import it.epicode.pizze_spring.Enum.StatoOrdine;
import it.epicode.pizze_spring.Enum.StatoTavolo;
import it.epicode.pizze_spring.entity.Menu;
import it.epicode.pizze_spring.entity.Ordine;
import it.epicode.pizze_spring.entity.Tavolo;
import it.epicode.pizze_spring.repository.MenuRepo;
import it.epicode.pizze_spring.repository.OrdineRepo;
import it.epicode.pizze_spring.repository.TavoloRepo;
import lombok.RequiredArgsConstructor;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.boot.CommandLineRunner;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

import java.time.LocalDateTime;
import java.time.LocalTime;
import java.util.List;

@Component
@Order(5)

public class OrdineRunner implements CommandLineRunner {
    private static final Logger logger = LoggerFactory.getLogger(OrdineRunner.class);


    @Autowired
    private OrdineRepo ordineRepo;

    @Autowired
    private TavoloRepo tavoloRepo;

    @Autowired
    private MenuRepo menuRepo;

    @Value("${costo.coperto}")
    private double costoCoperto;


    @Override
    public void run(String... args) throws Exception {

        Tavolo tavolo = new Tavolo();
        tavolo.setNumero(1);
        tavolo.setNumeroCopertiMax(4);
        tavolo.setStatoTavolo(StatoTavolo.OCCUPATO);
        tavoloRepo.save(tavolo);

        Ordine ordine = new Ordine();
        ordine.setNumeroOrdine(1);
        ordine.setStatoOrdine(StatoOrdine.IN_CORSO);
        ordine.setNumeroCoperti(3);
        ordine.setOraAcquisizione(LocalTime.now());
        ordine.setTavolo(tavolo);

        List<Menu> elementiMenu = menuRepo.findAll();
        ordine.setElementiMenu(elementiMenu);

        double importoTotale = elementiMenu.stream().mapToDouble(Menu::getPrezzo).sum() + (costoCoperto * ordine.getNumeroCoperti());
        ordine.setImportoTotale(importoTotale);

        ordineRepo.save(ordine);

        logger.info("Ordine creato: {}", ordine);

    }
}
