import java.util.Scanner; 
public class Condition_18 {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in) ;
        System.out.println("if");
        System.out.print("ค่าแรกที่จะเปรียบเทียบ : ");
        int x =sc.nextInt() ;
        System.out.print("ค่าที่สองที่จะเปรียบเทียบ : ");
        int y =sc.nextInt() ;
        boolean z;
        z = x>y ;
        System.out.println("ค่าแรก > ค่าสอง ?  : "+z );
        z = x<y ;
        System.out.println("ค่าแรก < ค่าสอง ?  : "+z );
        System.out.println("if else");
        System.out.print("โปรดใส่อายุของคุณ : ");
        int age =sc.nextInt() ;
        if(age>=15)
        {
            System.out.println("คุณเป็น นาย/นางสาว แล้ว ");
        }else
        {
            System.out.println("คุณยังเป็น เด็กชาย/เด็กหญิง อยู่นะ ");

        }
        System.out.println("if else if");
        System.out.print("โปรดใส่คะแนนของคุณ");
        double score =sc.nextDouble() ;
        if(score>=80 && score <=100)
        {
            System.out.println("คุณได้เกรด A ");
        }else if(score >= 75 && score < 80 )
        {
            System.out.println("คุณได้เกรด B+ ");
        }else if(score >= 70 && score < 75 )
        {
            System.out.println("คุณได้เกรด B ");
        }else if(score >= 65 && score < 70 )
        {
            System.out.println("คุณได้เกรด C+ ");
        }else if(score >= 60 && score < 65 )
        {
            System.out.println("คุณได้เกรด C ");
        }else if(score >= 55 && score < 60 )
        {
            System.out.println("คุณได้เกรด D+ ");
        }else if(score >= 50 && score < 55 )
        {
            System.out.println("คุณได้เกรด D ");
        }else if(score >= 0 && score < 50 )
        {
            System.out.println("คุณได้เกรด F ");
        }else 
        {
            System.out.println("คุะแนนที่กรอกมาผิด");

        }
        System.out.println("if ซ้อน if");
        System.out.print("โปรดใส่อายุของคุณ");
        int age1 =sc.nextInt() ;
        if (age1>0 && age1 <4 )
        {
            System.out.println("ว่าไงเบบี๋");
        }
        if (age1 >=  4 && age1 < 7 )
        {
            if(age1 == 4)
            {
                System.out.println("เด็กอนุบาล 1");
            }
            if(age1 == 5)
            {
                System.out.println("เด็กอนุบาล 2");
            }
            if(age1 == 6)
            {
                System.out.println("เด็กอนุบาล 3");
            }
        }
        if (age1 >=  7 && age1 < 13 )
        {
            if(age1 == 7)
            {
                System.out.println("เด็กป.1");
            }
            if(age1 == 8)
            {
                System.out.println("เด็กป.2");
            }
            if(age1 == 9)
            {
                System.out.println("เด็กป.3");
            }
            if(age1 == 10)
            {
                System.out.println("เด็กป.4");
            }if(age1 == 11)
            {
                System.out.println("เด็กป.5");
            }if(age1 == 12)
            {
                System.out.println("เด็กป.6");
            }
        }else
        {
            System.out.println("ค้านทำละ");
        }
        

    }
}
