package com.pccp.day2.개념.해시;

/* HashMap 주요 메소드
- `put(K key, V value)` : 추가 또는 수정
- `get(Object key)` : 값 조회, 없으면 `null`
- `getOrDefault(Object key, V defaultValue)` : 값을 조회하고, 키가 없으면 기본값 반환
- `remove(Object key)` : 삭제 및 삭제된 값 반환
- `containsKey(Object key)` / `containsValue(Object value)` : 포함 여부 확인
- `size()` / `isEmpty()` : 요소 수 확인 / 비어있는지 확인
- `keySet()` / `values()` / `entrySet()` : 키, 값, 키-값 쌍 반환
- `clear()` : 모든 엔트리 삭제 */

import java.util.*;

public class HashMapExample {
    public static void main(String[] args) {
        Map<String, String> capitals = new HashMap<>();

        capitals.put("대한민국", "서울");
        capitals.put("미국", "워싱턴 D.C.");
        capitals.put("일본", "도쿄");
        capitals.put("영국", "런던");
        capitals.put("프랑스", "파리");
        System.out.println("초기 맵: " + capitals);

        System.out.println("대한민국 수도: " + capitals.get("대한민국"));
        System.out.println("영국 수도: " + capitals.get("영국"));
        System.out.println("독일 수도: " + capitals.get("독일"));

        System.out.println("미국 키 존재 여부: " + capitals.containsKey("미국"));

        System.out.println("프랑스 수도: " + capitals.getOrDefault("프랑스", "파리"));

        String removedValue = capitals.remove("프랑스");
        System.out.println("프랑스 삭제 후: " + capitals);
        System.out.println("삭제된 수도: " + removedValue);

        System.out.println("맵 크기: " + capitals.size());

        System.out.println("KeySet 순회");
//        for (String key : capitals.keySet()) {
//            System.out.println("나라: " + key + ", 수도: " + capitals.get(key));
//        }

        // Entry : Map.Entry<K, V>는 하나의 키-값 쌍을 표현하는 객체.
        // entryset() -> HashMap에 저장된 모든 키-값 쌍을 가져올 수 있음.

        for (Map.Entry<String, String> entry : capitals.entrySet()) {
            String key = entry.getKey();
            String value = entry.getValue();
            System.out.println("나라: " + key + ", 수도: " + value);
        }
    }
}
