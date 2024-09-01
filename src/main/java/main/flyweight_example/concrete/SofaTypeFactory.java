package main.flyweight_example.concrete;

import main.flyweight_example.interfaces.SofaType;

import java.util.HashMap;
import java.util.Map;

public class SofaTypeFactory {
    private static final Map<String, Sofa> sofaTypeMap = new HashMap<>();

    public static Sofa getSofa(String brandName) {
        Sofa sofa = sofaTypeMap.get(brandName);
        if (sofa == null) {
            sofa = new Sofa(brandName);
            sofaTypeMap.put(brandName, sofa);
            System.out.println("Creating new sofa - " + brandName);
        }
        return sofa;
    }
}
