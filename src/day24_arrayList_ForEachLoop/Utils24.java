package day24_arrayList_ForEachLoop;

import java.util.ArrayList;
import java.util.List;

public class Utils24 {
    public static List<Integer> arrayiListeCevir(int[] arr){
        List<Integer>list=new ArrayList<>();
        for (int w:arr) {
            list.add(w);
        }
        return list;
    }
}
