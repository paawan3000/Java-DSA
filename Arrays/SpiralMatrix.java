public class SpiralMatrix {
    public static int findK(int A[][], int n, int m, int k)
    {
	    int  startRow = 0;	
	    int  startCol = 0;
	    int endRow = n - 1;
	    int endCol = m - 1;
	    int count = 0;
	    
	   
	    while(startRow <= endRow && startCol <= endCol){
	        
	       
	        
	        
	        for(int j=startCol; j<=endCol; j++){
	            count++;
	            if(k==count){
	            return A[startRow][j];
	        }
	             
	        }
	        for(int i=startRow +1; i<=endRow; i++){
	            count++;
	            if(k==count){
	            return A[i][endCol];
	        }
	           
	        }
	        for(int j=endCol-1; j>=startCol; j--){
	            count++;
	            if(k==count){
	            return A[endRow][j];
	        }
	             
	        }
	        for(int i=endRow-1; i>=startRow+1; i--){
	            count++;
	            if(k==count){
	            return A[i][startCol];
	        }
	            
	        }
	        
	        startRow++;
	        startCol++;
	        endRow--;
	        endCol--;
	        
	        
	        
	    }
	    
	    return 0;
	    
    }

    public static void main(String[] args) {
        int arr[][] = {{1,2,3,4},{5,6,7,8},{9,10,11,12},{13,14,15,16}};
        int n = arr.length;
        int m = arr[0].length;
       System.out.println( findK(arr,n,m,8));
    }
}
