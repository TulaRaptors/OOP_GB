public abstract class Parent {

    protected String name;
    protected Integer maxRunDistance;
    protected Double maxJump;
    protected Boolean status;

    public Parent() {
    }

    public Parent(String name, Integer maxRunDistance, Double maxJump, Boolean status) {
        this.name = name;
        this.maxRunDistance = maxRunDistance;
        this.maxJump = maxJump;
        this.status = status;
    }

    public void run(int distance) {
        System.out.printf("%s... ", name);
        try {
            Thread.sleep(1000);
        } catch (InterruptedException ex) {
        }
        if (distance > maxRunDistance) {
            System.out.print("не смог пробежать");
        } else {
            System.out.print("пробежал");
        }
    }

    public void jump(double distance) {
        System.out.printf("%s... ", name);
        try {
            Thread.sleep(1000);
        } catch (InterruptedException ex) {
        }
        if (distance > maxJump) {
            System.out.print("не смог перепрыгнуть");
        } else {
            System.out.print("перепрыгнул");
        }
    }

    public boolean runRace(int distance) {
        if (distance > maxRunDistance) {
            return false;
        } else {
            return true;
        }
    }

    public boolean jumpRace(double distance) {
        if (distance > maxJump) {
            return false;
        } else {
            return true;
        }
    }

}