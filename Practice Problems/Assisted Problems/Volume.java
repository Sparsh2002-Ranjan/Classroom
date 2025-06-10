import java.util.Scanner;

public class Volume {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int rad=sc.nextInt();
        int height=sc.nextInt();
        double vol=3.14*(rad*rad)*height;
        System.out.print(vol);
    }
}
