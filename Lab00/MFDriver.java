// Team Beasts - Tim Marder, Max Millar, William Lu
// APCS2 pd02
// Lab#00 -- But What Does The Data Say?
// 2018-02-09



public class MFDriver{

    public static void populate(int[][] matrix){

        int num = 1;
        for (int i = 0; i < matrix.length; i ++){
            for (int j = 0; j < matrix[i].length; j ++){
                matrix[i][j] = num;
                num++;
            }
        }

    }
    
    public static void main(String[] args){

        long timeStart, timeEnd;
        int[][] m;
        System.out.println("Size(1D),Time(ns)");
        for (int i = 1; i <= 1000; i ++){
            m = new int[i][i];
            populate(m);
            timeStart = System.nanoTime();
            MatrixFinder.search(m, i);
            timeEnd = System.nanoTime();
            System.out.println(i + "," + (timeEnd - timeStart));
        }
    }
    
}
