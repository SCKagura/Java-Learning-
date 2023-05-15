import java.util.Scanner;
public class SwitchCase_20 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in) ;
        System.out.print("โปรดใส่่เลขเดือนเกิดของคุณ");
        int month =sc.nextInt() ;
        switch(month)
        {
            case 1 :System.out.println("คุณเกิดเดือน มกราคม"); break ;
            case 2 :System.out.println("คุณเกิดเดือน กุมภาพันธื"); break ;
            case 3 :System.out.println("คุณเกิดเดือน มีนาคม"); break ;
            case 4 :System.out.println("คุณเกิดเดือน เมษายน"); break ;
            case 5 :System.out.println("คุณเกิดเดือน พฤษภาคม"); break ;
            case 6 :System.out.println("คุณเกิดเดือน มิถุนายน"); break ;   
            case 7 :System.out.println("คุณเกิดเดือน กรกฏาคม"); break ;
            case 8 :System.out.println("คุณเกิดเดือน สิงหาคม"); break ;   
            case 9 :System.out.println("คุณเกิดเดือน กันยายน"); break ;
            case 10 :System.out.println("คุณเกิดเดือน ตุลาคม"); break ;
            case 11 :System.out.println("คุณเกิดเดือน พฤศจิกายน"); break ;
            case 12 :System.out.println("คุณเกิดเดือน ธันวาคม"); break ;
            default:System.out.println("คุณใส่ข้อมูลไม่ถูกต้อง");
        }
    }
}
