package main.memento_example;

import java.util.ArrayList;
import java.util.List;

public class TargetForSave {
    String str = "";
    List<Integer> integerList = new ArrayList<>();

    public TargetForSave() {
    }

    TargetForSave(String str, List<Integer> list) {
        this.str = str;
        this.integerList = list;
    }

    public void addStr(String str) {
        this.str += str;
    }

    public void addToIntegerList(Integer integer) {
        this.integerList.add(integer);
    }

    public TargetMemento createMeme() {
        return new TargetMemento(this.str, this.integerList);
    }

    @Override
    public String toString() {
        return "TargetForSave{" +
                "str='" + str + '\'' +
                ", integerList=" + integerList +
                '}';
    }
}
