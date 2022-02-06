import java.util.Scanner;

class TwoSum{

	public static int[] sum(int nums[],int target){
	int l = 0, r = nums.length-1 ;
	while(l <= r){
	int res = nums[l] + nums[r];
	if(res == target) return new int[] {++l,++r}; 	
	if(res < target) ++l;
	else --r;
	}
	return new int[]{};
	}

	public static void main(String args[]){
	
	Scanner sc = new Scanner(System.in);
	int size = sc.nextInt();
	int []nums = new int[size];
	int target = 0;
	
	for(int i = 0; i < size; ++i)	nums[i] = sc.nextInt();
	target = sc.nextInt();
	
	for(int i: sum(nums,target))	System.out.print(i+" ");	
	}
}
