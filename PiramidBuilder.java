import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class PiramidBuilder {
    public static String[] towerBuilder(int nFloors) {
        List<String> piramid = new ArrayList<String>();
        String material = "*";
        String material2 = "**";
        String space = " ";
        for (int i = 0; i < nFloors; i++) {
            piramid.add(String.join("", Collections.nCopies(nFloors-(i+1), space)) + material
                    + String.join("", Collections.nCopies(nFloors-(i+1), space)));
            material += material2;
        }
        String[] arr = new String[piramid.size()];
        arr = piramid.toArray(arr);
        System.out.println(Arrays.toString(arr));
        return arr;
    }
    public static void main(String[] args) {
        Scanner inputs = new Scanner(System.in);
        int nfloors = inputs.nextInt();
        PiramidBuilder.towerBuilder(nfloors);
        }
}
