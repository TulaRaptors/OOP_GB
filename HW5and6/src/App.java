import model.Model;
import view.View;

import java.io.IOException;

public class App {
    public static void main(String[] args) throws IOException {
        Controller controller = new Controller(new View(),new Model());
        controller.ButtonClick();
    }
}
