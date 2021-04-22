package penzastreet.com.task_4.part_9;

import java.util.HashSet;
import java.util.Scanner;

public class HashTable {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        HashSet<String> table = new HashSet<>();
        String command, element;
        command = in.next();
        while (!command.equals("#")) {
            String key = in.next();
            if (command.equals("+"))
                table.add(key);
            else if (command.equals("?"))
                System.out.println((table.contains(key) ? "YES" : "NO"));
            command = in.next();
        }
    }
}
