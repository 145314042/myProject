
import java.util.Scanner;

public class No_01 {
    public static void main(String[] args) {
        Scanner z=new Scanner(System.in);
        int N;
        N=z.nextInt();
        if (N>=0&&N<=100) {
            System.out.println("YA");
        }
        else System.out.println("TIDAK");
    }
}
