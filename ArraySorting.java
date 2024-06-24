package apjfsa;

public class ArraySorting {

	public static void main(String[] args) {
		 int i = 0;
		    
			int arr[]=  {1,3,5,7,9,11};
			int temp = arr[arr.length-1];
			temp=arr[0];
			arr[5]=arr[0];
			arr[4]=arr[1];
			arr[3]=arr[2];
			arr[2]=arr[3];
			arr[0]=arr[5];
			for(i=0;i>0;i--) {
				arr[i]=arr[i-1];
				
			}
	       arr[0]=(int) temp;
	       System.out.println("Rotated Array:"+arr[i]);
		}

	}
	
		

	


