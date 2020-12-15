package penzastreet.com.task_2.part_8;

public class Types {
    class ThreeIntegers<T1, T2, T3>{
        T1 t1;
        T2 t2;
        T3 t3;

        public ThreeIntegers(T1 t1, T2 t2, T3 t3) {
            this.t1 = t1;
            this.t2 = t2;
            this.t3 = t3;
        }
    }
    public boolean check(ThreeIntegers<Integer, Integer, Integer> three){
        return (three.t1 * three.t1 == three.t2 * three.t2 + three.t3 * three.t3) ||
                (three.t2 * three.t2 == three.t1 * three.t1 + three.t3 * three.t3) ||
                (three.t3 * three.t3 == three.t1 * three.t1 + three.t2 * three.t2);
    }
}
