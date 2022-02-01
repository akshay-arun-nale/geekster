import java.util.Scanner;

class SquareRoot{

	public int squareRoot(int num){
	int l = 0 , r = num / 3 , m = 0;
	
	while( r >= l ){
	m = (l+r)/2;
	if((m*m) == num) return m;  
	if((m*m) > num) r = --m;
	else l = ++m;
	}
	
	return m;
	}

	public static void main(String args[]){
	
	Scanner sc = new Scanner(System.in);
	int num = sc.nextInt();
	
	SquareRoot sq = new SquareRoot();
	System.out.println(sq.squareRoot(num));
	}
}
