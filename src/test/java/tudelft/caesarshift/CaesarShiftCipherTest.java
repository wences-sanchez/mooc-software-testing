package tudelft.caesarshift;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.junit.jupiter.api.Assertions.*;

public class CaesarShiftCipherTest {

    private CaesarShiftCipher caesarShiftCipher;

    @BeforeEach
    void setUp() {
        caesarShiftCipher = new CaesarShiftCipher();
    }

    @ParameterizedTest(name = "letters={0}, shift={1}, expected={2}")
    @CsvSource({"abc,1,bcd", "whz,0,whz", "xyz,3,abc"})
    public void lettersShouldBeIncreased(String s, int shift, String expected) {
        assertEquals(expected, caesarShiftCipher.CaesarShiftCipher(s, shift));
    }

    @ParameterizedTest(name = "letters={0}, shift={1}, expected={2}")
    @CsvSource({"jhz,-1,igy", "azh,0,azh", "axb,-2,yvz"})
    public void lettersShouldBeDecreased(String s, int shift, String expected) {
        assertEquals(expected, caesarShiftCipher.CaesarShiftCipher(s, shift));
    }
}
