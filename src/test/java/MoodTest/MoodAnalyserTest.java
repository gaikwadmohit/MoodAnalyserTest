package MoodTest;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import moodTest.MoodAnalyser;

public class MoodAnalyserTest {

   
    @Test
    public void when_MoodIs_Sad() {
    	MoodAnalyser md = new MoodAnalyser(" SAD message");
        String mood=null;
        try {
            mood = md.analyserMood();
            assertEquals("SAD" , mood);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

   
    @Test
    public void when_MoodIs_Happy() {
    	MoodAnalyser md = new MoodAnalyser(" happy message");
        String mood=null;
        try {
            mood = md.analyserMood();
            assertEquals("HAPPY" , mood);
        }catch (Exception e) {
            e.printStackTrace();
        }
    }

    @Test
    public void return_Happy() {
        String mood = null;
        MoodAnalyser md = new MoodAnalyser(null);
        try{
            mood = md.analyserMood();
            assertEquals("HAPPY",mood);
        }
        catch( Exception e){
            System.out.println(e);
        }
    }

    @Test
    public void givenEmptyMood(){
        String mood = null;
        MoodAnalyser md = new MoodAnalyser();
        try{
            mood = md.analyserMood();
            assertEquals("HAPPY",mood);
        }catch (Exception e){
            System.out.println(e);
        }
        }
    }
