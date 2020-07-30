public class InsertionSort {
	private static void sort(int arr[]) {
		for(int i=1;i<arr.length;++i) {
			int key=arr[i];
			int j=i-1;
			while(j>=0 && arr[j]>key) {
				arr[j+1]=arr[j];
				j=j-1;
			}
			arr[j+1]=key;
			}
		}
	private static void printArray(int arr[]) {
		for(int i=0; i<arr.length;i++) {
			System.out.print(arr[i]+" ");
		}
	}
	public static void main(String[] args) {
		int array[]={4,2,1,3,-2,-4,12,9};
		sort(array);
		printArray(array);
	}

}
