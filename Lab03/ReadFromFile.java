import java.io.File;
import java.util.*;
import java.io.FileNotFoundException ;

public class ReadFromFile{
public static void main(String argu[]) throws FileNotFoundException{
	
	int count = 0 ;
	File file = new File("expenses.txt");
	Scanner fileScanner = new Scanner(file);

	while(fileScanner.hasNextLine()){

		System.out.println(fileScanner.nextLine()) ;
		count++;
	
	}
	

		System.out.println("Lines : " + count ) ;


}
}	