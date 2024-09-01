package main.memento_example;

import java.util.ArrayList;
import java.util.List;

public class HistoryContainer {
    List<TargetMemento> container;

    public HistoryContainer() {
        this.container = new ArrayList<>();
    }
    public void addTarget(TargetMemento targetMemento){
        this.container.add(targetMemento);
    }
    public TargetMemento getTarget(int index){
        return this.container.get(index);
    }
}
