package blind75LeetCode;

public class ThreeSum {
	public static void threeSum(int arr[], int n) {
		for(int i =0; i < arr.length-2; i++) {
			for(int j =i+1; j < arr.length-1; j++) {
				for(int k =j+1; k < arr.length; k++) {
					if(arr[i]+arr[j]+arr[k]==n)
						System.out.print(arr[i] + "," + arr[j] + "," + arr[k]);
				}
			}
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int A[] = { 1, 4, 45, 6, 10, 8 };
        int sum = 50;
        threeSum(A,sum);
	}

}
