import java.util.Scanner;

public class LinearSearch {
	private static int search(int arr[],int k) {
		for(int i=0;i<arr.length;i++) {
			if(arr[i]==k) {
				return i;
			}
		}
		return -1;
	}
	public static void main(String[] args) {
		int array[]= {12,23,4,-1,345,54};
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a key to check:");
		int key=sc.nextInt();
		sc.close();
		int index=search(array,key);
		if(index>=0) {
	  System.out.println("the key is located at this index of the array: "+index);
	}
		else {
			System.out.println("key is not in the array");
		}

}
}