import util.generators.HundredGenerator;
import util.generators.RandomSortedArrayGenerator;
import util.search.BinarySearch;
import util.search.StraightFinder;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
        int[] array1To100 = HundredGenerator.generateArray(100);
        System.out.println("Перебор");
        System.out.println(Arrays.toString(StraightFinder.findAndReturnSteps(array1To100,79)));
        System.out.println("Бинарный поиск");
        System.out.println(Arrays.toString(BinarySearch.find(array1To100,79)));



        int[] randomArray = RandomSortedArrayGenerator.generateArray(100,150);
        System.out.println("Сгенерированный массив");
        System.out.println(Arrays.toString(randomArray));
        System.out.println("Перебор");
        System.out.println(Arrays.toString(StraightFinder.findAndReturnSteps(randomArray,100)));
        System.out.println("Бинарный поиск");
        System.out.println(Arrays.toString(BinarySearch.find(randomArray,100)));
    }
}
