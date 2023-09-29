package array;

public class IndexSwap {

	public static void main(String[] args) {
		
		int[] a= new int[10];
		a[0]=1;
		a[1]=2;		
		a[2]=3;		//a[2]=4=a[3]
		a[3]=4;		//a[3]=5=a[4]
		a[4]=5;		//a[4]=0
		a[5]=6;
		
		for (int i = 0; i < a.length; i++) {	
			if(i>=2) {							//remove the value in index 2
				for(int j=i;j< a.length-1;j++) {
				a[j]=a[i+1]; //a[2]=a[3]
				
				System.out.println("a["+j+"]--> "+a[j]);	//2--4	3--5  4--6  5--0  6--0  7--0  8--0
				i++;
				}
				
			}
//			else {
//				System.out.println(i+"--"+a[i]);			//0--1	1--2
//			}
			
			System.out.println("a["+i+"]--> "+a[i]);		//0--1	1--2  9--0	
		}
		
	}

}
