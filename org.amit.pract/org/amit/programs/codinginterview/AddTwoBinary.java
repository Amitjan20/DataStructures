package jan2025;

public class AddTwoBinary {
	
	// Main driver method
    public static void main(String[] args)
    {
        String x = "011011";
        String y = "1010111";
       
        System.out.println(addBinary(x, y));
    }

	private static String addBinary(String x, String y) {
		int l1 = x.length()-1;
		int l2 = y.length()-1;
		
		int carry = 0;
		
		StringBuilder result = new StringBuilder();
		while(l1 >= 0 || l2 >= 0){
			int sum = carry;
			
			if(l1 >= 0){
				sum += x.charAt(l1) - '0';
			}
			
			if(l2 >= 0){
				sum += y.charAt(l2) - '0';
			}
			
			if(sum == 0 || sum == 1){
				result.append(sum);
				carry=0;
			}else if( sum == 2){
				result.append("0");
				carry = 1;
			}else{
				result.append("1");
				carry =1;
			}
			
			l1--;
			l2--;
				
		}
		 if (carry == 1) {
	            result.append("1");
	        }
	        return result.reverse().toString();
	}

}
