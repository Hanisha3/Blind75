package blind75LeetCode;

public class MaximumSubArray {
	public static int maxsubArray(int arr[]) {
		int max_so_far = Integer.MIN_VALUE;
		int max_now = 0;
		for(int i = 0; i < arr.length; i++) {
			max_now=max_now+arr[i];
			if(max_so_far<max_now)
				max_so_far=max_now;
			if(max_now<0)
				max_now=0;				
		}
		return max_so_far;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[] = { -2, -3, 4, -1, -2, 1, 5, -3};
		System.out.print(maxsubArray(arr));

	}
}

