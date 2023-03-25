import java.util.random.RandomGenerator;

public class Barrier {
    double minHeight;
    double maxHeight;

    public Barrier() {
    }

    public Barrier(double minHeight, double maxHeight) {
        this.minHeight = minHeight;
        this.maxHeight = maxHeight;
    }

    public double randomHeight(double minHeight, double maxHeight) {
        return Math.random() * (maxHeight - minHeight) + minHeight;
    }

}