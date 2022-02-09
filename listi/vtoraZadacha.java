/*
2.Листа септември 2019 термин 2
Za dadena edinecno povrzana lista i cel broj X treba da se promeni listata taka sto
site jazli so vrednost pomala od X ke se premestat pred jazlite koi imaat vrednost pogolema
ili ednakva na X. Treba da se zacuva originalniot relativen redosled na jazlite na dvata dela od listata
(pomali i pogolemi od X). Prviot red od vlezot e daden brojot N (N <= 100 )
na jazli vo listata, vo vtoriot red se dadeni broevite (celi broevi) od koi e sostavena listata, a vo tret red e daden brojot X.

 */

public class vtoraZadacha {
    public static void main(String[] args) {
        SLL<Integer> integerSLL = new SLL<Integer>();
        integerSLL.insertLast(10);
        integerSLL.insertLast(9);
        integerSLL.insertLast(8);
        integerSLL.insertLast(7);
        integerSLL.insertLast(6);
        integerSLL.insertLast(5);
        integerSLL.insertLast(4);
        integerSLL.insertLast(3);
        integerSLL.insertLast(2);
        integerSLL.insertLast(1);

        int n = 5;

        SLLNode<Integer> first = integerSLL.getFirst();
        while (first.element >= n) {
            first = first.succ;
        }
        integerSLL.insertFirst(first.element);
        integerSLL.delete(first);

        first = integerSLL.getFirst();
        SLLNode<Integer> pomNode = first.succ;

        while (pomNode != null) {
            if (pomNode.element < n) {
                integerSLL.insertAfter(pomNode.element, first);
                SLLNode<Integer> temp = pomNode.succ;
                integerSLL.delete(pomNode);
                pomNode = temp;
                first = first.succ;
            } else {
                pomNode = pomNode.succ;
            }
        }
        System.out.println(integerSLL);
    }
}
