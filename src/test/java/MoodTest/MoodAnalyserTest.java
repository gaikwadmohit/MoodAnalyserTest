package MoodTest;

import static org.junit.Assert.*;
import org.junit.Test;


import moodTest.MoodAnalyser;

public class MoodAnalyserTest {

	
	    @Test
	    public void testMoodAnalysis_whenMoodIsSad() {
	    	MoodAnalyser md = new MoodAnalyser();
	        String mood = md.analyseMood("This is a sad message");
	        assertEquals(mood, "SAD");
	    }

	    @Test
	    public void testMoodAnalysis_whenMoodIsHappy() {
	    	MoodAnalyser  md = new MoodAnalyser ();
	        String mood1 = md.analyseMood("This is a happy message");
	        assertEquals(mood1, "HAPPY");
	    }
	}

