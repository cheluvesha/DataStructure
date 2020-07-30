public class BubbleSort {
private static void sort(int arr[]) {
	int n=arr.length;
	for(int i=0;i<n-1;i++) {
		for(int j=0;j<n-i-1;j++) {
			if(arr[j]>arr[j+1]) {
				int temp=arr[j];
				arr[j]=arr[j+1];
				arr[j+1]=temp;
				}
			}
		}		
}			
	private static void printArray(int array[]) {
		for(int i=0;i<array.length;i++) {
			System.out.print(array[i]+", ");
		}
	}
				
	public static void main(String[] args) {
		int array[]= {23,43,12,10,1,55,19};
		sort(array);
		printArray(array);
	}

}
