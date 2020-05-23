package ch06;

public class BubbleSort { 
	void bubbleSort(int arr[]) { 
		int a = arr.length; 
		for (int b = 0; b < a-1; b++) 
			for (int c = 0; c < a-b-1; c++) 
				if (arr[c] > arr[c+1]) 
				{ 
					int temp = arr[c]; 
					arr[c] = arr[c+1]; 
					arr[c+1] = temp; 
		} 
	} 
	void printArray(int arr[]) { 
		int a = arr.length; 
		for (int b = 0; b < a; ++b) 
			System.out.print(arr[b] + " "); 
		System.out.println(); 
	} 

	
	public static void main(String args[]) { 
		BubbleSort x = new BubbleSort(); 
		int arr[] = {82, 12, 41, 38, 19, 26, 9, 48, 20, 55, 8, 32, 3}; 
		x.bubbleSort(arr); 
		System.out.println("Urutan array :"); 
		x.printArray(arr); 
	} 
} 

