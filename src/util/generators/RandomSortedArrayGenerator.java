package util.generators;

import java.util.Arrays;
import java.util.Random;

public abstract class RandomSortedArrayGenerator {

    public static int[] generateArray(int length, int seed){
        Random random = new Random();
        int[] result = new int[length];
        result = Arrays.stream(result).map(element->random.nextInt(seed)+1).sorted().toArray();
        return result;
    }
}
