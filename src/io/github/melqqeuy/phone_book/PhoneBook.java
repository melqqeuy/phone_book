package io.github.melqqeuy.phone_book;

import java.util.HashMap;
import java.util.HashSet;

public class PhoneBook {

    private final HashMap<String, HashSet<String>> records = new HashMap<>();

    public void add(String surname, String phone){
        HashSet<String> phones = records.get(surname);
        if (phones == null) {
            phones = new HashSet<>();
            records.put(surname, phones);
        }
        if (!phones.add(phone)) {
            throw new RuntimeException("Дублирование записи: surname " + surname + "phone: " + phone);
        }
    }

    public HashSet<String> get(String surname) {
        return records.get(surname);
    }
}
