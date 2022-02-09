/*
// You are given a list (SLL, element type Integer) which needs to be modified in a way in which between
    every two elements you need to
// insert the mean value of those two numbers.
// You are forbidden to use additional lists, rather you have to insert the value in the given list.
// input:
//      first line: number of elements
//      second line: elements
// Example 1:
//  input:
//      8
//      1 3 5 7 9 11 13 15
//  output:
//      1.0 2.0 3.0 4.0 5.0 6.0 7.0 8.0 9.0 10.0 11.0 12.0 13.0 14.0 15.0
 */

public class shestaZadacha {
    public static void main(String[] args) {

        SLL<Double> doubleSLL = new SLL<>();

        doubleSLL.insertLast(1.0);
        doubleSLL.insertLast(3.0);
        doubleSLL.insertLast(5.0);
        doubleSLL.insertLast(7.0);
        doubleSLL.insertLast(9.0);
        doubleSLL.insertLast(11.0);
        doubleSLL.insertLast(13.0);
        doubleSLL.insertLast(15.0);

        SLLNode<Double> node = doubleSLL.getFirst();

        SLLNode<Double> firstElement, secondElement;
        while(node.succ != null) {
            firstElement = node;
            secondElement = node.succ;

            doubleSLL.insertAfter((firstElement.element+ secondElement.element)/2.0,firstElement);

            node = secondElement;

        }

        System.out.println(doubleSLL);
    }
}
