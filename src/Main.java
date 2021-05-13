import javax.swing.*;
import java.util.Arrays;

public class Main {
    public static void main(String[] args){
        Timetaken tk = new Timetaken();
        GenerateArray gg = new GenerateArray();
        System.out.println(Arrays.toString(gg.generatedArray()));
        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                new Plot().setVisible(true);
            }
        });
    }
}
