
import java.util.Scanner;
public class No_03 {
    public static void main(String[] args) {
        Scanner z=new Scanner(System.in);
        int B,P,L;
        B=z.nextInt();
        P=z.nextInt();
        L=z.nextInt();
        if (B>=1&&B<=200&&P>=1&&L<=200&&L>=1&&L<=200) {
            if (B>=1&&B<=10&&P>=1&&L<=40&&L>=1&&L<=90) System.out.println("S");
            else if (B<=14&&P<=60&&L<=120) System.out.println("M");
            else if (B<=18&&P<=80&&L<=180) System.out.println("L");
            else if (B<=25&&P<=100&&L<=220) System.out.println("X");
            else System.out.println("X");
        }
        else System.out.println("Ukuran salah.");
    }
}
