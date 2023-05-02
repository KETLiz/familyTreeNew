package ui;

import java.util.Scanner;

import presenter.Presenter;

public class Console implements View{
    private Presenter presenter;
    private Scanner sc;
    private boolean work;

    public Console() {
        sc = new Scanner(System.in);
        work = true;
    }
    @Override
    public void print(String text) {
        System.out.println(text);
    }

    @Override
    public void start() {
        System.out.println("Привет!\nДоступные команды:\n1. Показать всех членов семьи\n2. Добавить члена семьи\n3. Выход");
    }

    @Override
    public void setPresenter(Presenter presenter) {
        this.presenter = presenter;
    }
    
}
