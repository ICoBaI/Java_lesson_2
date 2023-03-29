/**
 * program
 */
import java.util.Arrays;
import java.io.FileWriter;
import java.io.IOException;
public class Buble {

    public static void main(String[] args) {
        int[] arr = new int[10];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = (int) Math.round(Math.random() * 99);
            System.out.println(arr[i]);
        }
        boolean isSorted = false;
        int buf;
        while(!isSorted) {
            isSorted = true;
            for (int i = 0; i < arr.length-1; i++) {
                if(arr[i] > arr[i+1]){
                    isSorted = false;
                    buf = arr[i];
                    arr[i] = arr[i+1];
                    arr[i+1] = buf;
                }
        try (FileWriter fw = new FileWriter("log.txt", true)) {
            for (int j = 0; j < arr.length; j++) {
                String a = Integer.toString(arr[j]);
                fw.append(a).append(" ");
                }
                fw.append('\n');
            } catch (IOException e) {
                e.printStackTrace();
            }
        System.out.println(Arrays.toString(arr));
        }
    } 
    }
}

