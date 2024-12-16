package it.epicode.pizze_spring.runners;

import it.epicode.pizze_spring.entity.Topping;
import it.epicode.pizze_spring.repository.ToppingRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;


@Component
@Order(3)
public class ToppingRunner implements ApplicationRunner {

    @Autowired
    private ToppingRepo toppingRepo;

    @Autowired
    private Topping newToppingCheese;

    @Autowired
    private Topping newToppingOnions;

    @Autowired
    private Topping newToppingPinapple;

    @Autowired
    private Topping newToppingHam;

    @Autowired
    private Topping newToppingSalami;

    @Override
    public void run(ApplicationArguments args) throws Exception {
        toppingRepo.save(newToppingCheese);
        toppingRepo.save(newToppingOnions);
        toppingRepo.save(newToppingPinapple);
        toppingRepo.save(newToppingHam);
        toppingRepo.save(newToppingSalami);
    }
}
