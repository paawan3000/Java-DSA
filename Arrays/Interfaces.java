public class Interfaces<interfaces> {
    public static void main(String[] args) {
        Rook r1 = new Rook();
        r1.move();
        Bishop b1 = new Bishop();
        b1.move();
        Queen q1 = new Queen();
        q1.move();
        
    }

}
interface Chess {
    void move(); 
}

class Queen implements Chess {
   public void move() {
        System.out.println("UP,DOWN,LEFT,RIGHT,DIAGONAL(IN ALL 4 DIRECTION)");
    }
}
class Rook implements Chess {
   public void move() {
        System.out.println("UP,DOWN,LEFT,RIGHT");
    }
}
class Bishop implements Chess {
   public void move() {
        System.out.println("DIAGONAL(IN ALL 4 DIRECTION)");
    }
}
