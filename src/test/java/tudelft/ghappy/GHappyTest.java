package tudelft.ghappy;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

public class GHappyTest {

    @ParameterizedTest(name = "str={0}")
    @CsvSource({"gg", "xxgg", "xggxx"})
    public void gIsPrecededOrFollowedByOtherGs(String str) {
        Assertions.assertTrue(new GHappy().gHappy(str));
    }

    @ParameterizedTest(name = "str={0}")
    @CsvSource({"g", "xg", "gxx", "gxxgx", "xxgxggx"})
    public void gIsNotPrecededNorFollowedByOtherGs(String str) {
        Assertions.assertFalse(new GHappy().gHappy(str));
    }

}
