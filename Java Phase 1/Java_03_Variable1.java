public class Java_03_Variable1 {
    public static void main(String[] args) {
        //นิยามตัวแปรแบบไม่ระบุค่าเริ่มต้น
        int a ;
        boolean status ;
        float b;
        //นิยามตัวแปรแบบระบุค่าเรื่มต้น
        int c = 10 ;
       double d = 6.4534 ;
       float e =5645.342f ; //การจะกำหนด float ต้องมี f กำกับ double นิยามได้เลยโดยไม่ต้องเติมเพิ่ม
        char box = 'f' ;
        boolean stat = true ;
        //หลาบบรรทัดในครั้งเดียว
        int f = 9 , g = 7 , h ;
       double i =46.4,j= 564.74 ;
       a= 1 ;
       b = 2 ;
       h = 10 ;
       status = true ;
        System.out.println(a+b+c+d+e+f+g+h+i+j+box);
        System.out.println(status);
        System.out.println(stat);

    }
}
