package October17Test;

import org.October17.intersect;
import org.junit.jupiter.api.Assertions;
import org.testng.annotations.Test;


public class intersectTestCases {
    @Test
    public void IntersectPositiveTest(){
    intersect.LinkedList list = new intersect.LinkedList();
    intersect.LinkedList.Node head1, head2;

    head1 = new intersect.LinkedList.Node(3);
    head1.next = new intersect.LinkedList.Node(7);
    head1.next.next = new intersect.LinkedList.Node(8);
    head1.next.next.next = new intersect.LinkedList.Node(10);

    head2 = new intersect.LinkedList.Node(99);
    head2.next = new intersect.LinkedList.Node(1);
    head2.next.next = new intersect.LinkedList.Node(8);
    head2.next.next.next = new intersect.LinkedList.Node(10);

    int expected = 8;
    int actual = list.getNode(head1,head2);
        Assertions.assertEquals(actual, expected);
}
    @Test
    public void IntersectPositiveTest2(){
        intersect.LinkedList list = new intersect.LinkedList();
        intersect.LinkedList.Node head1, head2;

        head1 = new intersect.LinkedList.Node(3);
        head1.next = new intersect.LinkedList.Node(7);
        head1.next.next = new intersect.LinkedList.Node(15);
        head1.next.next.next = new intersect.LinkedList.Node(11);
        head1.next.next.next.next = new intersect.LinkedList.Node(10);

        head2 = new intersect.LinkedList.Node(99);
        head2.next = new intersect.LinkedList.Node(1);
        head2.next.next = new intersect.LinkedList.Node(8);
        head2.next.next.next = new intersect.LinkedList.Node(10);

        int expected = 10;
        int actual = list.getNode(head1,head2);
        Assertions.assertEquals(actual, expected);
    }
}
