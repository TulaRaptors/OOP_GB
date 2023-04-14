import model.Calculator;
import model.Logger;
import view.View;

import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException {
        Presenter p = new Presenter(new Calculator(), new View(), new Logger());
        p.buttonClick();
    }
}