package jan2025;

public class PallindromeNumber {
	
	public static void main(String args[]){
		
		int num = 12321;
		int div = 1;
		
		while( num /div >= 10)
			div = div*10;
			
		
		while(num != 0){
			
			int left = num / div;
			int right = num % 10;
			
			if(left != right)
				System.out.println("not pallindrime");
			
			num = (num%div) /10;
			div /= 100;
		}
		
		
		
		
		
		}

	}

