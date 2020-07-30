
public class BinarySearch {
	private static void search(int arr[],int first,int last,int key) {
		int mid=(first+last)/2;
		while(first<=last) {
		if(arr[mid]<key) {
			first=mid+1;
		}
		else if(arr[mid]==key) {
			System.out.println("Element is found at index: "+mid);
		break;
		}
		else {
			last=mid-1;
		}
		mid=(first+last)/2;
	}
		if(first>last) {
			System.out.println("Element is not found");
		}
	}
	public static void main(String[] args) {
		int array[]= {-1,23,43,55,76,88,100};
		int key=76;
		int first=0,last=array.length-1;
		search(array,first,last,key);
	}

}
