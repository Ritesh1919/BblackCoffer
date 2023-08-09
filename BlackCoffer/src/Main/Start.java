package Main;

import java.util.*;
import com.blackcoffer.*;

public class Start {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner obj = new Scanner(System.in);
		System.out.println("Hello Good Morning" + "\n" + "Welcome to Ritesh Project");
		System.out.print("Please press Y/y for get Data (Note:- this data is fetting from DataBase) :- ");
		int input_str = obj.nextInt();

		if (input_str == 1) {
			int counter = 0;

			ArrayList<String[]> arr = DataJDBC.displayData();
			
			for (String[] array : arr) {
				for (String ele : array) {

					System.out.print(ele + " ");

				}
				counter++;
				System.out.println("\n");
			}
			System.out.println(counter);

		} else {
			System.out.print("Condition fail");
		}

	}
}
