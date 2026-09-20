package Driver;
import java.util.Scanner;
import com.yd.assign1.*;

public class DriverMain {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		// Task a
		System.out.println("Task A");
		CalculateGrade a = new CalculateGrade();
		a.CalcGrade(input);
		System.out.println("-----------------------------------------");
		
		//Task b
		System.out.println("Task B");
		CovnvertMilesToKilo b = new CovnvertMilesToKilo();
		b.Convert(input);
		System.out.println("-----------------------------------------");
		
		// Task c
		System.out.println("Task C");
		ConvertLitersToGallons c = new  ConvertLitersToGallons();
		c.Convert(input);
		System.out.println("-----------------------------------------");
		

		// Task d
		System.out.println("Task D");
		CADToUSD d = new CADToUSD();
		d.Convert(input);
		
		input.close();
	}

}
