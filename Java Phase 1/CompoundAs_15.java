import java.util.Scanner;
public class CompoundAs_15 {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        System.out.println("Compound Assignment");
        System.out.print("ค่าที่ 1 = ");
        Double x = sc.nextDouble() ;
        System.out.print("ค่าที่ 2 = ");
        Double y = sc.nextDouble() ;
        System.out.println("x += y = x+ y = "+(x+y));
        System.out.println("x -= y = x- y = "+(x-y));
        System.out.println("x *= y = x* y = "+(x*y));
        System.out.println("x /= y = x/ y = "+(x/y));
        System.out.println("x %= y = x% y = "+(x%y));

    }
}
