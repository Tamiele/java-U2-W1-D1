package it.epicode.pizze_spring.runners;

import it.epicode.pizze_spring.entity.Bevanda;
import it.epicode.pizze_spring.entity.Pizza;
import it.epicode.pizze_spring.entity.Topping;
import it.epicode.pizze_spring.repository.BevandaRepo;
import it.epicode.pizze_spring.repository.MenuRepo;
import it.epicode.pizze_spring.repository.PizzaRepo;
import it.epicode.pizze_spring.repository.ToppingRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
@Order(4)
public class MenuRunner implements ApplicationRunner {
    @Autowired
    private MenuRepo menuRepo;

    @Autowired
    private PizzaRepo pizzaRepo;

    @Autowired
    private BevandaRepo bevandaRepo;

    @Autowired
    private ToppingRepo toppingRepo;

    @Override
    public void run(ApplicationArguments args) throws Exception {

        List<Pizza> pizze = pizzaRepo.findAll();
        for (Pizza pizza : pizze) {
            System.out.println(pizza.getNome() + " " + pizza.getPrezzo() + " " + pizza.getCalorie());
        }

        List<Topping> toppings = toppingRepo.findAll();
        for (Topping topping : toppings) {
            System.out.println(topping.getNome() + " " + topping.getPrezzo() + " " + topping.getCalorie());
        }

        List<Bevanda> bevande = bevandaRepo.findAll();
        for (Bevanda bevanda : bevande) {
            System.out.println(bevanda.getNome() + " " + bevanda.getPrezzo() + " " + bevanda.getCalorie());
        }

    }
}
