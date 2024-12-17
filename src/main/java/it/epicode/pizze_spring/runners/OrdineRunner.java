package it.epicode.pizze_spring.runners;

import it.epicode.pizze_spring.Enum.StatoOrdine;
import it.epicode.pizze_spring.entity.Ordine;
import it.epicode.pizze_spring.repository.OrdineRepo;
import it.epicode.pizze_spring.repository.TavoloRepo;
import lombok.RequiredArgsConstructor;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

@Component
@Order(5)
@RequiredArgsConstructor
public class OrdineRunner implements ApplicationRunner {

    private final OrdineRepo ordineRepo;
    private final TavoloRepo tavoloRepo;

    @Override
    public void run(ApplicationArguments args) throws Exception {

        Ordine ordine = new Ordine();
        ordine.setStatoOrdine(StatoOrdine.IN_CORSO);
        ordineRepo.save(ordine);
    }
}
