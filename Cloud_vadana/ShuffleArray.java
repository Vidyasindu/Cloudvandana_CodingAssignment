import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class ShuffleArray {
    public static void main(String[] args) {
        Integer[] array = {1, 2, 3, 4, 5, 6, 7};
        
        // Convert the array to a list
        List<Integer> list = Arrays.asList(array);
        
        // Shuffle the list using the Collections.shuffle() method
        Collections.shuffle(list);
        
        // Convert the shuffled list back to an array
        array = list.toArray(new Integer[list.size()]);
        
        // Print the shuffled array
        System.out.println(Arrays.toString(array));
    }
}