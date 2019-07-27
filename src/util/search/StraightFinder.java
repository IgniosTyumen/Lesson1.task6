package util.search;

public final class StraightFinder {

    public static final int[] findAndReturnSteps(int[] input, int search){
        int length = input.length;
        int steps = 0;
        for (int i=0;i<=length-1;i++){
            steps++;
            if (input[i]==search){
                return new int[] {i+1, steps};
            }
        }
        return new int[] {-1,steps};
    }
}
