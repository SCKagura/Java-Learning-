import java.util.Scanner; 
public class Java_14_Prepost {
    public static void main(String[] args) {
        System.out.println("Prefix Postfix");
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
        sc.close(); 
    }
}
