import javax.swing.text.AbstractDocument.LeafElement;

public class Matrix_2 {
    public static void main(String[] args) {
        System.out.println("Array 2 มิติ");
        int[][] x = 
        {
            {1,2,3},
            {4,5,6},
            {7,8,9},
            {10,11,12}
        };
        System.out.println("x[0][1] = "+x[0][1]); //แถวที่1 ตัวที่ 2
        System.out.println("มีกี่แถว : "+x.length); //มีกี่แถว
        for(int rows = 0 ;rows<x.length;rows++)
        {
            for(int columns = 0 ;columns<x[rows].length;columns++)
            {
                System.out.println("แถวที่ "+rows+" คอลัมน์ที่ "+columns+" เก็บค่า "+x[rows][columns]);
            }
        }
    }
}
