package Assignment1;


public class ArrayOperations {
	
	public int[] creation(int size) {
		int[] arr = new int[size];
		for(int i=0;i<arr.length;i++) {
			arr[i] = i + (1 * 10);
		}
		return arr;
	}
	
	void display(int[] arr) {
		System.out.print("Array elements are:");
		for(int n:arr) {
			System.out.println(n);
		}
	}
	
	public int sum(int[] arr) {
		int total = 0;
		for(int i:arr) {
			total+=i;
		}
		return total;
	}
	
	public int avg(int[] arr) {
		int total = sum(arr);
		int avg = total / arr.length;
		return avg;
	}
	
	public int minimum(int[] arr) {
		int min = arr[0];
		for(int i=0;i< arr.length;i++) {
			if(arr[i] < min)
				min = arr[i];
		}
		return min;
	}
	
	public int maximum(int[] arr) {
		int max = arr[0];
		for(int i=0;i<arr.length;i++) {
			if(arr[i] > max)
				max = arr[i];
		}
		return max;
	}
	
	public void update(int[] arr) {
		for(int i=0;i<arr.length;i++) {
			arr[i] =arr[i] * 3;
		}
		System.out.println("After updating");
		for(int i:arr) {
			System.out.print(i+"\t");
		}
	}
	
	public void reverse(int[] arr) {
		for(int i=0;i<arr.length/2;i++) {
			int temp = arr[i];
			arr[i] = arr[arr.length-1-i];
			arr[arr.length-1-i] = temp;
		}
		for(int i:arr) {
			System.out.println(i);
		}
	}
	
	public int search(int[] arr,int key) {
		for(int i=0;i<arr.length;i++) {
			if(arr[i] == key)
				return i;
		}
		return -1;
	}

	public static void main(String[] args) {
		ArrayOperations ob = new ArrayOperations();
		int[] array = ob.creation(9);
		ob.display(array);
		System.out.println("Sum of array values:"+ob.sum(array));
		System.out.println("Average of array elements:"+ob.avg(array));
		System.out.println("Minimum value in array:"+ob.minimum(array));
		System.out.println("Maximum value in array:"+ob.maximum(array));
		int result = ob.search(array, 20);
		if(result == -1) {
			System.out.println("Element is not found");
		}else {
			System.out.println("Element is present in the index:"+result);
		}
		System.out.println("After reversing");
		ob.reverse(array);
		ob.update(array);
	}

}
