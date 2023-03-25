public class Race {
    int count;
    double[] obstacle;

    public Race() {
    }

    public Race(int count) {
        this.count = count;
    }

    public Race(double[] obstacle) {
        this.obstacle = obstacle;
    }

    public double[] createRace(Treadmill treadmill, Barrier barrier) {
        double[] obstacle = new double[count];
        boolean step = true;
        for (int i = 0; i < count; i++) {
            if (step) {
                obstacle[i] = (double) new Treadmill().randomLength(treadmill.minLength, treadmill.maxLength);
                step = false;
            } else {
                obstacle[i] = new Barrier().randomHeight(barrier.minHeight, barrier.maxHeight);
                step = true;
            }
        }
        return obstacle;
    }
}