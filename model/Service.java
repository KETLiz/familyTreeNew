package model;

public class Service {
    FamilyTree familyTree;

    public Service() {
        familyTree = new FamilyTree();
    }

    public void addHuman(String name, int birthYear) {
        familyTree.addHuman(new Human(name, birthYear));
    }
}
