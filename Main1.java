import generics.GenericsEX;

public class Main1 {
    public static void main(String[] args) {
        GenericsEX< String,Integer> s1 = new GenericsEX<>(22,"rutuja",67);
        System.out.println(s1.getInt());
        System.out.println(s1.getT1());
        System.out.println(s1.getT2());
    }
}
