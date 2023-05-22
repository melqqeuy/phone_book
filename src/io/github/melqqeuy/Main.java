package io.github.melqqeuy;

import io.github.melqqeuy.phone_book.PhoneBook;

import java.util.Arrays;
import java.util.HashMap;
import java.util.TreeSet;

public class Main {
    private static final String[] words = {"A", "B", "B", "C", "C", "C", "D", "D", "D", "D"};

    public static void main(String[] args) {
        System.out.println(getWords(words));
        System.out.println(getWordsCount(words));

        PhoneBook phoneBook = new PhoneBook();
        phoneBook.add("Иванов", "phone_иванов_1");
        phoneBook.add("Петров", "phone_петров_1");
        phoneBook.add("Иванов", "phone_иванов_2");
        phoneBook.add("Сидоров", "phone_сидоров_1");
        phoneBook.add("Сидоров", "phone_сидоров_2");
        phoneBook.add("Сидоров", "phone_сидоров_3");

        System.out.println("Иванов phones: " + phoneBook.get("Иванов"));
        System.out.println("Петров phones: " + phoneBook.get("Петров"));
        System.out.println("Сидоров phones: " + phoneBook.get("Сидоров"));

    }

    private static TreeSet<String> getWords(String[] words) {
        return new TreeSet<>(Arrays.asList(words));
    }

    private static HashMap<String, Integer> getWordsCount (String[] words) {
        HashMap<String, Integer> map = new HashMap<>();
        for (int i = 0; i < words.length; i++) {
            String word = words[i];
            Integer count = map.get(word);
            if (count == null) {
                map.put(word, 1);
            } else {
                map.put(word, count + 1);
            }
        }
        return map;
    }
}
