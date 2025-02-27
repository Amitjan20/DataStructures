package jan2025;

import java.util.Stack;

public class RemoveDups2 {

	public static void main(String[] args) {
		
		String str = "aabbbccdddee";
		Stack<Pair> s = new Stack<>();
		
		for(int i=0;i<str.length();i++){
			if(!s.isEmpty() && s.peek().getC() == str.charAt(i)){
				Pair p = s.pop();
				s.push(new Pair(p.count+1, str.charAt(i)));
				int count = s.peek().getCount();
				if(count == 3)
					s.pop();
				
			}else{
				s.push(new Pair(1,str.charAt(i)));	
			}
		}
		String result = "";
		while(!s.isEmpty()){
			Pair  p = s.pop();
			int count = p.getCount();
			while(count > 0){
				result+=p.getC();
				count--;
			}
			
			
		}
		
		System.out.println(result);
	}

}
