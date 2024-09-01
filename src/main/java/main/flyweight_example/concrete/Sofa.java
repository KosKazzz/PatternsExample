package main.flyweight_example.concrete;

import main.flyweight_example.interfaces.SofaType;

public class Sofa implements SofaType {
    String brandName;
    String color;
    int length;
    int height;
    String material;

    public void setColor(String color) {
        this.color = color;
    }

    public void setLength(int length) {
        this.length = length;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public void setMaterial(String material) {
        this.material = material;
    }

    public Sofa(String brandName){
        this.brandName = brandName;
        this.color = "default";
        this.length = 0;
        this.height = 0;
        this.material = "default";
    }

    @Override
    public void showSofa() {
        System.out.printf("This is Sofa, color is %s, Brand is %s, size:  %s x %s, material is %s", color, brandName, length, height, material);
        System.out.println();
    }

}
