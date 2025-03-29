/*
 * Nama : Maulida Cahya Kurnia
 * NIM  : A11.2023.15470
 */
import java.util.Scanner;

public class QueueDemo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in); // Scanner untuk input pengguna
        System.out.print("\nEnter the queue size: ");
        int size = scanner.nextInt(); // Menerima ukuran antrian dari pengguna
        Queue queue = new Queue(size); // Membuat objek antrian

        char choice;
        do {
            System.out.println("\nQueue Operations:");
            System.out.println("1. Insert");
            System.out.println("2. Remove");
            System.out.println("3. Peek");
            System.out.println("4. Check empty");
            System.out.println("5. Check full");
            System.out.println("6. Size");
            System.out.print("Your Choice? ");
            int option = scanner.nextInt(); // Menerima pilihan operasi dari pengguna

            switch (option) {
                case 1:
                    System.out.print("Enter a value to insert: ");
                    int value = scanner.nextInt(); // Menerima nilai yang akan disisipkan
                    queue.insert(value);
                    break;
                case 2:
                    queue.remove();
                    break;
                case 3:
                    int peekValue = queue.peek();
                    if (peekValue != -1) {
                        System.out.println("Leading Element: " + peekValue);
                    }
                    break;
                case 4:
                    System.out.println("Is the Queue Empty? " + queue.isEmpty());
                    break;
                case 5:
                    System.out.println("Is the Queue Full? " + queue.isFull());
                    break;
                case 6:
                    System.out.println("Size: " + queue.getSize());
                    queue.display();
                    break;
                default:
                    System.out.println("Invalid selection!");
            }

            System.out.print("Do you want to continue (Type y or n)? ");
            choice = scanner.next().charAt(0); // Menerima pilihan untuk melanjutkan
        } while (choice == 'y' || choice == 'Y');

        scanner.close(); // Menutup scanner
    }
}