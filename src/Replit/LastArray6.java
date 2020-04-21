package Replit;

public class LastArray6 {
    public static void main(String[] args) {

        int[] a ={1,2,3,6};
        int[] b= {1,4,5};

       // System.out.println(firstLast6(b));
        System.out.println(maxEnd3(a));

    }

    public static boolean firstLast6(int[] nums) {

        for (int i=0; i<nums.length; i++)
            if (nums[0] == 6 || nums[nums.length - 1] == 6) {

                return true;
            }

        return false;

    }

    public int sum3(int[] nums) {

        int sum=0;

        for (int i=0; i<nums.length;i++){


            sum =+ nums[i];

        }

        return sum;

    }

    public static int[] maxEnd3(int[] nums) {

        int[] maxend;
        if(nums[0]>nums[2]){

            maxend= new int[]{nums[0],nums[0],nums[0]};

        }
        else {

            maxend= new int[]{nums[0],nums[0],nums[0]};


        }
        return maxend;

    }
}
