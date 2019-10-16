import java.util.* ;

public class Main{

	public static void main(String argu[]){
	
		String str = "One two three four five six one two three four" ;
		
		String array1[] = str.split(" ") ;
		
		for(int i=0 ; i<array1.length ; i++){

			System.out.println(array1[i]);
		}

		String array2[] = str.split("o") ;
		
		for(int i=0 ; i<array2.length ; i++){

			System.out.println(array2[i]);
		}

	}

}
