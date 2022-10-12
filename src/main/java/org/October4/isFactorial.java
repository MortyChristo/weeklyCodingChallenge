package org.October4;

public class isFactorial {
    public static boolean isFactorial(int num){
        int total = 1;
        int i = 1;
        while (total < num){
            total = total * i;
            if (total == num){
                return true;
            }
        i++;
        }
        return false;
    }
}
