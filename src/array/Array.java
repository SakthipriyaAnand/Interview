package array;

public class Array {
	public static void main(String[] args) {
	int a[]= {1,2,3,4,5};
	
	int[] a1= {1,2,3,4,5};
	
	int a2[]= new int[10];
	
	a2[0]=1;
	a2[1]=2;
	a2[2]=3;
	a2[3]=4;
	//System.out.println(a2);// it won't print anything it will show only reference value
//	System.out.println(a2[1]);//output is 2 (a2[1]=2)
//	System.out.println(a2[5]);	// output is 0 (it is within 0-9)
//	System.out.println(a2[10]);// it will take from 0-9 hence it will show index out of bond error
	
	for(int i=0;i<a2.length;i++) {
		//for(int k=2;k<i;k++) {
//		if(i==2) {
//				
//				continue;
//		}
		System.out.println(i+"--"+a2[i]);
		//}
		}
	System.out.println("-------------------------------------------");
	for(int j:a2) {
		System.out.println(j);
	}
	System.out.println("-------------------------------------------");
	//---------------- multi dimentional array------------------------
	
	int[][] a3 = new int[2][3];
	a3[0][0]=6;
	a3[1][1]=7;
	System.out.println("Row:"+a3.length);
	for(int i1=0;i1<a3.length;i1++) {
		for(int j1=0;j1<3;j1++) {
			System.out.println(a3[i1][j1]);
	}
	}
	}
}
