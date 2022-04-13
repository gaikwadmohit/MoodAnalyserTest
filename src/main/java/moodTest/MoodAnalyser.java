package moodTest;

public class MoodAnalyser {

	private String message;

    //Default Constructor
    public MoodAnalyser() {
    }

    //Parameterized Constructor
    public MoodAnalyser(String message) {
        this.message = message;
    }

    public String analyseMood() {
        if (message.contains("SAD"))
            return "SAD";
        else
            return "HAPPY";
    }
}