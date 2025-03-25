package baitap;

import java.util.*;

public class Bai7 {
    public static void main(String[] args) {
        Scanner scaner = new Scanner(System.in);
        System.out.print("Nhập vào n số phần tử: ");
        int n = scaner.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = scaner.nextInt();
        }
        Map<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < n; i++) {
            int count = 0;
            for(int j = 0; j < n; j++) {
                if(arr[i] == arr[j]) {
                    count++;
                }
            }
            map.put(arr[i], count);
        }
        List<Map.Entry<Integer, Integer>> list = new ArrayList<>(map.entrySet());
        for (int i = 0; i < map.size(); i++) {
            for (int j = i + 1; j < map.size(); j++) {
                if(list.get(i).getValue() > list.get(j).getValue()) {
                    Map.Entry<Integer, Integer> temp = list.get(i);
                    list.set(i, list.get(j));
                    list.set(j, temp);
                }
            }
        }
        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i).getKey() + " " + list.get(i).getValue());
        }
    }
}
