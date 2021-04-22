package penzastreet.com.task_4.part_8;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class StudentSort {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        ArrayList<Student> students = new ArrayList<>();
        int n = in.nextInt();
        for (int i = 0; i < n; i++) {
            students.add(new Student(in.nextInt(), in.nextInt()));
        }
        Collections.sort(students, Collections.reverseOrder());
        for (int i = 0; i < n; i++) {
            System.out.println(students.get(i));
        }
    }
}

class Student implements Comparable<Student> {
    int id;
    int score;

    public Student (int id, int score) {
        this.id = id;
        this.score = score;
    }

    @Override
    public int compareTo(Student o) {
        if (this.score > o.score)
            return 1;
        else if (this.score < o.score)
            return -1;
        if (this.id < o.id)
            return 1;
        else if (this.id > o.id)
            return -1;
        return 0;
    }

    @Override
    public String toString() {
        return id + " " + score;
    }
}
