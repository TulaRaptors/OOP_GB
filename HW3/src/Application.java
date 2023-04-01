import java.io.IOException;
import java.util.Scanner;
import java.util.logging.Logger;
import java.util.logging.FileHandler;
import java.util.logging.SimpleFormatter;
import java.util.Date;

public class Application {
    public static void main(String[] args) throws IOException {
        System.out.println("1 - Цифры");
        System.out.println("2 - Буквы EN");
        System.out.println("3 - Буквы RU");
        System.out.println("Выберите игру: ");
        Scanner scanner = new Scanner(System.in);
        Game game = null;
        int size = 4;
        int tryCount = 5;
        int choice;
        choice = scanner.nextInt();
        switch (choice) {
            case 1:
                game = new NumberGame();
                System.out.println("Введите кол-во цифр в комбинации: ");
                size = scanner.nextInt();
                System.out.println("Введите кол-во попыток для угадывания: ");
                tryCount = scanner.nextInt();
                break;
            case 2:
                game = new RusWordGame();
                size = 1;
                System.out.println("Введите кол-во попыток для угадывания: ");
                tryCount = scanner.nextInt();
                break;
            case 3:
                game = new EngWordGame();
                size = 1;
                System.out.println("Введите кол-во попыток для угадывания: ");
                tryCount = scanner.nextInt();
                break;
            default:
                System.out.println("Такой игры не существует!");
                break;
        }
        game.start(size, tryCount);
        Date date = new Date();
        Logger logger = Logger.getLogger(AbstractGame.class.getName());
        String fileName = date.toString() + ".txt";
        FileHandler fh = new FileHandler(fileName);
        logger.addHandler(fh);
        SimpleFormatter sf = new SimpleFormatter();
        fh.setFormatter(sf);
        logger.info("Загаданная комбинация: " + game.getWord());
        String answer;
        while (game.getGameStatus().equals(GameStatus.START)) {
            System.out.println("Введите Ваш вариант:");
            answer = scanner.next();
            try {
                Answer answerGame = game.inputAnswer(answer, logger);
                System.out.println(String.format("Найдено %d коров и %d быков", answerGame.getCow(), answerGame.getBull()));
            } catch (IOException e) {
            } finally {
            }
        }
        System.out.println("Загаданная комбинация: " + game.getWord());
        System.out.println(game.getGameStatus());
        System.out.println("Вывести ход игр? (Y/N)");
        String str = scanner.next();
        if (str.equals("Y")) {
            game.printLog(fileName);
        }
    }
}
