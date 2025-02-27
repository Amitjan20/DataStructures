package jan2025;

import java.util.Stack;

public class RemoveAdjacentDuplicates {
	
	public static void main(String args[]){
		
		String str = "eaabccbc";
		
		Stack<Character> s = new Stack<>();
		
		for(int i=0;i<str.length();i++){
			if(!s.isEmpty() && s.peek().equals(str.charAt(i)))
				s.pop();
			else
				s.push(str.charAt(i));
		}
		
		String result = "";
		while(!s.isEmpty()){
			result += s.pop();
		}
		
		System.out.println(result);
	}

}
