package introduction;

import java.util.ArrayList;
import java.util.Scanner;

public class ArrayListExample {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        ArrayList<Integer> list = new ArrayList<>();


        for(int i = 0 ; i < 5 ; i ++) {
            list.add(input.nextInt());
        }
        System.out.println(list);

        System.out.println(list.get(4));
        list.add(5);
        list.add(4);
        list.add(2);
        list.add(1);
        list.add(23);

        System.out.println(list);

        System.out.println(list.contains(23));

        list.set(3, 99);
        System.out.println(list);

        list.remove(2);
        System.out.println(list);




    }
}
