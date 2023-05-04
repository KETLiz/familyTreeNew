package model;

import java.util.ArrayList;
import java.util.List;

public class Human {
    String name;
    int birthYear;
    Human mother;
    Human father;
    List<Human> children;
    
    public Human(String name, int birthYear, Human mother, Human father) {
        this.name = name;
        this.birthYear = birthYear;
        this.mother = mother;
        this.father = father;
        children = new ArrayList<>();
    }
    
    public Human(String name, int birthYear) {
        this(name, birthYear, null, null);
    }

    public String getName() {
        return name;
    }

    public String toString() {
        return getInfo();
    }
    
    public String getInfo() {
        //return "Имя: " + name + ", год рождения: " + birthYear + ". Мама: " + getMotherByName() + ". Папа: " + getFatherByName() + ". Дети: " + getChildInfo() + "\n";
        StringBuilder sb = new StringBuilder();
        sb.append("Имя: ");
        sb.append(getName());
        sb. append(", год рождения: ");
        sb.append(birthYear);
        sb.append(", мама: ");
        sb.append(getMotherByName());
        sb.append(", папа: ");
        sb.append(getFatherByName());
        sb.append(", дети: ");
        sb.append(getChildInfo());
        sb.append("\n");
        return sb.toString();
    }
    
    public boolean equals(String name) {
        if(this.name == name) {
            return true;
        } else {
           return false;
        }
    }
    
    public String getMotherByName() {
        if(mother == null) {
            return "мама не известна";
        }
        return mother.name;
    }
    
    public String getFatherByName() {
        if(father == null) {
            return "папа не известен";
        }
        return father.name;
    }
    
    public Human getMother() {
        return mother;
    }
    
    public Human getFather() {
        return father;
    }
    
    public void addChild(Human human) {
        children.add(human);
    }
    
    public String getChildInfo() {
        StringBuilder sb = new StringBuilder();
        if(children.size() != 0) {
            for(int i = 0; i < children.size(); i++) {
                sb.append(children.get(i).getName());
                if(i < children.size() - 1) {
                    sb.append(", ");
                } else if(i == children.size() - 1) {
                    sb.append(".");
                }
            }
        } else {
            sb.append("не найдены");
        }
        return sb.toString();
    }
}
