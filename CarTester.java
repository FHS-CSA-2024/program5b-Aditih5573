/*
 Implement a class CarTester
Implement the following methods
addCar
Takes no parameters
Takes user input to set up a new Car
Returns a Car object
main
Set up as a standard main method
Should call addCar at least twice
Should call and print the results of toString for each car
Be sure to use variables with easily recognizable names.
Program Data ##:
N/A
Statements Required:
Input
Output
Variable Assignment
Class Implementation
Sample Output w/ 2 cars:
Please enter the car's name: Honda Civic
Please enter cars miles: 234
Please enter cars gallons: 100
Honda Civic averaged 2.3 m/g
------NEXT CAR-------------------------------------------
Please enter the car's name: Toad Mobile
Please enter cars miles: 13
Please enter cars gallons: 7
Toad Mobile averaged 1.9 m/g
 */
import java.util.Scanner;
public class CarTester {

	public static void main(String[] args) {
	Car c1 = addCar();
	System.out.println(c1);
	Car c2 = addCar();
	System.out.println(c2);
	

	}
	
	public static Car addCar()
	{
		Scanner scanner = new Scanner(System.in);
		System.out.println("Please enter the car's name: ");
		String name = scanner.nextLine();
		System.out.println("Please enter cars miles: ");
		int miles = scanner.nextInt();
		System.out.println("Please enter cars gallons: ");
		int gallons = scanner.nextInt();
		Car c = new Car(name, miles, gallons);
		return c;
		
	}


}
