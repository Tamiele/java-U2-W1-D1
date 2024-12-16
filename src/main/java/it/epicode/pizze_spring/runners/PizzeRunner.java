package it.epicode.pizze_spring.runners;

import it.epicode.pizze_spring.entity.Pizza;
import it.epicode.pizze_spring.repository.PizzaRepo;
import jakarta.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;


@Component
@Order(1)
public class PizzeRunner implements ApplicationRunner {


    @Autowired
    private PizzaRepo pizzaRepo;

    @Autowired
    private Pizza newPizzaMargherita;

    @Autowired
    private Pizza newPizzaHawaaiiana;

    @Autowired
    private Pizza newPizzaSalame;

    @Override
    @Transactional
    public void run(ApplicationArguments args) throws Exception {
        pizzaRepo.save(newPizzaMargherita);
        pizzaRepo.save(newPizzaHawaaiiana);
        pizzaRepo.save(newPizzaSalame);
    }
}
