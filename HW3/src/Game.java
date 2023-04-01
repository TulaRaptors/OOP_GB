import java.io.IOException;
import java.util.logging.Logger;

public interface Game {
    void start(Integer sizeWord, Integer maxTry) throws IOException;
    GameStatus getGameStatus();

    String getWord();

    Answer inputAnswer(String value, Logger logger) throws IOException;

    void printLog(String fileName) throws IOException;
}