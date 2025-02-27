package jan2025;

public class ReverseWordsInString {

	public static void main(String[] args) {

		String str ="My Name is Amit Aslekar";
		String[] arr = str.split(" ");
		
		String result = "";
		
		
		for(String ele : arr){
			int end = ele.length()-1;
			while(end >= 0){
				result += ele.charAt(end);
				end--;
			}
			result+= " ";
		}
		
		String r2="";
		int i = arr.length-1;
		while(i >=0 ){
			r2+= arr[i];
			r2+= " ";
			i--;
		}
			
		System.out.println(result);
		System.out.println(r2);
	}

}
