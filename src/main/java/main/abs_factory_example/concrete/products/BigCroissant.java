package main.abs_factory_example.concrete.products;

import main.abs_factory_example.interfaces.targets.Pastry;

import java.math.BigDecimal;

public class BigCroissant implements Pastry {
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
        System.out.println("This is a really big Croissant. It is a French pastry. ");
    }
}
