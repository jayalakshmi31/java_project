package jayalakshmi;
	import java.util.*;

	public class EmployeeSearch {
	    public static void main(String[] args) {
	        Scanner sc = new Scanner(System.in);

	        int size, i;
	        String criteria, value;

	        System.out.println("Enter the size:");
	        size = sc.nextInt();
	        sc.nextLine();

	        String[] names = new String[size];
	        int[] ages = new int[size];
	        String[] mobileNumbers = new String[size];
	        String[] departments = new String[size];

	        for (i = 0; i < size; i++) {
	            System.out.println("Enter name:");
	            names[i] = sc.nextLine();
	            System.out.println("Enter " + names[i] + "'s Department:");
	            departments[i] = sc.nextLine();
	            System.out.println("Enter " + names[i] + "'s Mobile number:");
	            mobileNumbers[i] = sc.nextLine();
	            System.out.println("Enter " + names[i] + "'s Age:");
	            ages[i] = sc.nextInt();
	            sc.nextLine();
	        }

	        System.out.println("Enter the criteria you want to search (name/department/age/mobile_number):");
	        criteria = sc.nextLine();
	        System.out.println("Enter the value:");
	        value = sc.nextLine();

	        System.out.println("Matching values are:\n");

	        for (i = 0; i < size; i++) {
	            if (search(names[i], departments[i], mobileNumbers[i], ages[i], criteria, value)) {
	                System.out.println("Employee name is: " + names[i]);
	                System.out.println(names[i] + "'s Department is: " + departments[i]);
	                System.out.println(names[i] + "'s Mobile number is: " + mobileNumbers[i]);
	                System.out.println(names[i] + "'s Age is: " + ages[i]);
	                System.out.println();
	            }
	        }
	    }

	    public static boolean search(String name, String department, String mobileNumber, int age, String searchCriteria, String searchValue) {
	        switch (searchCriteria.toLowerCase()) {
	            case "name":
	                return name.equalsIgnoreCase(searchValue);
	            case "department":
	                return department.equalsIgnoreCase(searchValue);
	            case "mobile_number":
	                return mobileNumber.equalsIgnoreCase(searchValue);
	            case "age":
	                try {
	                    int searchAge = Integer.parseInt(searchValue);
	                    return age == searchAge;
	                } catch (NumberFormatException e) {
	                    return false;
	                }
	            default:
	                return false;
	        }
	    }
	}


