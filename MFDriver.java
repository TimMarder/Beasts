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

    	long timeStart;
    	long timeEnd;
    	long timeDiff;
    	long timeFinal = 0;
    	int[][] m;
    	for (int i = 1000 ; i <= 10000 ; i += 100) {
    		for (int ctr = 0 ; ctr < 10 ; ctr++) {
    			m = new int[i][i];
    			populate(m);
    			timeStart = System.nanoTime();
    			MatrixFinder.search(m , i);
    			timeEnd = System.nanoTime();
    			timeDiff = timeEnd - timeStart;
    			timeFinal += timeDiff;
    		}
    		timeFinal /= 10;
    		System.out.println(i + "," + timeFinal);
    	}
    }
    
}
