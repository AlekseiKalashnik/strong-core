package ua.epam.javacore.lesson_05_collections;

import java.util.ArrayList;
import java.util.List;

public class FindAllNumbersDisappearedInArray {
    public static void main(String[] args) {
        int[] arr = new int[]{3, 4, 6, 2, 6};
        ArrayList<Integer> arrayList = (ArrayList<Integer>) findDisappearedNumbers(arr);
    }
    public static List<Integer> findDisappearedNumbers(int[] nums) {

        for(int i=0; i<nums.length; i++){
            int num = nums[i];
            while(nums[num-1] != num){
                int temp = nums[num-1];
                nums[num-1] = num;
                num = temp;
            }

        }

        List<Integer> missingNums = new ArrayList<>();
        for(int i=0; i<nums.length; i++){
            if(nums[i] != i+1){
                missingNums.add(i+1);
            }
        }
        return missingNums;
    }
}
