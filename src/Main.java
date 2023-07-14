import java.util.Arrays;

public class Main {
    public static void main(String[] args) {

        int[] exampleArray = {0,1,2,3,4,5,6,7,8,9};
        int counter = 0;
        int temp;
        for (int i = 0; i<exampleArray.length-1; i++){
            boolean sorted = true;
            for (int j = 0; j<exampleArray.length-1-i;j++){

                counter++;
                if (exampleArray[j]>exampleArray[j+1]){
                    temp = exampleArray[j];
                    exampleArray[j] = exampleArray[j+1];
                    exampleArray[j+1] = temp;
                    sorted = false;
                }

            }
            if (sorted){
                break;
            }
        }
        Arrays.stream(exampleArray).forEach(System.out::print);
        System.out.println("\n"+counter);
    }
}