package MoodTest;

import static org.junit.Assert.*;
import org.junit.Test;
import moodTest.MoodAnalyser;

public class MoodAnalyserTest {

	@Test
	public void testMoodAnalysis_whenMoodIsSad() {
		MoodAnalyser md = new MoodAnalyser("I am SAD");
		String mood = md.analyseMood();
		assertEquals(mood, "SAD");
	}

	@Test
	public void testMoodAnalysis_whenMoodIsHappy() {
		MoodAnalyser md = new MoodAnalyser("I am HAPPY");
		String mood1 = md.analyseMood();
		assertEquals(mood1,"HAPPY");

	}
}
