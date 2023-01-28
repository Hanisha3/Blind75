package blind75LeetCode;

public class ProductOfArrayExceptself {
	public static void product(int arr[]) {
		int result[]=new int[arr.length];
		int lprod[] = new int[arr.length];
		int rprod[] = new int[arr.length];
		lprod[0]=1;
		rprod[arr.length-1]=0;
		for(int i=1; i < arr.length; i++) {
			lprod[i]=arr[i-1]*lprod[i-1];
		}
		for(int j=arr.length-2; j >=0; j--) {
			rprod[j]=arr[j+1]*rprod[j+1];
		}
		for(int i=0; i < arr.length; i++) {
			result[i]=lprod[i]*rprod[i];
		}
		for(int i=0; i < result.length; i++) {
			System.out.print(result[i]+",");
		}
		return;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[] = {1,2,3};
		product(arr);
	}

}
