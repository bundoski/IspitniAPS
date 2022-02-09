/*
 	3.Листа прв колоквиум 2020 термин 1
 	dadena e ednostrana povrzana lista od celi broevi. treba da se najdat parovi od parni i neparni broevi. parot od
 	parni broevi treba da se sobere i sumata treba da dojde na mestoto na prviot element od parot, a vtoriot treba da
 	se izbrise. Neparnite broevi treba da se odzemat i razlikata treba da se smesti kako kaj parnite broevi, odnosno
 	prviot element od parot se zamenuva so razlikata , a vtoriot element od parot se brise
 	Vlez : 1 2 3 4 5 6 7 8 Izlez -2 6 -2 14

 */

public class tretaZadacha {
    public static void main(String[] args) {
        SLL<Integer> integerSLL = new SLL<>();
        integerSLL.insertLast(1);
        integerSLL.insertLast(2);
        integerSLL.insertLast(3);
        integerSLL.insertLast(4);
        integerSLL.insertLast(5);
        integerSLL.insertLast(6);
        integerSLL.insertLast(7);
        integerSLL.insertLast(8);

        SLLNode<Integer> tempNode = integerSLL.getFirst();
        SLLNode<Integer> anotherTempNode;

        // za parni
        while (tempNode != null) {
            if (tempNode.element % 2 == 0) {
                anotherTempNode = tempNode.succ;
                while (anotherTempNode != null && anotherTempNode.element % 2 != 0)
                    anotherTempNode = anotherTempNode.succ;
                if (anotherTempNode != null) {
                    tempNode.element = tempNode.element + anotherTempNode.element;
                    integerSLL.delete(anotherTempNode);
                }
            }
            tempNode = tempNode.succ;
        }

        // za neparni
        tempNode = integerSLL.getFirst();
        while (tempNode != null) {
            if (tempNode.element % 2 != 0) {
                anotherTempNode = tempNode.succ;
                while (anotherTempNode != null && anotherTempNode.element % 2 == 0)
                    anotherTempNode = anotherTempNode.succ;
                if (anotherTempNode != null) {
                    tempNode.element = tempNode.element - anotherTempNode.element;
                    integerSLL.delete(anotherTempNode);
                }
            }
            tempNode = tempNode.succ;
        }

        System.out.println(integerSLL);

    }
}
