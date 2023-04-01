import java.nio.file.Paths;
import java.security.SecureRandom;
import java.util.List;
import java.io.IOException;
import java.util.Scanner;
import java.util.logging.Logger;

public abstract class AbstractGame implements Game {
    Integer sizeWord;
    String word;
    Integer maxTry;
    static Integer countTry = 0;
    GameStatus gameStatus = GameStatus.OFF;

    Logger logger;

    public AbstractGame() {
    }

    ;

    public AbstractGame(Integer sizeWord, String word, Integer maxTry, GameStatus gameStatus) {
        this.sizeWord = sizeWord;
        this.word = word;
        this.maxTry = maxTry;
        this.gameStatus = gameStatus;
    }

    @Override
    public GameStatus getGameStatus() {
        return gameStatus;
    }

    public Integer getSizeWord() {
        return sizeWord;
    }

    public String getWord() {
        return word;
    }

    public Integer getMaxTry() {
        return maxTry;
    }

    private String generateWord() throws IOException {
        List<String> charList = generateCharList();
        SecureRandom random = new SecureRandom();
        String res = "";
        int index;
        for (int i = 0; i < sizeWord; i++) {
            index = random.nextInt(charList.size());
            res += charList.get(index);
            charList.remove(index);
        }
        return res;
    }

    @Override
    public void start(Integer sizeWord, Integer maxTry) throws IOException {
        this.maxTry = maxTry;
        this.sizeWord = sizeWord;
        word = generateWord();
        this.gameStatus = GameStatus.START;
    }

    @Override
    public Answer inputAnswer(String value, Logger logger) {
        int bull = 0;
        int cow = 0;
        for (int i = 0; i < value.length(); i++) {
            if (word.contains(Character.toString(value.charAt(i)))) {
                cow++;
            }
            if (word.charAt(i) == value.charAt(i)) {
                bull++;
            }
        }
        countTry++;
        logger.info("Попытка " + countTry + ": " + value + " (" + cow + " : " + bull + ")");
        if (countTry == maxTry && bull != value.length()) {
            this.gameStatus = GameStatus.LOOSE;
        } else if (bull == value.length()) {
            this.gameStatus = GameStatus.WIN;
        }
        Answer answer = new Answer(cow, bull, value);
        return answer;
    }

    abstract List<String> generateCharList() throws IOException;

    @Override
    public void printLog(String fileName) throws IOException {
        Scanner scanner = new Scanner(Paths.get(fileName), "UTF-8");
        int i = 0;
        while (scanner.hasNextLine()) {
            System.out.println(scanner.nextLine());
        }
    }
}
