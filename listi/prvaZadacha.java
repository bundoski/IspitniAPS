/*
1.Листа јуни 2020 термин 1
•	Ova e prvata zadaca bese dadena dvojno povrzana lista i trebase da se pocne od prviot i
posledniot element, da se soberat i da se vmetne zbirot vo listata a posle toa da se vmetne i
pogolemiot broj od dvata a da se izbrise elementot od prviot pokazuvac (onoj so pocnal od pocetokot
na listata ne od krajot) i taka naizmenicno
(vtoriot i predposledniot, tretiot i toj pred predposledniot itn)
se dodeka ne dojdat do polovina od listata
t.e. ako e dadena listata 10 4 5 3 6 trebase da se dobie 16 10 7 4 5 3 6 na izlez.

 */

public class prvaZadacha {

    public static void main(String[] args) {
        DLL<Integer> integerDLL = new DLL<Integer>();
        integerDLL.insertLast(10);
        integerDLL.insertLast(4);
        integerDLL.insertLast(5);
        integerDLL.insertLast(3);
        integerDLL.insertLast(6);

        DLLNode<Integer> front = integerDLL.getFirst();
        DLLNode<Integer> last = integerDLL.getLast();
        int sum = 0;
        while(front!=null && front!=last){
            sum = front.element + last.element;
            integerDLL.insertBefore(sum, front);
            front = front.succ;
            last = last.pred;
        }

        System.out.println(integerDLL);
    }
}
