package October12Test;

import org.example.October12.intersectedList;
import org.example.October12.isCircle;
import org.junit.Test;
import org.junit.jupiter.api.Assertions;
import java.util.LinkedList;

public class isCircleTestCases {
    @Test
    public void isCirclePositiveTestNumbers(){
        LinkedList<Integer> listA = new LinkedList<Integer>();

        for (int i = 1; i < 5; i++) {
            if (i == 4) {
                listA.add(3);
            } else {
                listA.add(i);
            }
        }

        Object expected = 3;
        Object actual = isCircle.circleList(listA);
        Assertions.assertEquals(expected, actual);
    }
    @Test
    public void isCirclePositiveTestLetters(){
        LinkedList<Character> listA = new LinkedList<Character>();

        listA.add('a');
        listA.add('b');
        listA.add('c');
        listA.add('d');
        listA.add('e');
        listA.add('c');
        Object expected = 'c';
        Object actual = isCircle.circleList(listA);
        Assertions.assertEquals(expected, actual);
    }
    @Test
    public void isCircleNegativeTestNumbers(){
        LinkedList<Integer> listA = new LinkedList<Integer>();

        for (int i = 0; i < 5; i++) {
            listA.add(i);
        }

        Object actual = isCircle.circleList(listA);
        Assertions.assertNull(actual);
    }
    @Test
    public void isCircleNegativeTestLetters(){
        LinkedList<Character> listA = new LinkedList<Character>();
        listA.add('a');
        listA.add('b');
        listA.add('c');
        listA.add('d');
        listA.add('e');

        Object actual = isCircle.circleList(listA);
        Assertions.assertNull(actual);
    }
}
