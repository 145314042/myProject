import java.util.Scanner;
public class No_02 {
    public static void main(String[] args) {
        Scanner z=new Scanner(System.in);
        int waktu,s,h,m;
        waktu=z.nextInt();
        if (waktu>=0&&waktu<=30000) {
            h=waktu/3600;
            m=(waktu-((waktu/3600)*3600))/60;
            s=waktu-(60*(waktu/60));
            System.out.println(h);
            System.out.println(m);
            System.out.println(s);
        }
        else System.out.println("Masukkan salah.");
    }
}
