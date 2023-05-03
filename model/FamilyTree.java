package model;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class FamilyTree implements Iterable<Human> {
    Human human;
    List<Human> familyList;
    
    public FamilyTree() {
        familyList = new ArrayList<>();
        System.out.println("Привет из FamilyTree");
    }
    
    public void add(Human human) {
        familyList.add(human);
        if(human.getMother() != null) {
            human.getMother().addChild(human);
        }
        if(human.getFather() != null) {
            human.getFather().addChild(human);
        }
        System.out.println("Привет из метода add в классе FamilyTree");
    }
    
    public String showInfo() {
        StringBuilder sb = new StringBuilder();
        System.out.println("Количество членов семьи равно " + familyList.size());
        System.out.println("Члены семьи: ");
        for(Human human : familyList) {
            sb.append(human.getInfo());
        }
        return sb.toString();
    }
    
    public String toString() {
        return human.toString();
    }
    
    public Human getHumanByName(String name) {
        for(Human human : familyList) {
            if(human.name.equals(name)) {
                return human;
            }
        }
        return human;
    }
    
    public Iterator<Human> iterator() {
        return new HumanIterator();
    }
}