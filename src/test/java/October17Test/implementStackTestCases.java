package October17Test;

import exception.OutOfBoundsException;
import org.October17.implementStack;
import org.junit.jupiter.api.Assertions;
import org.testng.annotations.Test;

import java.util.Stack;

public class implementStackTestCases {
    @Test
    public void implementsStackPositiveTest1() throws OutOfBoundsException {
        Stack<Integer> stack = new Stack<>();
        implementStack.stackPush(stack, 1);
        implementStack.stackPush(stack, 12);
        implementStack.stackPush(stack, 16);
        implementStack.stackPush(stack, 100);

        implementStack.stackPop(stack);
        implementStack.stackPop(stack);
        int expected = 12;
        int actual = implementStack.stackMax(stack);
        Assertions.assertEquals(expected,actual);

    }
    @Test
    public void implementsStackPositiveTest2() throws OutOfBoundsException {
        Stack<Integer> stack = new Stack<>();
        implementStack.stackPush(stack, 100);
        implementStack.stackPush(stack, 12);
        implementStack.stackPush(stack, 16);
        implementStack.stackPush(stack, 1);

        implementStack.stackPop(stack);
        implementStack.stackPop(stack);
        int expected = 100;
        int actual = implementStack.stackMax(stack);
        Assertions.assertEquals(expected,actual);

    }
    @Test
    public void implementsStackPositiveTest3() throws OutOfBoundsException {
        Stack<Integer> stack = new Stack<>();
        implementStack.stackPush(stack, 50);
        implementStack.stackPush(stack, 25);
        implementStack.stackPush(stack, 100);
        implementStack.stackPush(stack, 1000);
        implementStack.stackPush(stack, 1000000000);
        implementStack.stackPop(stack);
        implementStack.stackPop(stack);
        implementStack.stackPop(stack);
        implementStack.stackPop(stack);
        int expected = 50;
        int actual = implementStack.stackMax(stack);
        Assertions.assertEquals(expected,actual);

    }
    @Test
    public void implementsStackNegativeTestNoElementPop() throws OutOfBoundsException {
        Stack<Integer> stack = new Stack<>();
        String exception = "There are no elements left!";
        implementStack.stackPush(stack, 50);
        implementStack.stackPush(stack, 25);
        implementStack.stackPush(stack, 100);
        implementStack.stackPush(stack, 1000);
        implementStack.stackPush(stack, 1000000000);
        implementStack.stackPop(stack);
        implementStack.stackPop(stack);
        implementStack.stackPop(stack);
        implementStack.stackPop(stack);
        implementStack.stackPop(stack);

    }
    @Test
    public void implementsStackNoMaxTest() throws OutOfBoundsException {
        Stack<Integer> stack = new Stack<>();
        try {
            implementStack.stackMax(stack);
        }
        catch (Exception e){
            e.getMessage();
        }
    }
}
