import org.junit.Test;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

public class AnagramsTest {
    private Anagrams anagrams = new Anagrams();

    @Test
    public void shouldReturnTrueIfTextsWithoutSpacesAreAnagrams(){
        String text1 = "part";
        String text2 = "trap";
        assertTrue(anagrams.isAnagram(text1, text2));
    }

    @Test
    public void shouldReturnTrueIfTextsWithSpacesAreAnagrams(){
        String text1 = "1 clint eastwood";
        String text2 = "old west 1 action";
        assertTrue(anagrams.isAnagram(text1, text2));
    }

    @Test
    public void shouldReturnFalseIfBothTextsAreAnagrams(){
        String text1 = "part";
        String text2 = "sort";
        assertFalse(anagrams.isAnagram(text1, text2));
    }

    @Test
    public void shouldReturnFalseIfOneOrBothTextsAreNull(){
        String text1 = null;
        String text2 = "Not Anagram";
        assertFalse(anagrams.isAnagram(text1, text2));
    }

    @Test
    public void shouldReturnTrueIfOneOrBothTextsHaveZeroLength(){
        String text1 = "";
        String text2 = "Not Anagram";
        assertTrue(anagrams.isAnagram(text1, text2));
    }
}

