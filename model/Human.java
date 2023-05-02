package model;

public class Human {
    private String name;
    private int birthYear;

    public Human(String name, int birthYear) {
        this.name = name;
        this.birthYear = birthYear;
    }

    public String toString() {
        return "[ Имя: " + name + ", год рождения: " + birthYear + " ]";
    }
}
