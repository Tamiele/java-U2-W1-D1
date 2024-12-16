package it.epicode.pizze_spring.configurations;

import it.epicode.pizze_spring.entity.Pizza;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class PizzaConfiguration {

    @Bean
    public Pizza newPizzaMargherita() {
        Pizza pizza = new Pizza();
        pizza.setNome("Margherita");
        pizza.setPrezzo(5.0);
        pizza.setCalorie(1104);
        return pizza;
    }

    @Bean
    Pizza newPizzaHawaaiiana() {
        Pizza pizza = new Pizza();
        pizza.setNome("Hawaaiiana");
        pizza.setCalorie(1024);
        pizza.setPrezzo(6.50);
        return pizza;
    }

    @Bean
    Pizza newPizzaSalame() {
        Pizza pizza = new Pizza();
        pizza.setNome("Salame");
        pizza.setCalorie(1160);
        pizza.setPrezzo(6.0);
        return pizza;
    }
}
