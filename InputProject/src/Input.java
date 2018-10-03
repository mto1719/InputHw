/**
 * 
 * @author Matthew To
 *
 */
import java.util.Scanner;

public class Input {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Rectangle length: ");
			double length = scanner.nextDouble();
		System.out.println("Rectangle width: ");
			double width = scanner.nextDouble();
		scanner.close();
		double area = length*width; 
		double perimeter = (2*length)+(2*width);
		double diagonal = Math.sqrt((length*length)+(width*width));
		System.out.printf("area: %15.2f\n", area);
		System.out.printf("perimeter: %10.2f\n", perimeter);
		System.out.printf("diagonal: %11.2f\n", diagonal);
	}

}
