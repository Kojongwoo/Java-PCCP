package com.pccp.day2.개념.정렬;
import java.util.*;

public class ArrayListSort {
    public static void main(String[] args) {
        ArrayList<String> stringList = new ArrayList<>();
        stringList.add("asbC");
        stringList.add("Asqw");
        stringList.add("ㄱㄴㄷ");
        stringList.add("가나다");
        stringList.add("123");
        stringList.add("!@#");
        System.out.println("정렬 전 : " + stringList);

        // 오름차순 정렬 방법 2
        stringList.sort(null); // null 자리엔 조건이 들어가기도 함
        System.out.println("정렬 후 : " + stringList);

        // 내림차순 정렬: Comparator.reverseOrder()
        stringList.sort(Comparator.reverseOrder());
        System.out.println("내림차순 정렬 후 : " + stringList);

    }
}
