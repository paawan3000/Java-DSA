public class AbstractClass {
    public static void main(String[] args) {

        Humans h1 = new Humans();
        h1.walk();
        h1.ChangeColor();
        Mammals m1 = new Mammals();
        m1.walk();
        m1.sleep();
        m1.skinColor = "Grey";
        System.out.println(m1.skinColor);
    }
}

abstract class Animal {

    String skinColor;

    Animal(){
        skinColor = "Brown";
    }

    void sleep(){
        System.out.println("Sleeping 8 hours"); 
    }

    abstract void walk();
}

class Mammals extends Animal {
    void walk(){
        System.out.println("Walks Like a King");
    }
}

class Humans extends Animal {
    void ChangeColor(){
        skinColor = "Black";
        System.out.println(skinColor);
    }
    void walk(){
        System.out.println("Walking with two legs");
    }
}
