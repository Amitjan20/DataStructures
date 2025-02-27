package jan2025;

public class CountPrime {

	public static void main(String[] args) {

		int n=10;
		
		int count = 0;
		
		System.out.println(countPrime(n));
		
		
		
	}

	private static int countPrime(int n) {
		
		int count = 0;
		if(n == 2)
			return 1;
		if(n == 3)
			return 2;
		
		int currNum = 4;
		for(int i=currNum;i<=n;i++){
			boolean found = false;
			for(int j=2;j<i;j++){
				if(i%j==0){
					found = true;
					break;
				}
			}
			if(!found)
				count++;
		}
		
		return count+=2;
	}

}
