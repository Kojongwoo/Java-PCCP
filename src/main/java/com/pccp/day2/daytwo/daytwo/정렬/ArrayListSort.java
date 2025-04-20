package com.pccp.정렬;

import java.util.ArrayList;
import java.util.Comparator;

public class ArrayListSort {
    // main 작성하고, 키보드 Tab 키
    public static void main(String[] args) {
        ArrayList<String> stringList = new ArrayList<>();
        stringList.add("asbC");
        stringList.add("Asqw");
        stringList.add("ㄱㄴㄷ");
        stringList.add("가나다");
        stringList.add("123");
        stringList.add("!@#");

        System.out.println(stringList);

        // 오름차순 정렬 : sort(null);
        stringList.sort(null);
        System.out.println(stringList);

        // 내림차순 정렬 : sort(Comparator.reverseOrder());
        stringList.sort(Comparator.reverseOrder());
        System.out.println(stringList);
    }

}
