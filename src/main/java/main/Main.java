package main;

import main.abs_factory_example.concrete.factories.BigPastryFactory;
import main.abs_factory_example.concrete.factories.NormalPastryFactory;
import main.abs_factory_example.interfaces.absfactories.PastryFactory;
import main.abs_factory_example.interfaces.targets.Pastry;
import main.flyweight_example.concrete.Sofa;
import main.flyweight_example.concrete.SofaTypeFactory;
import main.memento_example.HistoryContainer;
import main.memento_example.TargetForSave;

public class Main {
    public static void main(String[] args) {
        //"test" for Abstract Factory pattern
        PastryFactory factory = new BigPastryFactory();
        Pastry sweet = factory.createCake();
        sweet.show();
        factory = new NormalPastryFactory();
        sweet = factory.createCroissant();
        sweet.show();
        Pastry moreSweet = new BigPastryFactory().createDonut();
        moreSweet.show();

        //"test" for Flyweight pattern
        for (int i = 1; i < 10; i++) {
            int x = (int) (Math.random() * 5);
            Sofa s = SofaTypeFactory.getSofa("brand #" + x);
            s.setColor("Color #" + x);
            s.setHeight(x + 3);
            s.setLength(x + 1);
            s.setMaterial("Material #" + x);
            s.showSofa();
        }
        //"test" for Memento pattern
        TargetForSave someThing = new TargetForSave();

        someThing.addStr("first");
        someThing.addToIntegerList(1);
        HistoryContainer historyContainer = new HistoryContainer();
        historyContainer.addTarget(someThing.createMeme());
        someThing.addStr("-second");
        someThing.addToIntegerList(2);
        historyContainer.addTarget(someThing.createMeme());
        someThing.addStr(" - one more");
        someThing.addToIntegerList(3);
        historyContainer.addTarget(someThing.createMeme());

        System.out.println(someThing);
        System.out.println(historyContainer.getTarget(0).getSavedElem());
        System.out.println(historyContainer.getTarget(1).getSavedElem());


    }
}