import java.util.*;
public class StackBrackets {
    static Boolean bracketCheck(String exp)
    {
        Stack<Character> stack = new Stack<>();
    for(int i =0;i<exp.length();i++)
    {
        char ch = exp.charAt(i);
    // Openeing Bracket
    if(ch == '(' || ch == '[' || ch == '{')
        stack.push(ch); 
    //Closing brackets
    if(ch == ')'||ch==']'||ch=='}')
    {
        char top = stack.pop();
        if((ch == ')'  && top!= '(')||
            (ch == '}' && top!='{')||
            (ch == ']' && top!=']') )
            {
                return false;
            }
    }
    } 
    return stack.isEmpty();
    }
    public static void main(String[] args) {
     
    Scanner sc = new Scanner(System.in);

        System.out.print("Enter expression: ");
        String exp = sc.nextLine();

        if (bracketCheck(exp)) {
            System.out.println("Brackets are balanced.");
        } else {
            System.out.println("Brackets are not balanced.");
        }
    }
}
   
    

