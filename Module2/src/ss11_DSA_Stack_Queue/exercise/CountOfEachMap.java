package ss11_DSA_Stack_Queue.exercise;

import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

public class CountOfEachMap {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập: ");
        String str = sc.nextLine();
        Character character;
        Map<Character, Integer> mapCharInt = new TreeMap<>();
        for (int i = 0; i < str.length(); i++) {
            character = str.charAt(i);
            if ( mapCharInt.containsKey(character)){
                int index = mapCharInt.get(character);
                mapCharInt.put(character, index+1);
            }else {
                mapCharInt.put(character,1);
            }
        }
        System.out.println(mapCharInt);
    }
}
