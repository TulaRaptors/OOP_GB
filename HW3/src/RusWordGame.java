import java.util.ArrayList;
import java.util.List;

public class RusWordGame extends AbstractGame {

    @Override
    List<String> generateCharList() {
        ArrayList<String> abc = new ArrayList<>();

        for (int i = 0; i < Words.abcRu.length; i++) {
            abc.add(Words.abcRu[i]);
        }
        return abc;
    }
}