package util.generators;

public abstract class HundredGenerator {

    public static int[] generateArray(int length){
        int[] result = new int[length];
        for (int i=0;i<=length-1;i++){
            result[i] = i+1;
        }
        return result;
    }
}
