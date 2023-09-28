public class CopyCons {
        public static void main(String[] args) {
            Student s1 = new Student("Rahul",1332);
            s1.marks[0] = 100;
            s1.marks[1] = 90;
            s1.marks[2] = 89;
            Student s2 = new Student(s1);
            s1.marks[2] = 34;

            for(int i= 0;i<3;i++){
                System.out.print(s2.marks[i] +" ");
            }
        }
}
class Student {
    String name;
    int roll;
    int marks[] = new int[3];
    Student(){
       System.out.println("constructor is called");
    }
    Student(String name, int roll){
         this.name = name;
         this.roll = roll;
    }
    Student(Student s1){
        this.name = s1.name;
        this.roll = s1.roll;
        for(int i = 0;i<3;i++){
            this.marks[i] = s1.marks[i];
        }

    }
}
