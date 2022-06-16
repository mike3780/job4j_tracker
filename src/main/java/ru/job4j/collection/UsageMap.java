package ru.job4j.collection;

import java.util.HashMap;

public class UsageMap {
    public static void main(String[] args) {
        HashMap<String, String> mail = new HashMap<>();
        mail.put("mail@ya.ru", "Ivan Ivanov");
        for (String key : mail.keySet()) {
            System.out.println(key + " : " + mail.get(key));
        }
    }
}
