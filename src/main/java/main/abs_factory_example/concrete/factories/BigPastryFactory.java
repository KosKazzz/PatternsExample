package main.abs_factory_example.concrete.factories;

import main.abs_factory_example.concrete.products.*;
import main.abs_factory_example.interfaces.absfactories.PastryFactory;
import main.abs_factory_example.interfaces.targets.Pastry;

public class BigPastryFactory implements PastryFactory {

    @Override
    public Pastry createCake() {
        return new BigCake();
    }

    @Override
    public Pastry createCroissant() {
        return new BigCroissant();
    }

    @Override
    public Pastry createDonut() {
        return new BigDonut();
    }
}
