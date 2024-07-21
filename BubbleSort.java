package apjfsa;
  //class declaration
public class BubbleSort {
    //main function
	public static void main(String[] args) {
		int arr[]={5,6,3,9,7,2}; //declaring an array
		int i,j;
		for(i=0;i<arr.length-1;i++) {
			for(j=0;j<arr.length-i-1;j++)
				if(arr[j]>arr[j+1]) {
					//swap elements
					int temp=arr[j];
					arr[j]=arr[j+1];
					arr[j+1]=temp;
				}
				
		}
					System.out.println("Sorted Array:");
					for( i=0;i<arr.length-1;i++ ) {
						System.out.println(arr[i]+""); //print sorted array
						
					}
				
			}
		
	}

		
		
		

	


