import java.util.ArrayList;
import java.util.List;

public class SummationPractice {
    public static void main(String[] args) {
        ArrayList<Integer> myIntegers = new ArrayList<>();
        myIntegers.add(4);
        myIntegers.add(7);
        myIntegers.add(2);
        myIntegers.add(5);
        System.out.println(calculateSum(myIntegers));

    }
    public static int calculateSum(ArrayList<Integer> integers) {
        int sum = 0;
        for (int myInt : integers) {
            sum+=myInt;
        }
        return sum;
    }

}
