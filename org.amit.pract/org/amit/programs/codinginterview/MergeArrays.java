package org.amit.programs.codinginterview;

public class MergeArrays {

	public static void main(String[] args) {
		
		
		int arr1[] = {1, 3, 5, 7};
		int arr2[] = {2, 4};
		

		
		merge(arr1, arr1.length, arr2, arr2.length);
	}
	
	public static void merge1(int[] arr1, int len1, int[] arr2, int len2){
		
		int i = 0, j = 0, k=0;
		int[] answer = new int[len1+len2];
		while(i<len1 && j < len2){
			if(arr1[i] < arr2[j]){
				answer[k] = arr1[i];
				i++;
			}else{
				answer[k] = arr2[j];
				j++;
			}
			k++;
		}
		while(i < len1){
			answer[k] = arr1[i];
			i++;
			k++;
		}
		while(j < len2){
			answer[k] = arr2[j];
			j++;
			k++;
		}
	}
	
	
	public static void merge2(int[] arr1, int len1, int[] arr2, int len2){
		
		
		while(len1 > 0 && len2 >0){
			if(arr1[len1-1] < arr2[len2-1]){
				arr1[len1+len2-1] = arr1[len1-1];
				len1-=2;
			}else{
				arr1[len1+len2-1] = arr2[len2-1];
				len2-=2;
			}
		}
		while(len2 > 0){
			arr1[len1+len2-1] = arr2[len2-1];
			len2-=2;
		}
	}
	public static int[] combine(int[] a, int[] b){
        int length = a.length + b.length;
        int[] result = new int[length];
        System.arraycopy(a, 0, result, 0, a.length);
        System.arraycopy(b, 0, result, a.length, b.length);
        for(int q=0;q<result.length;q++){
			System.out.println(result[q]);
		}
        return result;
    }

    public static void merge(int A[], int m, int B[], int n) {
	 
	        while(m > 0 && n > 0){
	            if(A[m-1] > B[n-1]){
	                A[m+n-1] = A[m-1];
	                m--;
	            }else{
	                A[m+n-1] = B[n-1];
	                n--;
	            }
	        }
	 
	        while(n > 0){
	            A[m+n-1] = B[n-1];
	            n--;
	        }
	        for(int q=0;q<A.length;q++){
				System.out.println(A[q]);
			}
	    }

	public static int[] mergeinDiff(int[] a, int[] b) {

	    int[] answer = new int[a.length + b.length];
	    int i = 0, j = 0, k = 0;
	    while (i < a.length && j < b.length)
	    {
	        if (a[i] < b[j])
	        {
	            answer[k] = a[i];
	            i++;
	        }
	        else
	        {
	            answer[k] = b[j];
	            j++;
	        }
	        k++;
	    }

	    while (i < a.length)
	    {
	        answer[k] = a[i];
	        i++;
	        k++;
	    }

	    while (j < b.length)
	    {
	        answer[k] = b[j];
	        j++;
	        k++;
	    }

	    for(int q=0;q<answer.length;q++){
			System.out.println(answer[q]);
		}
	    return answer;
	}
}
