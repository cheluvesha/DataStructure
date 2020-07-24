public class DynamicArray {
private int array[];
private int count;
private int size;
public DynamicArray() {
	array=new int[1];
	count=0;
	size=1;
}
public void add(int data) {
	if(count==size) {
		growSize();
	}
	array[count]=data;
	count++;
	}
public void growSize() {
	int temp[]=null;
	if(count==size) {
		temp =new int[2*size];	
		
	for(int i=0;i<size;i++) {
		temp[i]=array[i];
	}
	}
array=temp;
size=size*2;
}
public void addAt(int index,int data) {
	if(count==size) {
		growSize();		
	}
	for(int i=count-1;i>=index;i--) {
		array[count+1]=array[i];
	}
	array[index]=data;
}
public void shrinkArray() {
	int temp[]=null;
	if(count>0) {
		temp=new int[count];
		for(int i=0;i<count;i++) {
			temp[i]=array[i];
		}
		size=count;
	}
}
public void remove() {
	if(count>0) {
		array[count-1]=0;
		count--;
	}
}
public void removeAt(int index) {
	if(count>0) {
		array[index]=0;
	}
}
public static void main(String args[]) {
	DynamicArray arr=new DynamicArray();
	arr.add(45);
	arr.add(23);
	arr.add(44);
	System.out.println("Elements in the array:");
	for(int i=0;i<arr.size;i++) {
		System.out.print(arr.array[i]+" ");
	}
	System.out.println();
	System.out.println("shrinking the array:");
	arr.shrinkArray();
	for(int i=0;i<arr.size;i++) {
		System.out.print(arr.array[i]+" ");
	}
	arr.remove();
	System.out.println();
	System.out.println("Elements in the array after removing:");
	for(int i=0;i<arr.size;i++) {
		System.out.print(arr.array[i]+" ");
	}
	arr.addAt(2,34);
	System.out.println();
	System.out.println("Elements in the array after adding at specific position:");
	for(int i=0;i<arr.size;i++) {
		System.out.print(arr.array[i]+" ");
	}
	arr.removeAt(1);
	System.out.println();
	System.out.println("Elements in the array after removing at specific position:");
	for(int i=0;i<arr.size;i++) {
		System.out.print(arr.array[i]+" ");
	}
}
}
