import java.util.ArrayList;
import java.util.List;

public class EngWordGame extends AbstractGame {

    @Override
    List<String> generateCharList() {
        ArrayList<String> abc = new ArrayList<>();

        for (int i = 0; i < Words.abcEn.length; i++) {
            abc.add(Words.abcEn[i]);
        }
        return abc;
    }
}