package generics;

public class GenericsEX<T1, T2> {
    private int id;
    private T1 t1;
    private T2 t2;

    public GenericsEX(int id, T1 t1, T2 t2) {
        this.id = id;
        this.t1 = t1;
        this.t2 = t2;
    }

    public int getInt() {
        return id;
    }

    public T1 getT1() {
        return t1;
    }

    public T2 getT2() {
        return t2;
    }
}
