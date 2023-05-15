public class DataCheck_8 {
    public static void main(String[] args) {
       /*  int a =1 ;
        double b = 1 ;
        String c = "SCK" ;
        boolean d = true ;
        char e = 'e' ;
        float f = 202.2f ;*/
   //ทำไม่ได้ เพรา instanceof ทำงานกับชื่อคลาส
        Integer a =1 ;
        Double b = 5.954 ;
        String c = "SCK" ;
        Boolean d = true ;
        char e = 'e' ;
        Float f = 202.2f ;
        System.out.println("การตรวจสอบข้อมูล");
        System.out.println(a+b+c+d+e+f);
        // boolean g = a instanceof String ;
        boolean g = c instanceof String ;
        System.out.println(g);
        boolean h= a instanceof Integer ;
        System.out.println(h);
        // boolean i= f instanceof Integer ;
         boolean i= f instanceof Float ;

        System.out.println(i);
        // boolean h = b instanceof int ;
        // boolean i = c instanceof int ;


    }
}
