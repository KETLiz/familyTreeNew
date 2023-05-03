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
        System.out.println("Привет из 1 конструктора Human");
    }
    
    public Human(String name, int birthYear) {
        this(name, birthYear, null, null);
        System.out.println("Привет из 2 конструктора Human");
    }
    
    public String toString() {
        return name;
    }
    
    public String getInfo() {
        return "Имя: " + name + ", год рождения: " + birthYear + ". Мама: " + getMotherByName() + ". Папа: " + getFatherByName() + ". Дети: " + getChildInfo() + "\n";
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
        if(children == null) {
            return "не найдены"; 
        }
        return children.toString();
    }
}
