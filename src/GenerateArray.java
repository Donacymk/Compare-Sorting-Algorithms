import java.util.concurrent.ThreadLocalRandom;

public class GenerateArray{
    public long[] generatedArray(){
        var array = new long[200];
        for (int i=0;i<array.length;i++)
            array[i]= ThreadLocalRandom.current().nextInt(0,1000);

        return array;
    }
}
