package jan2025;

public class ZigZag {

	public static void main(String[] args) {

		//String str = "paypalishiring";
		String str = "paypalishiring"; //abdc
		String arr[] = new String[3];
		
		int row = 0;
		int step = 0;
	
		for(int i=0;i<str.length();i++){
			char c = str.charAt(i);
			if(arr[row] == null){
				arr[row] = String.valueOf(c);
			}	
			else
				arr[row] += c;
			if(row == 0) 
				step =  1;
			if(row==arr.length-1)
				step = - 1;
			
			row = row + step;
			
		}
		String result = "";
		for(int i=0;i<arr.length;i++){
			 result += arr[i];
			
		}
		
		System.out.println(result);
	}

}
