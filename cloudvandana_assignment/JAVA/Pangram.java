import java.util.*;
public class Pangram{
	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		String  str = sc.nextLine();
		int arr[] = new int[26];
		int n = str.length();
		// checking small a-z
		for(int i=0;i<n;i++)
  	{
  		char c = str.charAt(i);
  		
  		if( c>='a' && 'z'>=c)
  		{    			
  			arr[c-'a']++;
  			
  		}
  		
  	
  	}

		boolean flag =true;
		for(int i : arr)
		{
			if(i==0)
			{
				flag = false;
				break;
			}	
	}
	if(flag)
		System.out.print("Pangram");
	else{
		System.out.print("Not a Pangram");
	}
}
}