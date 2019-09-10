import java.util.ArrayList;

public class Search {
    public static void main(String[] args) {

        String searchString = args[0];

        // Create arraylist and add names
        ArrayList<String> names = new ArrayList<String>();
        names.add("John Doe");
        names.add("Jane Doe");
        names.add("Bob Bobson");
        names.add("Alice Alison");
        names.add("Steve Ballmer");

        System.out.println("====== Matches ======");
        for (int i = 0; i < names.size(); i++) {
            // IndexOf could alternatively be used for this
            // in which case it would be compared if a string 
            // on the current index has an index of the search term
            // and if it does, match, to print it out.
            if (names.get(i).contains(searchString)) {
                System.out.println(names.get(i));
            }
        }
    }
}