package org.October17;

public class intersect {
    public static class LinkedList {

        static Node head1, head2;


    public static class Node {

        int data;
        public Node next;

        public Node(int d) {
            data = d;
            next = null;
        }
    }

        public int getNode(Node head1, Node head2) {
            int numOfNodes1 = getNumberofNodes(head1);
            int numOfNodes2 = getNumberofNodes(head2);
            int d;
            if (numOfNodes1 > numOfNodes2) {
                d = numOfNodes1 - numOfNodes2;

                return intersectingNode(d, head1, head2);

            } else {
                d = numOfNodes2 - numOfNodes1;
                return intersectingNode(d, head2, head1);
            }
        }

        int intersectingNode(int d, Node node1, Node node2) {
            int i;
            Node current1 = node1;
            Node current2 = node2;
            for (i = 0; i < d; i++) {
                if (current1 == null) {
                    return -1;
                }
                current1 = current1.next;
            }
            while (current1 != null && current2 != null) {
                if (current1.data == current2.data) {
                    return current1.data;
                }
                current1 = current1.next;
                current2 = current2.next;
            }

            return -1;
        }


        int getNumberofNodes(Node node) {
            Node current = node;
            int count = 0;

            while (current != null) {
                count++;
                current = current.next;
            }

            return count;
        }
    }
}