public class Answer {
    private Integer bull;
    private Integer cow;
    private String userInput;

    public Answer(Integer cow, Integer bull, String userInput) {
        this.cow = cow;
        this.bull = bull;
        this.userInput = userInput;
    }

    public Integer getBull() {
        return bull;
    }

    public Integer getCow() {
        return cow;
    }
}