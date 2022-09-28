import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class pRoductsum {

    public static void main(String[] args) {
        List<Object> test =
                new ArrayList<Object>(
                        Arrays.asList(
                                5,
                                2,
                                new ArrayList<Object>(Arrays.asList(7, -1)),
                                3,
                                new ArrayList<Object>(
                                        Arrays.asList(6, new ArrayList<Object>(Arrays.asList(-13, 8)), 4))));
       int a= productSum(test);

        System.out.println(a);
    }


        // Write your code here.
        public static int productSum(List<Object> array) {
            return productSumHelper(array, 1);
        }
        public static int productSumHelper(List<Object> array, int multiplier) {
            int sum = 0;
            for (Object el : array) {
                if (el instanceof ArrayList) {
                    @SuppressWarnings("unchecked")
                    ArrayList<Object> ls = (ArrayList<Object>) el;
                    sum += productSumHelper(ls, multiplier + 1);
                } else {
                    sum += (int) el;
                }
            }
            return sum * multiplier;
        }
    }

