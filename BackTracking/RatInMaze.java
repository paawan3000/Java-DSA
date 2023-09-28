public class RatInMaze {
    public static void main(String[] args) {
        int maze[][] = 
        {{1,0,0,0},
        {1,1,1,1},
        {0,1,1,0},
        {1,1,1,1}};
         int ansmaze[][] = new int[maze.length][maze.length];

        mazeSolver(maze,0,0,ansmaze);
        // print(maze);
    }

    public static void print(int maze[][]){
        System.out.println("--------Ways of Solutin-------");
        for(int i = 0 ;i<maze.length;i++){
            for(int j =0;j<maze.length;j++){
                System.out.print(maze[i][j]+" ");
            }
            System.out.println();
        }
    }

     public static void mazeSolver(int maze[][],int x,int y,int ansmaze[][]){
       
        //Base condition
        if(x== maze.length -1 && y== maze.length -1){
            ansmaze[x][y] = 1;
              print(ansmaze);
              return;
        }else if(x==maze.length || y==maze.length){
            return ;
        }

        // Recursion
        boolean visited = false;
         
        if(maze[x][y]==1){
            if(visited){
                 
            }
            ansmaze[x][y] = 1;
            mazeSolver(maze, x, y+1,ansmaze);
            mazeSolver(maze, x+1, y,ansmaze);
            
        }else{
            return; 
        }


     }
}
