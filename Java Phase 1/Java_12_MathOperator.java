import java.util.Scanner; 
public class Java_12_MathOperator {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in) ;
        System.out.print("ค่าแรก = ");
        Double a = sc.nextDouble() ;
        System.out.print("ค่าที่สอง = ");
        Double b = sc.nextDouble() ;

        System.out.println("ผลบวก = " +(a+b));
        System.out.println("ผลลบ = " +(a-b));
        System.out.println("ผลคูณ = " +(a*b));
        System.out.println("ผลหาร = " +(a/b));
        System.out.println("เศษจากการหาร = " +(a%b));

        System.out.println("ตัวดำเนินการเปรียบเทียบ");
        System.out.print("ค่าแรก = ");
        int c = sc.nextInt() ;
        System.out.print("ค่าที่สอง = ");
        int d = sc.nextInt() ;

        System.out.println("ค่าเท่ากันมั้ย = "+(c==d));
        System.out.println("ค่าไม่เท่ากันมั้ย = "+(c!=d));
        System.out.println("ค่ามากกว่ามั้ย = "+(c>d));
        System.out.println("ค่าน้อยกว่ามั้ย = "+(c<d));
        System.out.println("ค่ามากกว่าหรทอเท่ากับมั้ย = "+(c>=d));
        System.out.println("ค่าน้อยกว่าหรือเท่ากับมั้ยมั้ย = "+(c<=d));

        sc.close(); 



    }
}
