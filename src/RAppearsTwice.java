import java.util.Arrays;

public class RAppearsTwice {
    public static void main (String[] args) {
        // System.out.println (appearsTwice ( "Java", "Java is fun Java is good" ));
        int[] arr1 = {1, 2, 3, 555, 3, 6, 6};
        int[] newArr = new int[arr1.length];
        for (int i = 0; i < arr1.length; i++) {
            newArr[i] = arr1[i];
        }
        Arrays.sort ( newArr );
        System.out.println ( isSort ( arr1 ) );
        System.out.println (isSort (newArr ));
        System.out.println ( Arrays.toString ( arr1 ) );
        System.out.println ( Arrays.toString ( newArr ) );
    }


    public static boolean appearsTwice (String target, String sentence) {
        int count = 0;

        for (int i = 0; i < (sentence.length ()) - (target.length () - 1); i++) {
            if (sentence.substring ( i, (i + target.length ()) ).equals ( target )) {
                count++;
            }
        }
        if (count == 2) {
            return true;
        }

        return false;
    }

    public static boolean isSort (int[] nums) {
        boolean cond = false;
        int[] newArr = new int[nums.length];
        for (int i = 0; i < nums.length; i++) {
            newArr[i] = nums[i];
        }
        Arrays.sort ( newArr );

        for (int i = 0; i < newArr.length; i++) {
            if (!(newArr[i] == nums[i])) {
                cond = false;
                break;
            } else cond = true;
        }

        return cond;
    }

}
