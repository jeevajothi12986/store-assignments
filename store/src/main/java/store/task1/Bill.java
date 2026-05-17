package store.task1;

public class Bill {
    int[] itemIds;       // stores which item IDs were purchased
    int[] quantities;    // stores how many of item was bought
    Item[] itemCatalog;  // the full list of available items

    public Bill(int[] itemIds, int[] quantities, Item[] itemCatalog) {
        this.itemIds = itemIds;
        this.quantities = quantities;
        this.itemCatalog = itemCatalog;
    }

    // This method calculates and prints the total bill
    public void calculateTotal() {
        double total = 0;

        System.out.println("\n===== BILL =====");

        for (int i = 0; i < itemIds.length; i++) {

            // Find the matching item from catalog
            for (Item item : itemCatalog) {

                if (item.id == itemIds[i]) {
                    double subtotal = item.unitPrice * quantities[i];
                    System.out.println(item.name + " x" + quantities[i] +
                            " = Rs." + subtotal);
                    total += subtotal;
                }
            }
        }

        System.out.println("================");
        System.out.println("Total: Rs." + total);
    }

}
