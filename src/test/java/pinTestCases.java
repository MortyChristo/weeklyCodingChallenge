import org.example.validPin;
import org.junit.jupiter.api.Assertions;
import org.testng.annotations.Test;

public class pinTestCases {
    @Test
    public void pinPositiveTest1(){
        String N = "1234";
        boolean expected = true;
        boolean actual = validPin.validPin(N);
        Assertions.assertEquals(expected, actual);
    }
    @Test
    public void pinPositiveTest2(){
        String N = "123456";
        boolean expected = true;
        boolean actual = validPin.validPin(N);
        Assertions.assertEquals(expected, actual);
    } @Test
    public void pinNegativeTest1(){
        String N = "12345";
        boolean expected = false;
        boolean actual = validPin.validPin(N);
        Assertions.assertEquals(expected, actual);
    } @Test
    public void pinNegativeTest2(){
        String N = "123g";
        boolean expected = false;
        boolean actual = validPin.validPin(N);
        Assertions.assertEquals(expected, actual);
    }
    @Test
    public void pinNegativeTest3(){
        String N = "12 4";
        boolean expected = false;
        boolean actual = validPin.validPin(N);
        Assertions.assertEquals(expected, actual);
    }
}
