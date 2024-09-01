package main.abs_factory_example.concrete.factories;


import main.abs_factory_example.concrete.products.Cake;
import main.abs_factory_example.concrete.products.Croissant;
import main.abs_factory_example.concrete.products.Donut;
import main.abs_factory_example.interfaces.absfactories.PastryFactory;
import main.abs_factory_example.interfaces.targets.Pastry;

public class NormalPastryFactory implements PastryFactory {
    @Override
    public Pastry createCake() {
        return new Cake();
    }

    @Override
    public Pastry createCroissant() {
        return new Croissant();
    }

    @Override
    public Pastry createDonut() {
        return new Donut();
    }
}
