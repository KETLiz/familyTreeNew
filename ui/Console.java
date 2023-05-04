package ui;

import java.util.Scanner;

import presenter.Presenter;

public class Console implements View{
    private Presenter presenter;
    private Scanner sc;
    private boolean work;
    private MainMenu menu;

    public Console() {
        sc = new Scanner(System.in);
        work = true;
        menu = new MainMenu(this);
    }
    @Override
    public void print(String text) {
        System.out.println(text);
    }

    @Override
    public void start() {
        System.out.println("Привет!");
        while(work) {
            System.out.println("Доступные команды:\n1. Показать всех членов семьи\n2. Добавить члена семьи\n3. Выход");
            String command = sc.nextLine();
            switch(command) {
                case "1":
                    showMembers();
                    break;
                case "2":
                    addHuman();
                    break;
                case "3":
                    exit();
                    break;
                default:
                    System.out.println("Такой команды нет");
            }
        }
    }

    @Override
    public void setPresenter(Presenter presenter) {
        this.presenter = presenter;
    }

    public void addHuman() {
        System.out.println("Введите имя: ");
        String name = sc.nextLine();
        System.out.println("Введите год рождения человека: ");
        int birthYear = sc.nextInt();
        // System.out.println("Введите имя мамы: ");
        // String motherName = sc.nextLine();
        // System.out.println("Введите имя папы: ");
        // String fatherName = sc.nextLine();
        presenter.addHuman(name, birthYear, null, null); //, motherName, fatherName);
        System.out.println("\nДоступные команды:\n1. Показать всех членов семьи\n2. Добавить члена семьи\n3. Выход");
    }

    public void showMembers() {
        presenter.showMembers();
    }
    
    public boolean exit() {
        work = false;
        return work;
    }
}
