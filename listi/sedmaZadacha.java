/*
// You are given a single linked list filled with integers.
// You have to implement a deletion system in which you keep the first element, remove the second,
then you keep the next two elements, but delete
// their successor and so one while the limitations of the list allow you to do so.
// input:
//      first line: number of elements
//      second line: elements
// Constraints: You are forbidden to use any additional structures like arrays and to change the value of the nodes.
// Example 1:
//  input:
//      7
//      1 6 9 5 6 3 0
//  output:
//      1 9 5 3 0
 */

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class sedmaZadacha {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int numberOfElements = Integer.parseInt(br.readLine());

        SLL<Integer> integerSLL = new SLL<>();

        String[] elements = br.readLine().split(" ");

        for (int i = 0; i < numberOfElements; i++)
            integerSLL.insertLast(Integer.parseInt(elements[i]));

        int stepsMade = 1;
        int stepsUntilChange = 1;

        SLLNode<Integer> node = integerSLL.getFirst();
        while(node!=null){
            if(stepsUntilChange==0){
                SLLNode<Integer> tmp = node.succ;
                integerSLL.delete(node);
                stepsUntilChange = ++stepsMade;
                node = tmp;
            }
            else{
                stepsUntilChange--;
                node=node.succ;
            }
        }

        System.out.println(integerSLL);

    }

}
