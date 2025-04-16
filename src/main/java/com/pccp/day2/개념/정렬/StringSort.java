package com.pccp.day2.개념.정렬;
import java.util.Arrays;
import java.util.Comparator;

public class StringSort {
    public static void main(String[] args) {
        // 문자열 정렬
        // -> 문자열 내부 문자들을 정렬한다.
        String str = "hello world";
        System.out.println(str);
        // 문자열을 문자 배열로 변환
        char[] chars = str.toCharArray();

        // 오름차순 정렬
        Arrays.sort(chars);
        System.out.println("정렬 후 " + Arrays.toString(chars));

        // 내림차순 정렬
        Character[] charObjects = new Character[chars.length];
        for (int i = 0; i < charObjects.length; i++) {
            charObjects[i] = chars[i];
        }
        Arrays.sort(charObjects, Comparator.reverseOrder());
        System.out.println("내림차순 정렬 후 : " + Arrays.toString(charObjects));
    }
}
