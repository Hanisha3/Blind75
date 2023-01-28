package blind75LeetCode;

public class TwoSumProblem {
	public static boolean twosum(int arr[], int target) {
		int[] sol = new int[2];
		for(int i = 0; i < arr.length-1; i++) {
			int b = target-arr[i];
			for(int j = i+1; j < arr.length; j++) {
				if(arr[j]==b)
					return true;
			}
		}
		return false;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[] = {2,7,11,15};
		int target = 10;
		System.out.print(twosum(arr,target));;
		
	}

}
