public class Main {
    public static void main(String[] args) {
        Human human1 = new Human("Хан Соло", 100, 1.1, true);
        Human human2 = new Human("Энакин Скайуокер", 150, 1.2, true);
        Cat cat1 = new Cat("Чуи", 200, 1.7, true);
        Robot robot1 = new Robot("C-3PO", 250, 1.5, true);
        Robot robot2 = new Robot("R2-D2", 300, 0.2, true);

        Parent[] runners = {human1, human2, cat1, robot1, robot2};

        // Параметры беговой дорожки
        Treadmill treadmill = new Treadmill(60, 240);
        Barrier barrier = new Barrier(0.3, 1.4);
        Race sprint = new Race(10);
        double[] race = sprint.createRace(treadmill, barrier);

        // ГОНКА
        for (int i = 0; i < race.length; i++) {
            if (i % 2 == 0) {
                System.out.printf("Дистанция: %d м.\n", (int) race[i]);
            } else {
                System.out.printf("Барьер: %.2f м.\n", race[i]);
            }
            for (Parent runner : runners) {
                if (runner.status) {
                    if (i % 2 == 0) {
                        runner.run((int) race[i]);
                        System.out.println();
                        if (!runner.runRace((int) race[i])) {
                            System.out.println(runner.name + " сошёл");
                            runner.status = false;
                        }
                    } else {
                        runner.jump(race[i]);
                        System.out.println();
                        if (!runner.jumpRace(race[i])) {
                            System.out.println(runner.name + " сошёл");
                            runner.status = false;
                        }
                    }
                }
            }
            System.out.println();
        }
    }
}