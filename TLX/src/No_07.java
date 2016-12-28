
import java.util.Scanner;


public class No_07 {
    public static void main(String[] args) {
        Scanner z=new Scanner(System.in);
        System.out.print("Jumlah gantungan : ");
        int n=z.nextInt();
        boolean hasil=true;
        int[] idx=new int[n];
        for (int i = 0; i < n; i++) {
            System.out.print("Susunan ke-"+(i+1)+" : ");
            idx[i]=z.nextInt();
        }
        idx[0]=idx[0]*idx[1];
        if (idx[0]==0) {
            for (int i = 1; i < n-1; i++) {
                idx[i]=idx[i]*idx[i+1];
                if (idx[i]<0||idx[i]>0) {
                    hasil=false;
                }
            }
            if (hasil==true)
                System.out.println("");
        }
    }
}
