package main.abs_factory_example.interfaces.absfactories;


import main.abs_factory_example.interfaces.targets.Pastry;

public interface PastryFactory {
    Pastry createCake();

    Pastry createCroissant();

    Pastry createDonut();
}
