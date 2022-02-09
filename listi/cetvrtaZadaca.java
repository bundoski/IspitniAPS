/*
4.Листа февруари 2019 термин 1 GOLEMI BROEVI
elementite od lista1 pretstavuvat eden broj, elementite od lista2 drug broj, i sega tie broevi treba da se soberat.
primer vlez 9->9->6 9 izlez: 1005 primer 1->2->3->4 e lista1, 5->6->7->8 e lista2 i na kraj treba da se
pretvorat vo 1234 + 5678 = 6,912

 */

public class cetvrtaZadaca {
    public static void main(String[] args) {
        SLL<Integer> integerSLL = new SLL<>();
        SLL<Integer> integerSLL2 = new SLL<>();

        integerSLL.insertLast(1);
        integerSLL.insertLast(2);
        integerSLL.insertLast(3);
        integerSLL.insertLast(4);

        integerSLL2.insertLast(5);
        integerSLL2.insertLast(6);
        integerSLL2.insertLast(7);
        integerSLL2.insertLast(8);

        int resultFirstList = getNumberFromList(integerSLL);
        int resultSecondList = getNumberFromList(integerSLL2);

        System.out.println(resultFirstList+resultSecondList);

    }
    public static int getNumberFromList (SLL<Integer> list) {
        SLLNode<Integer> tempNode = list.getFirst();
        int result = tempNode.element;
        tempNode = tempNode.succ;
        while (tempNode != null) {
            result*=10;
            result+=tempNode.element;
            tempNode = tempNode.succ;
        }
        return result;
    }
}
