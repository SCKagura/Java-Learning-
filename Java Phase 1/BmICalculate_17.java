import java.util.Scanner;
public class BmICalculate_17 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in) ;
        System.out.print("โปรดใส่น้ำหนักของคุณ (kg) : ");
        Double weight = sc.nextDouble() ;
        System.out.print("โปรดใส่ส่วนสูงของคุณ (cm) : ");
        Double height = sc.nextDouble() ;
        System.out.println("น้ำหนักของคุณ : "+weight);
        System.out.println("ส่วนสูงของคุณ : " + height);
        height /= 100 ;
        Double BMI = weight/(height*height) ;
        System.out.println("ค่า BMI ของคุณ : " + BMI);
        /* <18 = ต่ำกว่าเกณฑ์ 
         18.5-22.9  = สมส่วน
         23.0-24.9 = น้ำหนักเกิน
         25.0-29.9 โรคอ้วน
         มากกว่า 30 = โรคอ้วนระดับอันตราย
        */
        String result="" ;
        if(BMI < 18)
        {
            result ="ตำกว่าเกณฑ์" ; 
        }else if(BMI >=18.5 && BMI < 23 )
        {
            result="สมส่วน" ; 
        }else if(BMI >= 23 && BMI <25 )
        {
            result="น้ำหนักเกิน"  ;
        }else if(BMI >= 25 && BMI <29 )
        {
            result="โรคอ้วน"  ;
        }else if(BMI >= 30 )
        {
            result="โรคอ้วนอันตราย"  ;
        }
        System.out.print("เกณฑ์ของคุณ = "+result);

    }
}
