import java.util.*;

class BinarySearch{
	
	private static int binarySearch(int nums[],int k){
	int l = 0, r = nums.length-1;
	
	while(l <= r){
	int m = (l+r) / 2;
	if(nums[m] == k) return m;
	if(nums[m] < k) l = ++m;
	else  r = --m;
	}
	  
	return -1;
	}
	
	public static void main(String args[]){
	
	//declaration
	Scanner sc = new Scanner(System.in);
	int size = sc.nextInt();
	int nums[] = new int[size];

	//input
	for(int i = 0; i < size ; ++i)	nums[i] = sc.nextInt();
			
	System.out.println("Number to search : ");
	
	//function call
	int r = binarySearch(nums,sc.nextInt());
	System.out.println(r == -1 ? r : ++r);
	}
}
