package ua.com.artcode;

public class ListUtils {

    public static A<String> createStringList() {
        A<String> head = new Node<>("1");
        A<String> second = new Node<>("2");
        A<String> third = new Node<>("3");
        A<String> fourth = new Node<>("4");
        A<String> fifth = new Node<>("5");
        A<String> sixth = new Node<>("6");
        A<String> seventh = new Node<>("7");
        head.setNext(second);
        second.setNext(third);
        third.setNext(fourth);
        fourth.setNext(fifth);
        fifth.setNext(sixth);
        sixth.setNext(seventh);
        return head;
    }
    public static<T> A<T> reversion(A<T> head) {
//        todo write your code
        A nextNode = new Node<>();
        A prevNode = new Node<>();
        A currentNode = new Node<>();
        A result = head;



        while (head.getNext() != null){
            nextNode = head.getNext().getNext();
            currentNode = head.getNext();

            prevNode.setNext(nextNode);
            currentNode.setNext(result);
            result = currentNode;
        }
        return result;
    }
/*
    public static<T> A<T> reversion(A<T> head) {
//        todo write your code
        A nextNode = new Node<>();
        A prevNode = new Node<>();
        A currentNode = new Node<>();
        A result = head;

        if (head.getNext().getNext() == null) {
            head.setNext(head.getNext());
            head = head.getNext();
            return head;
        }

        reversion(head.getNext()).getNext().setNext(head);

        result = head.getNext();
        result.setNext(head);


        return result;
    }
*/
}
