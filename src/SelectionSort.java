
public class SelectionSort {
	private static void sort(int arr[]) {
		int n=arr.length;
		for(int i=0;i<n-1;i++) {
		int	min=i;
		for(int j=i+1;j<n;j++) {
			if(arr[j]<arr[min]) {
				min=j;
			}
		}
		int temp=arr[min];
		arr[min]=arr[i];
		arr[i]=temp;	
		}
	}
	private static void printArray(int arr[]) {
		for(int i=0;i<arr.length;i++) {
			System.out.print(arr[i]+" ");
		}
	}
	public static void main(String[] args) {
	int array[]= {54,23,11,2,43,34};
	sort(array);
	printArray(array);
	}

}
