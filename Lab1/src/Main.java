class Values {
    private static final short a = 2;
    private static final short b = 4;
    private static final int n = 30;
    private static final int m = 20;
    private static final int C = 2;

    void calc() {
        double S = 0;

        if (a <= C && C <= n || b <= 0 && 0 <= m) {
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
        Values obj = new Values();
        obj.calc();
    }
}
    //task* Змінити один символ, щоб
    //вивело 20 "*"
    //int N = 20;
      //  for (int i = 0; i < N; N--) {
        //System.out.println("*");
        //Remake