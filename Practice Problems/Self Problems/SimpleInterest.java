import java.util.*;
public class SimpleInterest {

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int p=sc.nextInt();
        int r=sc.nextInt();
        int t=sc.nextInt();
        int z=(p*r*t)/100;
        System.out.print(z);
    }
}