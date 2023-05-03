import model.Service;


public class Main {
    public static void main(String[] args) {
        Service s = new Service();
        s.add("Natalia", 1966, null, null);
        s.add("Timur", 1965, null, null);
        s.add("Liza", 1991, s.getHumanByName("Natalia"), s.getHumanByName("Timur"));
        s.add("Natalia", 1966, s.getHumanByName("Natalia"), s.getHumanByName("Timur"));
        System.out.println(s.showInfo());
    }
}