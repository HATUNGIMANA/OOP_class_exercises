import java.lang.Math;
import java.util.Arrays;

public class OopStudents {
    public static void main(String[] args) {
        int[] oopStundentAges = {21, 15, 25, 18, 16, 20, 19, 17, 20, 24, 22, 23, 21, 17, 15, 26};

        int ageSum = 0;

        for (int index = 0; index < oopStundentAges.length; index++){
            ageSum += oopStundentAges[index];
        }
        int maxAge = 0; 
        int minAge = 0;
        for ( int j = 0; j < oopStundentAges.length; j++) {

            if (oopStundentAges[j] > maxAge){
                maxAge = oopStundentAges[j];
                System.out.println("Highest age: " + maxAge);
            }
            if (oopStundentAges[j] < minAge){
                minAge = oopStundentAges[j];
                System.out.println("Min age: " + minAge);
            }
        }
        //for (in k = 0; )

        int averageAge = (ageSum)/oopStundentAges.length;

        System.out.println("Sum of all ages: " + ageSum);
        System.out.println("Average student age: " + averageAge);
    }
    
}
