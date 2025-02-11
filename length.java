import java.util.Scanneer;
public class length{
   public static void main(String args[]){
   Scanner scanner = new Scanner(System.in);

    System.out.print("Enter a String:");
    String str = scanner.nextLine();

    int length = str.length();
    System.out.println("Length of the string:" + length);

    scanner.close();
   }
}

