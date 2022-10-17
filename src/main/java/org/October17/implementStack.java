package org.October17;

import exception.OutOfBoundsException;

import java.util.Arrays;
import java.util.List;
import java.util.Stack;

public class implementStack {
    public static void stackPop(Stack<Integer> stack) throws OutOfBoundsException
    {
        OutOfBoundsException exception = new OutOfBoundsException();
       try {
           Integer y = (Integer) stack.pop();
       }
        catch(Exception e) {
            exception.addMessage("There are no elements left!");
            throw exception;
       }


    }

    public static void stackPush(Stack<Integer> stack, int num)
    {
            stack.push(num);
    }
    public static int stackMax(Stack<Integer> stack) throws OutOfBoundsException {
        List<Integer> listNums = stack;

        Integer[] nums = (Integer[]) listNums.toArray(new Integer[listNums.size()]);
        Arrays.sort(nums);
        OutOfBoundsException exception = new OutOfBoundsException();

        try {
            return (nums[nums.length - 1]);
        }
        catch (Exception e){
            exception.addMessage("There are no Elements in the stack");
            throw exception;
        }
    }
}
