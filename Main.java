public class Singleton {
    private static Singleton instance;
    private final double result;

    private Singleton(double x, double y) {
        this.result = 2 * x + 3 / y;
    }

    public double getResult() {
        return result;
    }

    public static Singleton getInstance(double x, double y) {
        if (instance == null) {
            instance = new Singleton(x, y);
        }
        return instance;
    }

    public static void main(String[] args) {
        System.out.println(Singleton.getInstance(100, 3).getResult());
    }
}
