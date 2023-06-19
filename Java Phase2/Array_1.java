public class Array_1 {
    public static void main(String[] args) {
        System.out.println("Array");
        int[] x ={10,20,30,40}; 
        int[] y =new int[4];
        System.out.println("x[0] = "+x[0]);
        y[0] = 12 ;
        y[1] = 20 ;
        System.out.println("y[0] = "+y[0]);
        // y[4] = 20 ; ทำไม่ได้ เพะราะกำหนดขนาด y ไส้ 4 ตัว
        System.out.println("การเปลี่ยนสมาชิกข้อมูลใน Array");
        System.out.println("ก่อนการปรับค่า x[2] = " + x[2]);
        x[2] = 500 ;
        System.out.println("หลังการปรับค่า x[2] = " + x[2]);
        System.out.println("การนับจำนวนสมาชิกใน Array");
        int[] a = {1,2,3,4,5,6,7,8,9,0} ;
        System.out.println("ความยาว Array a ="+a.length);
        System.out.println("การเข้าถึงสมาชิกด้วย For ");
        boolean[] b ={true,false,true,true,false} ;
        for (int i= 0 ;i<b.length ;i++)
        {
            System.out.println("b ตำแหน่งที่ "+(i+1)+" = "+b[i]);
        }
        System.out.println("การเข้าถึงสมาชิกด้วย For each");
        String[] fruit = {"มะละกอ","ส้ม","กล้วย"} ;
        for(String data :fruit)
        {
            System.out.println(data);
        }
        double[] c ={34.2,2.52,73.24,89.654,87.65} ;
        for(Double d:c)
        {
            System.out.println(d);
        } 

    }
}