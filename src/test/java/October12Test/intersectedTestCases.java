package October12Test;


import org.October12.intersectedList;
import org.junit.jupiter.api.Assertions;
import org.testng.annotations.Test;

import java.util.LinkedList;

public class intersectedTestCases {
    @Test
    public void intersectedListPositiveTestNumbers(){
        LinkedList<Integer> listA = new LinkedList<Integer>();
        LinkedList<Integer> listB = new LinkedList<Integer>();

        for (int i = 1; i < 10; i++) {
            listA.add(i);
            if (i == 7) {
                listB.add(i);
            } else {
                listB.add(0);
            }
        }

        Object expected = 7;
        Object actual = intersectedList.intersectedList(listA, listB);
        Assertions.assertEquals(expected, actual);
    }
    @Test
    public void intersectedListPositiveTestLetters(){
        LinkedList<Character> listA = new LinkedList<Character>();
        LinkedList<Character> listB = new LinkedList<Character>();
        listA.add('a');
        listA.add('b');
        listA.add('c');
        listA.add('d');
        listA.add('e');
        listA.add('f');
        listA.add('g');
        listB.add('n');
        listB.add('m');
        listB.add('l');
        listB.add('k');
        listB.add('j');
        listB.add('i');
        listB.add('h');
        listB.add('g');
        Object expected = 'g';
        Object actual = intersectedList.intersectedList(listA, listB);
        Assertions.assertEquals(expected, actual);
    }
    @Test
    public void intersectedListNegativeTestNumbers(){
        LinkedList<Integer> listA = new LinkedList<Integer>();
        LinkedList<Integer> listB = new LinkedList<Integer>();

        for (int i = 1; i < 10; i++) {
            listA.add(i);
            listB.add(0);
            }

        Object actual = intersectedList.intersectedList(listA, listB);
        Assertions.assertNull(actual);
    }
    @Test
    public void intersectedListNegativeTestLetters(){
        LinkedList<Character> listA = new LinkedList<Character>();
        LinkedList<Character> listB = new LinkedList<Character>();
        listA.add('a');
        listA.add('b');
        listA.add('c');
        listA.add('d');
        listA.add('e');
        listA.add('f');
        listA.add('g');
        listB.add('n');
        listB.add('m');
        listB.add('l');
        listB.add('k');
        listB.add('j');
        listB.add('i');
        listB.add('h');


        Object actual = intersectedList.intersectedList(listA, listB);
        Assertions.assertNull(actual);
    }
        }
