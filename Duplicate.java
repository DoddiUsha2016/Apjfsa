package apjfsa;
 //class declaration
public class Duplicate {
     // main function
	public static void main(String[] args) {
		int arr[]= {23,45,37,56,37,45}; //declaring array elements
		
		int count=0;
		//To check duplicate values
		for(int i=0;i<arr.length;i++) { 
			for(int j=i+1;j<arr.length;j++) {
				if(arr[i]==arr[j]) {
					System.out.println(arr[j]); //print duplicate values
					count++;
				}
				
			}
		}	
			System.out.println("Count="+count); //print the count
		
		}

	}


