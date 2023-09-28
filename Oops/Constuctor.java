public class Constuctor {
        public static void main(String[] args) {

            // Student s1 = new Student();
            // Student s2 = new Student("Paawan");
            Student s3 = new Student("Saurabh","0157CY211099");
            // Student s4 = new Student();

            System.out.println( s3.name + "'s roll no is " + s3.roll);
            
        }
}
class Student{
    String name;
    String roll;

    Student(){
        System.out.println("Constuctor is called");
    }

    Student(String name){
        this.name = name;
    }
    Student(String name, String roll){
        this.name = name;
        this.roll = roll;
    }
    

}
