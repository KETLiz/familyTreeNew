package ui;

import java.util.Scanner;

import presenter.Presenter;

public class Console implements View{
    private Presenter presenter;
    private Scanner sc;
    private boolean work;
    private MainMenu menu;
    private static final String INPUT_ERROR = "Вы ввели неверное значение";

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
            print();
            execute();            
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
        System.out.println("Введите имя мамы: ");
        String motherName = sc.nextLine();
        System.out.println("Введите имя папы: ");
        String fatherName = sc.nextLine();
        
        presenter.addHuman(name, birthYear, presenter.getHumanByName(motherName), presenter.getHumanByName(fatherName));
    }

    public void showMembers() {
        presenter.showMembers();
    }
    
    public boolean exit() {
        work = false;
        return work;
    }

    private void print() {
        System.out.println(menu.showCommands());
    }

    private void execute() {
        String line = sc.nextLine();
        if(checkTextForPoint(line)) {
            int numCommand = Integer.parseInt(line);
            if(numCommand < menu.size() + 1) {
                menu.execute(numCommand);
            } else {
                inputError();
            }
        }
    }

    private boolean checkTextForPoint(String line) {
        if(line != null && line.matches("[0-9]+")) {
            return true;
        } else {
            inputError();
            return false;
        }
    }

    private void inputError() {
        System.out.println(INPUT_ERROR);
    }

}
