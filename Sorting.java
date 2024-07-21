package apjfsa;
     //class declaration
public class Sorting {
     //main function
	public static void main(String[] args) {
		int arr[]= {34,45,65,87,23,13,59}; //declaring array elements
		//condition to perform sorting
		for(int i=0;i<arr.length-1;i++) {
			for(int j=0;j<arr.length-i-1;j++) {
				if(arr[j]>arr[j+1]) {
					int temp=arr[j];
					arr[j]=arr[j+1];
					arr[j+1]=temp;  //store the checked values
					
				}
			}
			
		}
		for(int i=0;i<arr.length;i++) {
			System.out.println(arr[i]);  //print sorted elements
		}
			

	}

}
