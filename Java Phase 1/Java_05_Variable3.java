public class Java_05_Variable3 {
    public static void main(String[] args) {
        System.out.println("Global variable & Local Variable");
        int a =100 ; //global  variable
        int b = 200 ; //global variable
        System.out.println("ค่า a ="+a);
        {
            int c = 200 ;
            System.out.println("ค่า c = "+c);
            System.out.println("ค่า b = "+ b);  //ทำได้เพราะ b เป็น global variable

        }
        // System.out.println(c); ทำไม่ได้เพราะ c เป็น local variable ถูกใช้แค่บางส่วน
        System.out.println("ค่าสูงสุด & ต่ำสุดของชนิดตัวแปร");
        System.out.println("Min Short = "+Short.MIN_VALUE);
        System.out.println("Max Short = "+Short.MAX_VALUE);
        System.out.println("Min integer = "+Integer.MIN_VALUE);
        System.out.println("Max integer = "+Integer.MAX_VALUE);
        System.out.println("Min Long = "+Long.MIN_VALUE);
        System.out.println("Max Long = "+Long.MAX_VALUE);
        System.out.println("Min Float = "+Float.MIN_VALUE);
        System.out.println("Max Float = "+Float.MAX_VALUE);
        System.out.println("Min Double = "+Double.MIN_VALUE);
        System.out.println("Max Double = "+Double.MAX_VALUE);

    }
}
