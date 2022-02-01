import java.util.Scanner;

class Frequency{
	
	public static int min(int x,int y){
	return x < y ? x : y;
	}
	
	public static int max(int x,int y){
	return x > y ? x : y; 
	}
	
	public static int freq(int nums[],int t){
	int c = 0;
	int l = 0, r = nums.length - 1, m = 0; 
	
	while( l <= r ){
	m = (l+r)/2;
	
	if(nums[m] == t){
	++c;
	int ll = max(0,m-1);
	int rr = min(m+1,nums.length-1);
	
	while(ll >= 0 && nums[ll--] == t) ++c;
	while(rr < nums.length && nums[rr++] == t) ++c;
	return c;
	}
	if(nums[m] > t) r = --m;
	else l = ++m;
	}
		
	return c;
	}
	
	public static void main(String args[]){
	
	Scanner sc = new Scanner(System.in);
	int size = sc.nextInt();
	
	int nums[] = new int[size];	
	for(int i = 0 ; i < size ; ++i)	nums[i] = sc.nextInt();
	
	int t = sc.nextInt();

	System.out.println(freq(nums,t));
	}
}
