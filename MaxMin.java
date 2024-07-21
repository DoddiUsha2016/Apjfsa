package apjfsa;

public class MaxMin {

	public static void main(String[] args) {
		int num[]= {50,54,30,68,75};
		int min=num[0];//Assume number for minimum
		int max=num[0];//Assume number for maximum
		for(int i=0;i<num.length;i++) {
			if(min>num[i])//checking the  condition with another elements in the array
				min=num[i];
			if(max<num[i])//checking condition with another elements in the array
				max=num[i];

	}
		System.out.println("Maximum number="+max);//to print maximum number
		System.out.println("Minimum number="+min);//to print minimum number

}
}
