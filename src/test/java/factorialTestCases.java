import org.example.isFactorial;
import org.junit.jupiter.api.Assertions;
import org.testng.annotations.Test;

public class factorialTestCases {

    @Test
    public void factorialPositiveTest1(){
        int N = 2;
        boolean expected = true;
        boolean actual = isFactorial.isFactorial(N);
        Assertions.assertEquals(expected, actual);
    }
    @Test
    public void factorialPositiveTest2(){
        int N = 24;
        boolean expected = true;
        boolean actual = isFactorial.isFactorial(N);
        Assertions.assertEquals(expected, actual);
    }
    @Test
    public void factorialPositiveTest3(){
        int N = 120;
        boolean expected = true;
        boolean actual = isFactorial.isFactorial(N);
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void factorialNegativeTest1(){
        int N = 27;
        boolean expected = false;
        boolean actual = isFactorial.isFactorial(N);
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void factorialNegativeTest2(){
        int N = 2700;
        boolean expected = false;
        boolean actual = isFactorial.isFactorial(N);
        Assertions.assertEquals(expected, actual);
    }
    @Test
    public void factorialNegativeTest3(){
        int N = 13648649;
        boolean expected = false;
        boolean actual = isFactorial.isFactorial(N);
        Assertions.assertEquals(expected, actual);
    }
}
