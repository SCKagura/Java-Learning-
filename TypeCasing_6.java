public class TypeCasing_6 {
    public static void main(String[] args) {
        System.out.println("การแปลงชนิดข้อมูล Type Casing");
        System.out.println("1.Widening Casing");

        int NumInt1 = 10 ;
        double NumDouble1 = NumInt1 ;  //auto int to double
        System.out.println(NumInt1);
        System.out.println(NumDouble1);
        System.out.println("2.Narrowing Casing");

        double NumDouble2 = 10.7 ;
        //int NumInt2 = NumDouble2 ; ทำไม่ได้ error
        int NumInt2 = (int)NumDouble2 ;  //แปลง double เป็น int
        System.out.println(NumInt2);

    }
}
