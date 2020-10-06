package ex;

public class Fact {
    public static void main(String[] args) {
        Fact f = new Fact();
        f.calc(5);

    }

    public int calc(int n) {
        if (n < 0) {
            throw new IllegalArgumentException("This number less 0!");
        }
        int rsl = 1;
        for (int i = 1; i <= n; i++) {

            System.out.println(rsl *= i);
        }
        return rsl;
    }
}
