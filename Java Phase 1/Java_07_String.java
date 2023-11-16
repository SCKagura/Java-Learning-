public class Java_07_String {
    public static void main(String[] args) {
        System.out.println("ทำความรู้จัก String");
      /*/   String = ชนิดข้อมูลที่เก็บชุดข้อความ
        Symbol = "" 
        char เก็บตัวอักษร
        symbol = ''
        char ต่อกัน = String */
        char a ='A' ;
        System.out.println(a);
        // char b ='dasoihd' ; ทำไม่ได้ 
        String c ="SCKagura" ;
        System.out.println(c);
        String d = "100" , e = "200"  ;
        d = d+50 ; //100 + 50 string + int 
        e =d+e ;
        System.out.println(d);
        System.out.println(e);
        System.out.println("แปลง String เป็นชนิดอื่น");
        String f ="200" ;
        // int g =(int)f); ทำไม่ได้
       int g ;
       g =Integer.parseInt(f) ;   //แปลง string เป็น integer
       g=g +50 ;
        System.out.println(g);
        String h = "5665.4546" ;
        double i = Double.parseDouble(h) ;  //แปลง string เป็น double
        i = i+86.2686 ; 
        System.out.println(i);
        String j = "864.54f" ;
        float k = Float.parseFloat(j) ;
        System.out.println(k);

        System.out.println(j);  
        System.out.println("การแปลงชนิดอื่นเป็น String"); 
        int l = 100 ;
        // String m = l ; ทำไม่ได้ 
        String m = String.valueOf(l) ;
        m = m+85 ;
        System.out.println(m);

    }

}
