public class zada4a {
    public static void main(String[] args) {
        int lox = 0;
        while (lox <= 10) {
            System.out.println(lox);
            lox++;
        }
        for (int i = 10; i >= 1; i--) {
            System.out.println(i);
        }
        for (int A = 10; A >= -10; A--) {
            System.out.println(A);
        }
        int A = 1932913;
        int B = 0;
        while (A != 0) {
            B = (A % 10) + (B * 10);
            A = A / 10;
        }
        System.out.println(B);

        double sym=0;
        for (int jan = 1; jan <= 12; jan++ ){
            sym=((sym*0.01)+29000) + sym;
            System.out.println(String.format("%d равна %f",jan,sym));
        }



    }

}