package store.task1;

import java.util.Scanner;

public class BillingMain {
        public static void main(String[] args) {

            //Create the store's item catalog
            Item[] catalog = {
                    new Item(1, "Pen", 10.0),
                    new Item(2, "Notebook", 50.0),
                    new Item(3, "Pencil", 5.0),
                    new Item(4, "Eraser", 8.0),
                    new Item(5, "Ruler", 20.0)
            };

            //Show available items
            System.out.println("===== Available Items =====");
            for (Item item : catalog) {
                System.out.println("ID: " + item.id +
                        " | " + item.name +
                        " | Rs." + item.unitPrice);
            }

            //Ask user how many items they want to buy
            Scanner sc = new Scanner(System.in);
            System.out.print("\nHow many items do you want to buy? ");
            int count = sc.nextInt();

            int[] selectedIds = new int[count];
            int[] selectedQtys = new int[count];

            //Accept item ID and quantity
            for (int i = 0; i < count; i++) {
                System.out.print("Enter Item ID: ");
                selectedIds[i] = sc.nextInt();
                System.out.print("Enter Quantity: ");
                selectedQtys[i] = sc.nextInt();
            }

            //Create bill and calculate
            Bill bill = new Bill(selectedIds, selectedQtys, catalog);
            bill.calculateTotal();

            sc.close();
        }
}
