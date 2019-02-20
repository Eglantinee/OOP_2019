class values {
    private short a = 5;
    private short b = 4;
    private int n = 30;
    private int m = 20;
    private final int C = 2;

    void Calc() {
        double S = 0;

        if (a < C & C < n) {
            System.out.println("Error. Zero division");
        }
        else {
            for (short i = a; i <= n; i++) {
                for (short j = b; j <= m; j++) {
                    S += (double)(i % j) / (i - C);
                }
            }
            System.out.println(S);
        }
    }
}

class Main {
    public static void main(String[] args) {
        values obj = new values();
        obj.Calc();
    }
}
///
