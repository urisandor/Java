package Guide;

import java.util.Scanner;

public class whileloop {
    
    public static void main(String[] args) {
        
        //while loop = exetuces a block of code as long as a it's condition remains true

        Scanner scanner = new Scanner(System.in);
        String name = "";

        while (name.isBlank()) {
            System.out.print("Enter your name: ");
            name = scanner.nextLine();

        }

        System.out.println("Hello "+name);

        scanner.close();
    }
}
