

public class BinaryString {
    public static void main(String[] args) {
        consOnes(3, 0, "");
    }

    public static void consOnes(int n ,int lastPlace,String str){
       if(n==0){
        System.out.println(str);
        return;
       }
        
        

        //kaam
        consOnes( n-1, 0 , str+"0" );
        if(lastPlace == 0){
            consOnes(n-1, 1, str+"1");
        }
    }
}
