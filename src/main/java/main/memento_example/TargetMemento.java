package main.memento_example;

import java.util.ArrayList;
import java.util.List;

public class TargetMemento {

    private final TargetForSave forSave;
    private final List<Integer> listForSave = new ArrayList<>();

    public TargetMemento(String s, List<Integer> list){
        listForSave.addAll(list);
        forSave = new TargetForSave(s, this.listForSave);
    }
    public TargetForSave getSavedElem(){
        return  forSave;
    }
}
