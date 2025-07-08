
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Drive{

	public static void main(String[] args) throws FileNotFoundException {
		//LinkedList<Integer> lolo=new LinkedList<>();
		File file_flights=new File("flights.txt") ;
		Scanner input=new Scanner(file_flights);
		System.out.println(input.nextLine());
       // String[] str=s.split(",");
        //lolo.insert(str);
        //lolo.traverse();

	}

}