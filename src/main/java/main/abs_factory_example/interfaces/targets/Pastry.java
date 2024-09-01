package main.abs_factory_example.interfaces.targets;

import java.math.BigDecimal;

public interface Pastry {
    BigDecimal getPrice();
    String getPastryName();
    int getWeight();
    void show();
}
