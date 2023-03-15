package findingMatrixTransposon;


public class FindingMatrixTransposon {
	
	public static void printMatrixandTransposon(int[][] matrix) {
		for(int[] row: matrix) {
			for(int column: row) {
				System.out.print(column + " ");
			}
			System.out.println();
		}
	}

	public static void main(String[] args) {
		 int[][] matrix = {
	                {1, 2, 3},
	                {4, 5, 6},
	        };
		 
		 int row = matrix.length;
		 int column = matrix[0].length;

	     int[][] transposon = new int[column][row];
	     
	     for(int i = 0; i < matrix.length; i++) {
	    	 for(int j = 0; j < matrix[i].length; j++) {
	    		 transposon[j][i] = matrix[i][j];
	    	 }
	     }
	     
	     System.out.println("The old Matrix: ");
	     printMatrixandTransposon(matrix);
	     
	     System.out.println("The new Transposon: ");
	     printMatrixandTransposon(transposon);

	}

}
