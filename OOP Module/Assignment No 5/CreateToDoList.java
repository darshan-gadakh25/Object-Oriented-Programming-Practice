import java.util.ArrayList;
import java.util.Scanner;

public class CreateToDoList {

	public static void main(String[] args) throws ToDoException {

		ArrayList<String> makeToDoList = new ArrayList<String>();

		Scanner sc = new Scanner(System.in);
		String decision = "yes";
		while (decision.equalsIgnoreCase("yes")) {
			System.out.println("==================================================");
			System.out.println("Choose 1: Add ToDo in list");
			System.out.println("Choose 2: view ToDo in list");
			System.out.println("Choose 3: Delete ToDo in list");
			System.out.println("Choose 4: Exit");
			System.out.println("==================================================");
			System.out.println("Enter which task you want to perform: ");
			int choice = sc.nextInt();
			sc.nextLine();

			try {

				switch (choice) {
				case 1:
					System.out.println("Enter to do:");
					String todo = sc.nextLine();
					makeToDoList.add(todo);
					break;

				case 2:
					System.out.println("Todays Todo list: ");
					if (makeToDoList.isEmpty()) {
						System.out.println("The ToDo list is Empty:");
					} else {
						for (int i = 0; i < makeToDoList.size(); i++) {
							System.out.println(i + ": " + makeToDoList.get(i));
						}
					}
					break;

				case 3:
					System.out.println("which todo do you want to remove in list: ");
					int index = sc.nextInt();
					if(makeToDoList.isEmpty()) {
						System.out.println("The ToDo List is Empty1");
					}

					if (index < 0 || index >= makeToDoList.size()) {
						throw new ToDoException("Please enter a valid index to remove todo!!!");
					} else {
						System.out.println("Removed: " + makeToDoList.remove(index));
					}

					break;

				case 4:
					decision = "no";
					break;

				default:
					System.out.println("Enter valid option!!!!");
					break;
				}
				System.out.println();
			} catch (ToDoException e) {
				System.out.println(e.getMessage());
			}
		}

		System.out.println("Thank you for using ToDo List");
	}
}

class ToDoException extends Exception {
	ToDoException(String msg) {
		super(msg);
	}
}
