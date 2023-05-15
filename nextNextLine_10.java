import java.util.Scanner; 
class nextNextLine_10{
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in) ;//รับ input จากแป้นพิมพ์

        System.out.print("โปรดใส่ชื่อของคุณ : ");
        String name1 =sc.nextLine() ;  //รับค่าที่เป้น String ทั้งบรรทัด
        System.out.println("ชื่อของคุณคือ : "+name1);

        
        System.out.print("โปรดใส่ชื่อของคุณ : ");
        String name2 =sc.next() ;  //รับค่าที่เป้น String ทแค่คำแรก 
        System.out.println("ชื่อของคุณคือ : "+name2);
      
        
    }
}
