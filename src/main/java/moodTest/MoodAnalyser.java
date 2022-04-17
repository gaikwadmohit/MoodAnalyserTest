package moodTest;

public class MoodAnalyser {
	private String massage;
	 
	public MoodAnalyser() {
	    }
	 public MoodAnalyser(String massage) {
	        this.massage = massage;
	    }
	 public String analyserMood() throws Exception {
	        try {
	            if(massage.contains("SAD")){
	                return "SAD";
	            }
	            return "HAPPY";
	        }catch (Exception e){
	            return "HAPPY";
        }

	 }
}