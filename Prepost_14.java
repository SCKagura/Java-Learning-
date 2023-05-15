import java.util.Scanner; 
public class Prepost_14 {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in); 
        System.out.println("โปรดใส่ ค่า ของคุณ");
        int x =sc.nextInt() ;
        System.out.println("ค่า x = "+x);
        System.out.println("ค่า ++x = "+(++x));
        System.out.println("ค่า x++ = "+(x++));
        System.out.println("ค่า x = "+x);
        System.out.println("ค่า --x = "+(--x));
        System.out.println("ค่า x-- = "+(x--));
        System.out.println("ค่า x = "+x);

    }
}
