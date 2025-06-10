import java.util.*;
public class Fahrenheit {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int cel=sc.nextInt();
        int fren=((cel*9)/5)+32;
        System.out.print(fren);
    }
}
