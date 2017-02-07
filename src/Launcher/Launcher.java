package Launcher;
import java.util.Scanner;
import ConnectionMySQL.ConnectionManager;

public class Launcher {

	public static void main(String[] args) {
		System.out.println("Welcome to Hippodrome !!");

		ConnectionManager.loadDriver();
		
		showMenu();
		
		System.out.println("Java, out.");
	}
	
	private static void showMenu() {

		String menuStr = "\nWhat do you want to do ?";
		menuStr+= "\n1 - Add a Poney";
		menuStr+= "\n2 - Add a Jockey";
		menuStr+= "\n3 - Add a Course";
		menuStr+= "\n4 - Find rank";
		menuStr+= "\n5 - Start race"; 
		menuStr+= "\n6 - Quit";
		
		Scanner scanner = new Scanner(System.in);
		
		String entry = "";
		
		while(!entry.equals("8")) {
			
			System.out.println(menuStr);
			
			entry = scanner.nextLine();
			
			int entryInteger = 0;
			try {
				entryInteger = Integer.parseInt(entry);
			} catch (NumberFormatException e) {
				System.out.println("Please select one option.");
				continue;
			}
			
			switch(entryInteger) {
			
			case 1:
				System.out.println("Add a Poney");
				break;
			/*case 2:
				menuHandler.menuFindPlace();
				break;
			case 3:
				menuHandler.menuEditPlace();
				break;*/
			case 4:
				System.out.println("Find a Rank");
				break;
			/*case 5:
				menuHandler.menuAddTrip();
				break;
			case 6:
				menuHandler.menuFindTrip();
				break;
			case 7:
				menuHandler.menuRemoveTrip();
				break;*/
			default:
				System.out.println("Menu option unkown.");
				continue;
			}

			
		}
		
		scanner.close();
	}

}
