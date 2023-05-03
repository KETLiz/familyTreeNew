package presenter;
import model.Service;
import ui.View;

public class Presenter {
    private View view;
    private Service service;

    public Presenter(View view, Service service) {
        this.view = view;
        this.service = service;
        view.setPresenter(this);
    }

    public void addHuman(String name, int birthYear, Human mother, Human father) {
        service.add(name, birthYear);
    }

    public void showMembers() {
        view.print(null);
    }
}
