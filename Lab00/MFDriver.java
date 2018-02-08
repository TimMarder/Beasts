// Team Beasts - Tim Marder, Max Millar, William Lu
// APCS2 pd02
// Lab#00 -- But What Does The Data Say?
// 2018-02-09

public class MFDriver{

    public static void populate(int[][] matrix){

	/*	int[] row = new int[matrix[0].length];
	int num = 1;
	for (int i = 0; i < row.length; i ++){
	    row[i] = num;
	    num ++;
	    }*/

	int num = 1;
	for (int j = 0; i < matrix.length; j ++){
	    // matrix[j] = row;
	    for (int k = 0; k < matrix.length; k ++){
		matrix[j][k] = num;
		num++;
	    }
	}

    }
    
    public static void main(String[] args){

	long time;
	int[][] m = new int[50][50];
	populate(m);
	time = System.currentTimeMillis();
	//System.out.println(time);
	System.out.println(MatrixFinder.search(m, 50));
	time -= System.currentTimeMillis();
	System.out.println(time);
    }
    
}
