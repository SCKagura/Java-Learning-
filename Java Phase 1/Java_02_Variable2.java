class Java_02_Variable2
{
    public static void main(String[] args) {
        int num1 = 10 ;
        int num2 = 20 ;
        System.out.println("ค่าตัวเลขที่ 1 = "+num1); //ใช้ + 
        System.out.println("ค่าตัวเลขที่ 2 = "+num2);
        num1 = 50 ; //กำหนดค่าให้กับตัวแปรใหม่
        System.out.println("ค่าตัวเลขที่ 1 = "+num1); //ใช้ + 
        System.out.println("การนิยามตัวแปรแบบค่าคงที่");
        final int NUM3 = 10;
        final int NUM4 ;
        System.out.println("NUM3 = "+NUM3) ;
        //num 3 = 20 ; //จะเกิด bug เพราำ final ปรับค่าไม่ได้
        NUM4 = 5221 ;
        System.out.println("NUM4 = "+NUM4) ;
        System.out.println("กฎการตั้งชื่อตัวแปร");
        int num5 = 550 ;
        System.out.println(num5);
        // int 3id = 40 ;  error ห้ามตั้งชื่อขึ้นต้นตัวเลข
        // int %oi =30 ; error ห้ามตั้งชื่อด้วยสัญลักษณ์พิเศษ
        int $red = 40 ; //ทำได้
        System.out.println($red);
        int _HI = 30 ;//ทำได้
        System.out.println(_HI);
        // int import ;  ทำไม่ได้ ซ้ำคำสงวน
    }
}