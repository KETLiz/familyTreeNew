import model.Service;
import ui.Console;
import ui.View;
import presenter.Presenter;


public class Main {
    public static void main(String[] args) {
        View view = new Console();
        Service service = new Service();
        Presenter presenter = new Presenter(view, service);

        view.start();
        // Service s = new Service();
        // s.add("Natalia", 1966, null, null);
        // s.add("Timur", 1965, null, null);
        // s.add("Liza", 1991, s.getHumanByName("Natalia"), s.getHumanByName("Timur"));
        // s.add("Lenya", 2005, s.getHumanByName("Natalia"), s.getHumanByName("Timur"));
        // System.out.println(s.showInfo());
        // s.sortByName();
        // System.out.println(s.showInfo());
        // s.sortByAge();
        // System.out.println(s.showInfo());
    }
}