package model;

public class Service {
    FamilyTree familyTree;
    
    public Service() {
        familyTree = new FamilyTree();
        System.out.println("Привет из Service");
    }
    
    public void add(String name, int birthYear, Human mother, Human father) {
        familyTree.add(new Human(name, birthYear, mother, father));
        System.out.println("Привет из метода add в классе Service");
    }
    
    public String showInfo() {
        for(Human human : familyTree) {
            return human.getInfo();
        }
        //return familyTree.showInfo();
    }
    
    public Human getHumanByName(String name) {
        return familyTree.getHumanByName(name);
    }
}
