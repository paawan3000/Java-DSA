public class BubbleSort {

    public static void main(String[] args) {
        int array[] = { 5,2,3,9,1};

        for(int i = 0;i<4;i++){
            for(int j = i+1;j<5;j++ ){
            if(array[j]<array[i]){
                int temp = array[i];
                array[i] = array[j];
                array[j] = temp;
            }
            }
        }

        for(int i = 0;i<5;i++){
            System.out.print(array[i] + " ");
        }

        
    }
}
