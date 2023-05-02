package model;

import java.util.ArrayList;
import java.util.List;

public class FamilyTree {
    private List<Human> humanList;
    private Human human;
    
    public FamilyTree() {
        humanList = new ArrayList<>();
    }

    public void addHuman(Human human) {
        humanList.add(human);
    }

    public String showInfo() {
        StringBuilder sb = new StringBuilder();
        for(int i = 0; i < humanList.size(); i++) {
            sb.append(human);
        }
        return sb.toString();
    }
}
