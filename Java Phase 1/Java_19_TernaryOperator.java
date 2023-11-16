import java.util.Scanner;
public class Java_19_TernaryOperator {
    public static void main(String[] args) {
        int x,y ;
        Scanner sc = new Scanner(System.in) ;
        System.out.println("Ternary Operator");
        System.out.print("โปรดใส่ค่าแรกที่จะเปรียบเทียบ");
        x = sc.nextInt() ;
        System.out.print("โปรดใส่ค่าที่สองที่จะเปรียบเทียบ");
        y =sc.nextInt() ;
        String result ="" ;
        result = (x>y)? x+">"+y :x + "<"+y ;
        System.out.println(result);
        sc.close();

    }
}
