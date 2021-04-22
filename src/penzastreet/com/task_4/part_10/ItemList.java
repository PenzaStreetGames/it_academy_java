package penzastreet.com.task_4.part_10;

import java.util.ArrayList;
import java.util.Scanner;
import java.util.TreeMap;

public class ItemList {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        TreeMap<String, TreeMap<String, Integer>> personsItems = new TreeMap<>();
        while(in.hasNext()) {
            String person = in.next();
            String item = in.next();
            int amount = in.nextInt();
            if (!personsItems.containsKey(person))
                personsItems.put(person, new TreeMap<>());
            int old_amount = 0;
            if (personsItems.get(person).containsKey(item))
                old_amount += personsItems.get(person).get(item);
            personsItems.get(person).put(item, old_amount + amount);
        }
        for (String key : personsItems.keySet()) {
            System.out.println(key + ":");
            for (String item : personsItems.get(key).keySet()) {
                System.out.println(item + " " + personsItems.get(key).get(item));
            }
        }
    }
}
