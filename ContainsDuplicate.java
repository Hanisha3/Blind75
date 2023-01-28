package blind75LeetCode;

import java.util.Arrays;

public class ContainsDuplicate {
	public static boolean containsd(int nums[]) {
		Arrays.sort(nums);
		for(int i = 0; i < nums.length-1; i++) {
			if(nums[i]==nums[i+1])
				return true;
		}
		return false;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int nums[] = {1,2,3};
		System.out.print(containsd(nums));
	}

}
