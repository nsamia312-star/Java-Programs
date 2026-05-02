import java.util.Scanner;

public class Switch {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String fruit;
        
      do{ 
        System.out.print("Enter fruit Name");
         fruit = sc.next();
         switch (fruit) {
            case "Mango":
                System.out.println("KING OF FRUITS");
                break;
                case "Apple":
                    System.out.println("SWEET FRUIT");
                    break;
                    case "Orange":
                        System.out.println("WINTER FRUIT");
                        break;
                        case "exit":
                            System.out.println("Thank You for Asking");
                            break;
            default:
                System.out.println("Invalid Input");
                break;
        }
      } 
      while (!fruit.equals("exit"));
       
        
      }
    }
    

