package penzastreet.com.task_2.add_2;

class Printer {
    public static void print(Number num) {
        System.out.println(num);
    }

    public static void print(int[] num) {
        System.out.print("[");
        for (int i = 0; i < num.length; i++) {
            System.out.print(num[i]);
            if (i != num.length - 1)
                System.out.print(",");
        }
        System.out.println("]");
    }

    public static void print(double[] num) {
        System.out.print("[");
        for (int i = 0; i < num.length; i++) {
            System.out.print(num[i]);
            if (i != num.length - 1)
                System.out.print(",");
        }
        System.out.println("]");
    }
}
