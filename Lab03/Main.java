import java.util.* ;

public class Main{

	public static void main(String argu[]){
	
		String str = "One two three four five six one two three four" ;
		
		String array1[] = str.split(" ") ;
		
		for(int i=0 ; i<15 ; i++){

			System.out.println(array1[i]);
		}

		String array2[] = str.split("O") ;
		
		for(int i=0 ; i<15 ; i++){

			System.out.println(array2[i]);
		}

	}

}
