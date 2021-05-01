package tudelft.countletters;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

public class CountLettersTest {

    @ParameterizedTest(name = "input={0}, expected={1}")
    @CsvSource({"cats|dogs,2", "bear|dog,1", "bear|fear,2"})
    public void multipleMatchingWords(String input, int expected) {
        int words = new CountLetters().count(input);
        Assertions.assertEquals(expected, words);
    }

    public void lastWordDoesNotMatch() {
        int words = new CountLetters().count("cats|dog");
        Assertions.assertEquals(1, words);
    }

    public void lastWordMatches(){
        int words = new CountLetters().count("cats|bear");
        Assertions.assertEquals(2, words);
    }

}