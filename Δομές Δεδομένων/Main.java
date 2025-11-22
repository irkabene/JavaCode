import java.util.Stack;

public class Main{
    public static void main(String[] args) {
       Stack<String> stackA = new Stack<String>(); 
        //Stack is the name of class
        //<String> is the type of objects
        //stack (with blue color) is the name of our variable
        stackA.push("Christos"); //add a string
        stackA.push("Alex");
        stackA.push("Eirini");

        String theGirl = stackA.pop(); //removes the top object from stack and saves it in theGirl variable

        //System.out.println(stackA.isEmpty()); checks if the stack is empty
        //System.out.println(theGirl);
        //System.out.println(stackA.peek());
        System.out.println(stackA);
        
    }


}