public class GridWays {
    public static void main(String[] args) {
       System.out.println( gridWays(2 , 3, 0, 0) );
    }

    public static int gridWays(int n, int m, int i, int j){

        //Base Case 
        if(i==n-1 && j==m-1){
            return 1;
        }else if (i==n || j==m){
            return 0;
        }

        // Recurssion 
        int waysL = gridWays(n, m, i, j+1);
        int waysD = gridWays(n, m, i+1, j);
        

        return waysL + waysD;

    }
}
