import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Random;

public class Main {

    public static void main(String[] args) {
        long startTime = System.nanoTime();
        int[] array = new int[1000];
        Random r = new Random();
        for(int i= 1;i<=1000;i++) {
            array[i-1] = r.nextInt(10)+ i*i;
        }
        long endTime = System.nanoTime();
        System.out.println("执行时间为："+(endTime-startTime)+"ns");
        System.out.println(Arrays.toString(array));
    }
}
