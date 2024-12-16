package it.epicode.pizze_spring.runners;

import it.epicode.pizze_spring.entity.Bevanda;
import it.epicode.pizze_spring.repository.BevandaRepo;
import jakarta.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

@Component
@Order(2)
public class BevandeRunner implements ApplicationRunner {
    @Autowired
    private BevandaRepo bevandaRepo;

    @Autowired
    private Bevanda newBevandaLemonade;

    @Autowired
    private Bevanda newBevandaWater;

    @Autowired
    private Bevanda newBevandaWine;

    @Override
    @Transactional
    public void run(ApplicationArguments args) throws Exception {
        bevandaRepo.save(newBevandaLemonade);
        bevandaRepo.save(newBevandaWater);
        bevandaRepo.save(newBevandaWine);
    }
}
