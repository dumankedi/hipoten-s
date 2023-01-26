import java.util.Scanner;
public class Main {
    public static void main(String[] args){
        Scanner input=new Scanner(System.in);
        int a,b;
        double c;
        System.out.print("İlk kenarı giriniz: ");
        a=input.nextInt();
        System.out.print("İkinci kenarı giriniz: ");
        b=input.nextInt();
        c=Math.sqrt((a*a)+(b*b));3
        System.out.println(c);
    }
}