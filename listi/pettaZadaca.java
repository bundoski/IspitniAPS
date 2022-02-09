import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/*
5. Lista

Na vlez se prima lista I taa lista treba da se modificira na nacin so pomegju sekoi 2 broja
 ke se vmetne broj sto e aritmeticka sredina na tie 2 broja. Da ne se koristi pomoshna lista
 tuku da se vmetnat vo vekje dadenata.

 */

public class pettaZadaca {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int numberOfElements = Integer.parseInt(br.readLine());

        SLL<Double> doubleSLL = new SLL<Double>();

        String[] elements = br.readLine().split(" ");

        for (int i = 0; i < numberOfElements; i++)
            doubleSLL.insertLast(Double.parseDouble(elements[i]));

        SLLNode<Double> node = doubleSLL.getFirst();
        SLLNode<Double> firstElement, secondElement;
        while (node.succ != null) {

            firstElement = node;
            secondElement = node.succ;
            doubleSLL.insertAfter((firstElement.element + secondElement.element) / 2.0, firstElement);
            node = secondElement;
        }
        System.out.println(doubleSLL);
    }
}
