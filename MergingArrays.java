package apjfsa;
 //class declaration
public class MergingArrays {
    //main function
	public static void main(String[] args) {
		//declaring arrays
		int arr1[]={2,4,6,8,10};
		int arr2[]= {3,5,7,9};
		int a= arr1.length;
		int b=arr2.length;
		int c=a+b; 
		int arr3[]=new int[c];
		
		for(int i=0;i<arr1.length;i++) {
			arr3[i]=arr1[i];
			
		}
		for(int i=0;i<arr2.length;i++) {
			arr3[a+i]=arr2[i];
		}
		for(int i=0;i<c;i++) {
			System.out.println(arr3[i]); //print merge array
		}
		
	}

}
