import java.util.Scanner;
public class No_04 {
    public static void main(String[] args) {
        Scanner z=new Scanner(System.in);
        int K,A;
        String C;
        K=z.nextInt();
        C=z.next();
        A=z.nextInt();
        if (K>=2&&K<=100&&C.length()==1&&A>=0&&A<=9){
            switch (C){
                case"q":case"w":case"e":case"r":case"t":case"y":case"u":case"i":case"o":case"p":
                case"a":case"s":case"d":case"f":case"g":case"h":case"j":case"k":case"l":
                case"z":case"x":case"c":case"v":case"b":case"n":case"m":
                System.out.print(A);
                for (int i = 0; i < K-2; i++) {
                    System.out.print(C);
                }
                System.out.print(A+"\n");
                for (int i = 1; i < K/2; i++) {
                    for (int j = 1; j < K-1; j++) {
                        System.out.print(C);
                    }
                    System.out.println("");
                }
                for (int i = K/2; i < K-1; i++) {
                    
                }
                System.out.print(A);
                for (int i = 0; i < K-2; i++) {
                    System.out.print(C);
                }
                System.out.print(A+"\n");
                    break;
                default: System.out.println("SALAH");
            }
        }
        else System.out.println("SALAH");
    }
}
