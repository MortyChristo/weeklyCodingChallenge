package org.example.October12;

import java.util.HashSet;
import java.util.LinkedList;
import java.util.Objects;
import java.util.Set;

public class isCircle {
    public static Object circleList(LinkedList circle){
        Set<Object> newCircle = new HashSet<>();
        int num = circle.size()+1;
        for(int i = 0; i < circle.size(); i++){
            newCircle.add((circle.get(i)));
            if(newCircle.size()!= i+1){
                num = i;
                return circle.get(num);

            }
        }
        return null;
    }
}
