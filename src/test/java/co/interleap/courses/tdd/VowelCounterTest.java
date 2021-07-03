package co.interleap.courses.tdd;

import org.junit.Test;
import static org.junit.Assert.*;

public class VowelCounterTest {

    @Test
    public void testWhenThereIsNoNullString(){
        VowelCounter vowelCounter = new VowelCounter();
        assertEquals(0,vowelCounter.count(""));
    }

    @Test
    public void WhenStringContainOnlyOneVowelNoConsonant(){
        VowelCounter vowelCounter = new VowelCounter();
        assertEquals(1,vowelCounter.count("u"));
    }

    @Test
    public void WhenStringContainManyVowelNoConsonant(){
        VowelCounter vowelCounter = new VowelCounter();
        assertEquals(5,vowelCounter.count("aeiou"));
    }
}