import java.util.Stack;
import java.util.LinkedList;

public class App {
public static void main(String[] args) throws Exception {

// ARRAYS
System.out.println("======================================================");
// 1. Create an array of characters of your SURNAME.
    char[] jalalon = { 'J', 'A', 'L', 'A', 'L','O','N' };

// 2. Display each character of the SURNAME in each line.
    for (int i = 0; i < jalalon.length; i++) {
    System.out.println(jalalon[i]);
}

// 3. Display the first character of the SURNAME
    System.out.println(jalalon[0]);

// 4. Display the last character of the SURNAME
    System.out.println(jalalon[6]);

// 5. Display the character of the SURNAME in reverse order
   for (int i = jalalon.length - 1; i >= 0; i--) {
    System.out.println(jalalon[i]);
}


// Linked List
System.out.println("======================================================");
// 1. Create a Linked list of the last six numbers of your STUDENT NUMBER.
LinkedList<String> studentNumber = new LinkedList<>();

studentNumber.add("1");
studentNumber.add("0");
studentNumber.add("1");
studentNumber.add("9");
studentNumber.add("5");
studentNumber.add("0");

System.out.println(studentNumber);

// 2. Add "*" to the head/front of the Linked list
studentNumber.addFirst("*");


// 3. Add "*" to the tail/end of the Linked list
studentNumber.addLast("*");

// 4. Display the Linked list
System.out.println(studentNumber);

// 5. Display the last character of the Linked list. 
System.out.println(studentNumber.get(7));

// 6. Replace the last character of the Linked list with the exclamation symbol (!). 
studentNumber.set(7, "!");

// 7. Remove the first character of the Linked list
studentNumber.remove(0);

// // 8. Display the LinkedList
System.out.println(studentNumber);


// Stack
System.out.println("======================================================");
// 1. Create a Stack of characters of your SURNAME.

Stack<String> surname = new Stack<>();

surname.push("J");
surname.push("A");
surname.push("L");
surname.push("A");
surname.push("L");
surname.push("O");
surname.push("N");

// 2. Print the Stack
System.out.println(surname);

// 3. Add a "INF214" to the stack.
surname.push(" ");
surname.push("I");
surname.push("N");
surname.push("F");
surname.push("2");
surname.push("1");
surname.push("4");

// 4. Print the Stack
System.out.println(surname);

// 5. Remove "INF214" and add "CCDATRCL-INF214"
surname.pop();
surname.pop();
surname.pop();
surname.pop();
surname.pop();
surname.pop();
surname.pop();

surname.push("");
surname.push("C");
surname.push("C");
surname.push("D");
surname.push("A");
surname.push("T");
surname.push("R");
surname.push("C");
surname.push("L");
surname.push("-");
surname.push("I");
surname.push("N");
surname.push("F");
surname.push("2");
surname.push("1");
surname.push("4");
// 6. Print the Stack
System.out.println(surname);
}
}  
