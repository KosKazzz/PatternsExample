package main.abs_factory_example.concrete.products;

import main.abs_factory_example.interfaces.targets.Pastry;

import java.math.BigDecimal;

public class Donut implements Pastry {
    BigDecimal price;
    String name;
    int weight;


    @Override
    public BigDecimal getPrice() {
        return this.price;
    }

    @Override
    public String getPastryName() {
        return this.name;
    }

    @Override
    public int getWeight() {
        return this.weight;
    }

    @Override
    public void show() {
        System.out.println("This is Donut. It is a type of pastry made from leavened fried dough. ");
    }
}
