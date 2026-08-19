import java.util.Scanner;

public class ProgEx03_CleanVietnameseName {
     public static String cleanName(String s) {
          s = s.trim();
          String[] parts = s.split(" ");
          // for (int i = 0; i < parts.length; i++) {
          // System.out.println(parts[i]);
          // }
          String result = new String();

          // for i loop
          for (int i = 0; i < parts.length; i++) {
               if (!parts[i].isEmpty()) {
                    result += parts[i].substring(0, 1).toUpperCase()
                              + parts[i].substring(1).toLowerCase()
                              + " ";
               }
          }
          // foreach loop
          // for (String p : parts) {
          // if (!p.equals("")){
          // result += p.substring(0, 1).toUpperCase()
          // + p.substring(1).toLowerCase()
          // + " ";
          // }
          // }
          return result.trim();

     }

     public static void main(String[] args) {
          Scanner sc = new Scanner(System.in);

          System.out.print("\nEnter name: ");
          String name = sc.nextLine();

          System.out.println("Cleaned name: " + cleanName(name));
          sc.close();
     }
}
