package day28_staticBlock;

import java.util.AbstractList;
import java.util.ArrayList;
import java.util.List;

public class C04_PassByValueEkstra {
    public static void main(String[] args) {

        List<Integer> list=new ArrayList<>();
        list.add(10);
        list.add(11);
        list.add(12);

        degistir(list);
        System.out.println("list1 = " + list);

        degistir2(list);
        System.out.println("list2 = " + list);
    }

    public static void degistir2(List<Integer> list) {
        for (Integer each:list
             ) {
            each+=3;
            System.out.print(each+" "+"d2 ");
        }
        System.out.println();
        System.out.println("degistir2'nin list'i: "+list);
    }

    public static void degistir(List<Integer> list) {
        for (int i = 0; i < list.size(); i++) {
            list.set(i, list.get(i)+3);
            System.out.println(list.get(i)+" "+"d1");

        }
        System.out.println();
        System.out.println("degistir'in list'i: "+list);
    }
}
