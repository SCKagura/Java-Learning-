import java.util.Scanner;
public class Scanner_9 {
    public static void main(String[] args) {
        System.out.println("Scanner");
        System.out.print("โปรดใส่ชื่อของคุณ : ");
        Scanner sc =new Scanner(System.in) ;//รับ input จากแป้นพิมพ์
        String name =sc.nextLine() ;  //รับค่าที่เป้น String ทั้งบรรทัด
        System.out.println("ชื่อของคุณคือ : "+name);
        System.out.print("ป้อน ปีเกิดของคุณ คศ,พศ ก็ได้ : ");
        int birthday =sc.nextInt() ; //รับค่า Integer
        if (birthday > 2446 && birthday<2566)
        {
            System.out.println("ปีเกิดของคุณคือ พ.ศ. "+birthday) ;
            birthday = 2566 - birthday ;
            System.out.println("อายุของคุณในปีนี้คือ = "+birthday);
        }else if(birthday >1903 && birthday<2023)
        {
            System.out.println("ปีเกิดของคุณคือ ค.ศ. "+birthday);
            birthday = 2023 - birthday ;
            System.out.println("อายุของคุณในปีนี้คือ = "+birthday);
        }else 
        {
            System.out.println("โปรดใส่ช่วงอายุที่ถูกต้อง");
        }

    }
}
