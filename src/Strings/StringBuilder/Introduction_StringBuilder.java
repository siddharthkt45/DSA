// Strings.StringBuilder class is a kind of mutable string
// which was introduced to improve the performance of the String class (which is immutable)

package Strings.StringBuilder;

public class Introduction_StringBuilder {
    public static void main(String[] args) {
        // Strings.StringBuilder class object can be made as:-
        StringBuilder sb = new StringBuilder("Hello");
        
        // it can be printed as:-
        System.out.println(sb);
        
        // it also has a charAt() function which can be used to take out a character
        // from the Strings.StringBuilder object (similar to the charAt() function in the String class)
        char ch = sb.charAt(0);                  // GET
        System.out.println(ch);
        
        // it also has a setCharAt() function which can be used to
        // set a character at a specific position (this function is NOT available in the String class)
        // it takes the index at which you want to make the change
        // and the new character which you want to replace with the old one as the parameters
        sb.setCharAt(0, 'd');           // UPDATE
        System.out.println(sb);
        
        // The Strings.StringBuilder class can make changes to the instance created directly whereas
        // the String class copies the old string to a new instance and then makes the required changes
        // leading to performance issues
        
        // String instances are immutable
        // Strings.StringBuilder instances are mutable
        
        // it also has an insert() function which can be used to
        // insert a new character at a specific position
        // it takes the index at which we want to insert the character
        // and the new character to be inserted as the parameter
        // if we have to insert 'y' at position 2, then:-
        sb.insert(2, 'y');      // INSERT
        System.out.println(sb);
        
        // it also has a deleteCharAt() function which can be used to
        // delete a character from a specific position
        // it takes the index from which we want to delete the character as the parameter
        // if we have to delete from index 3, then:-
        sb.deleteCharAt(3);             // REMOVE
        System.out.println(sb);
        
        // it also has an append() function which can be used to
        // append a string or a character at the last position
        // it takes the new character or the string to be added as the parameter
        // if we have to append 'g', then:-
        sb.append('g');                 // APPEND
        System.out.println(sb);
        
        // to get the length of the Strings.StringBuilder object,
        // it has the same function length() as we had for the String class
        System.out.println(sb.length());
        
        // to measure the performance difference between the String and the Strings.StringBuilder class,
        // we'll do an experiment:-
        int n = 100000;
        
        long start = System.currentTimeMillis();
        String s = "";
        for (int i = 0; i < n; i++) {
            s += i;
        }
        long end = System.currentTimeMillis();
        long duration = end - start;
        System.out.println("String:- " + duration + " milliseconds");
        
        start = System.currentTimeMillis();
        StringBuilder stringBuilder = new StringBuilder();
        for (int i = 0; i < n; i++) {
            stringBuilder.append(i);
        }
        end = System.currentTimeMillis();
        duration = end - start;
        System.out.println("Strings.StringBuilder:- " + duration + " milliseconds");
    }
}