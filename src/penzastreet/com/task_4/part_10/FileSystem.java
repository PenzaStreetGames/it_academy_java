package penzastreet.com.task_4.part_10;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Scanner;

public class FileSystem {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        HashMap<String, HashSet<String>> files = new HashMap<>();
        int n = in.nextInt();
        in.nextLine();
        for (int i = 0; i < n ; i++) {
            String line = in.nextLine();
            String[] parts = line.split(" ");
            String file = parts[0];
            for (int j = 1; j < parts.length; j++) {
                String access = parts[j];
                if (!files.containsKey(file))
                    files.put(file, new HashSet<>());
                files.get(file).add(access);
            }
        }
        int m = in.nextInt();
        for (int i = 0; i < m; i++) {
            String command = in.next();
            String file = in.next();
            boolean success = false;
            if (command.equals("read")) {
                if (files.get(file).contains("R"))
                    success = true;
            }
            else if (command.equals("write")) {
                if (files.get(file).contains("W"))
                    success = true;
            }
            else if (command.equals("execute")) {
                if (files.get(file).contains("X"))
                    success = true;
            }
            System.out.println((success ? "OK" : "Access denied"));
        }
    }
}
