package at.kienboeck.swlcm.rot13.controllers;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class Rot13ControllerTest {
    @Test
    public void test_Given_ARequestToMakeRot13String_When_IEnterTheStringSTORY_Then_IExpectTheValueFGBEL() {
        // arrange
        Rot13Controller controller = new Rot13Controller();

        // act
        String actual = controller.getRot13StringFromSourceString("STORY");

        // assert
        Assertions.assertEquals("FGBEL", actual);
    }
}
