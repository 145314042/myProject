import java.util.Scanner;
public class No_05 {
    public static void main(String[] args) {
        Scanner z=new Scanner(System.in);
        String pass=z.next();
        if (pass.length()>20)
            System.out.println("SALAH");
        else if (pass.length()>=8&&pass.length()<=20&&
                (pass.contains("_")||pass.contains("-")||
                pass.contains("!")||pass.contains("?")))
            System.out.println("Kuat");
        else if (pass.length()>=12&&pass.length()<=20)
            System.out.println("AgakKuat");
        else if (pass.contains("0")&&pass.contains("1")&&pass.contains("2")&&pass.contains("3")&&pass.contains("4")&&
                pass.contains("5")&&pass.contains("6")&&pass.contains("7")&&pass.contains("8")&&pass.contains("9")&&
                pass.length()>=12&&pass.length()<=20)
            System.out.println("Lemah");
        else System.out.println("Lemah");
    }
}
