public class Treadmill {
    int minLength;
    int maxLength;

    public Treadmill() {
    }

    public Treadmill(int minLength, int maxLength) {
        this.minLength = minLength;
        this.maxLength = maxLength;
    }

    public int randomLength(int minLength, int maxLength) {
        return (int) (Math.random() * ((maxLength - minLength) + 1)) + minLength;
    }
}