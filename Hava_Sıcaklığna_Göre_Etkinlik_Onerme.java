import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
      int hot;

      Scanner input = new Scanner(System.in);

      System.out.print("Enter Temperature: ");
      hot = input.nextInt();

      if ((hot >= 0) && (hot < 5)) 
      {
          System.out.println("You can ski.");
      } 
      else if ((hot >= 5) && (hot <= 25)) 
      {
          if (hot <= 15) 
          {
            System.out.println("Yoou can go cinema.");
          } 
          else 
          {
              System.out.println("You can go picnic.");
          }
      } 
      else 
      {
          System.out.println("You can go swim.");
      }
    }
}
