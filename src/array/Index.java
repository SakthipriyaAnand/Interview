package array;

public class Index {

	public static void main(String[] args) {
//		int[] a = new int[5];
//		a[0]=1; 
//		a[1]=2;
//		a[2]=3;
//		a[3]=4;
//		a[4]=5;
//
//
//		// Index of the element to remove
//		int r = 2;
//
//		if (r>=0 && r<a.length) {                     // Check if the index is valid
//
//			int[] newArray = new int[a.length-1];      // Create a new array with one less element
//
//			for (int i=0; i<r; i++) {                // Copy elements before the index
//				newArray[i] = a[i];
//			}
//
//			for (int i=r+1; i<a.length; i++) {      // Copy elements after the index
//				newArray[i-1] = a[i];
//			}
//
//			a=newArray;                                 // Update the original array reference
//
//			for (int element:a) {                          // Print the updated array
//				System.out.print(+element + " ");
//			}
//		} else {
//			System.out.println("Invalid index to remove.");
//		}
//	
	//-------------------------------------------------------------------------
		
		int[] b= {11,22,33,44,55};
		int[] b1= new int[b.length-1];
		
		int removeIndex =2;
		for(int i: b) {
			System.out.print(i+ " ");
		}
		System.out.println();
	for (int i = 0, j=0; i < b.length; i++) {
		if(i==removeIndex) {
			continue;
		}
		b1[j]=b[i];
		j++;
	}
	for(int i:b1) {
		System.out.print(i+" ");
	}
	}
}
