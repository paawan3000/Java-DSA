public class GetSet {

    public static void main(String[] args) {
        Pen p1 = new Pen();
        p1.setColor("Blue");
        p1.setTip("Bold");
        p1.setColor("Red");
        System.out.println(p1.getColor() +" "+ p1.getTip());
        

        GelPen g1 = new GelPen();
        g1.setgrip("Smooth");
        // System.out.println(g1.getgrip());
        g1.setColor("Green");
        g1.setTip("Extra_Bold");
        System.out.println(g1.getColor() + " " + g1.getTip() + " " + g1.getgrip());


    }
    
}

class Pen{
    String tip;
    String color;

    public String getColor() {
        return color;
    }
    public String getTip() {
        return tip;
    }

    public void setColor(String color) {
        this.color = color;
    }
    public void setTip(String tip) {
        this.tip = tip;
    }
}

class GelPen extends Pen{
      String grip;
      public String getgrip(){
        return grip;
      }
      public void setgrip(String grip){
        this.grip = grip;

     }

}