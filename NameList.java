import java.util.ArrayList;

public class NameList {

    public static void main(String[] args) {
        // Initialize an ArrayList to store names
        ArrayList<String> names = new ArrayList<>();

        // Adding sample names to the list
        names.add("Coniie");
        names.add("Eddie");
        names.add("James");
        names.add("Jason");
        names.add("Tod");

        // Displaying initial list and information
        System.out.println("Names in the list: " + names);
        System.out.println("Total number of names: " + names.size());
        System.out.println("First name in the list: " + names.get(0)); // Accessing the first name
        System.out.println("Last name in the list: " + names.get(4)); // Accessing the last name

        // Looping through the list to print each name
        System.out.println("Looping the list:");
        for (String name : names) {
            System.out.println(name);
        }

        // Removing the first name from the list
        names.remove(0);
        System.out.println("Names after removal: " + names);

        // Displaying updated list information
        System.out.println("Total number of names: " + names.size());
        System.out.println("First name in the list: " + names.get(0)); // Updated first name
        System.out.println("Last name in the list: " + names.get(names.size() - 1)); // Updated last name

        // Looping through the updated list
        System.out.println("Looping the list:");
        for (String name : names) {
            System.out.println(name);
        }

        // Removing another name from the list
        names.remove(0);
        System.out.println("Names after second removal: " + names);
    }
}
