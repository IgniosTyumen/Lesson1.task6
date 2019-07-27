package util.search;

public abstract class BinarySearch {

    public static int[] find(int[] input, int search){

        int firstIndex = 0;
        int lastIndex = input.length - 1;
        int steps = 0;
        // условие прекращения (элемент не представлен)
        while(firstIndex <= lastIndex) {
            steps++;

            int middleIndex = (firstIndex + lastIndex) / 2;
            // если средний элемент - целевой элемент, вернуть его индекс
            if (input[middleIndex] == search) {
                return new int[]{middleIndex,steps};
            }

            // если средний элемент меньше
            // направляем наш индекс в middle+1, убирая первую часть из рассмотрения
            else if (input[middleIndex] < search)
                firstIndex = middleIndex + 1;

                // если средний элемент больше
                // направляем наш индекс в middle-1, убирая вторую часть из рассмотрения
            else if (input[middleIndex] > search)
                lastIndex = middleIndex - 1;

        }
        return new int[]{-1,steps};
    }

}
