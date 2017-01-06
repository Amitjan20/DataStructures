package org.amit.programs.codinginterview;

public class Urlify {

	public static void main(String[] args) {
		
		addJunk("hello amit aslekar howare you");

	}

	private static void addJunk(String string) {
		
		int length = string.length();
		int count = 0, newLength;
		for(int i=0;i<length;i++){
			if(string.charAt(i)==' '){
				count++;
			}
		}
		newLength = length + count *2;
		System.out.println(count);
		System.out.println(length);
		System.out.println(newLength);
		char arr[] = new char[newLength];
		int k=0;
		arr[newLength-1] = '\0';
		for(int j=0;j<length;j++){
			if(string.charAt(j)==' '){
				arr[k] = '%';
				arr[k+1] = '2';
				arr[k+2] = '0';
				k = k + 3;
			}else{
				arr[k] = string.charAt(j);
				k++;
			}
		}
		System.out.println(arr);
		
	}

}
