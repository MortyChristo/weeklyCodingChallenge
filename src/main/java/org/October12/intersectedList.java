package org.October12;

import java.util.LinkedList;

public class intersectedList {
    public static Object intersectedList(LinkedList firstSet, LinkedList secondSet) {
        boolean intersects = false;
        int[] intersectionPoint = {firstSet.size(), secondSet.size()};
        Object intersectionChar = null;
        for (int i = 0; i < firstSet.size(); i++) {
            for (int j = 0; j < secondSet.size(); j++) {
                if (firstSet.get(i) == secondSet.get(j)) {
                    intersectionPoint = new int[]{i, j};
                    intersectionChar = (firstSet.get(i));
                    intersects = true;
                    break;
                }
            }

        }
//        System.out.println("Does the linked list intersect?  :");
//        System.out.print(intersects);
//
//        if (intersects) {
//            System.out.println("It intersects at points: " + Arrays.toString(intersectionPoint));
//            System.out.println("The node that intersects: " + intersectionChar);
//
//
//        }
        return intersectionChar;
    }
}
