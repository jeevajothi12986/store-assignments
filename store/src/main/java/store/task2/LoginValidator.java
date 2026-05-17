package store.task2;
import java.util.Scanner;

public class LoginValidator {
    // ── Email check ──────────────────────────────────────────
    // Valid format: something@something.something
    public static boolean isValidEmail(String email) {
        return email.contains("@") && email.contains(".");
    }

    // ── Password check ───────────────────────────────────────
    // Must be at least 6 characters
    public static boolean isValidPassword(String password) {
        return password.length() >= 6;
    }

    // ── Show product list after successful login ─────────────
    public static void showProductList() {
        System.out.println("\n===== Product List =====");
        System.out.println("1. Pen        - Rs.10");
        System.out.println("2. Notebook   - Rs.50");
        System.out.println("3. Pencil     - Rs.5");
        System.out.println("4. Eraser     - Rs.8");
        System.out.println("5. Ruler      - Rs.20");
        System.out.println("========================");
    }

    // ── Main method ──────────────────────────────────────────
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("===== Login =====");

        // Step 1: Ask for email
        System.out.print("Enter Email: ");
        String email = sc.nextLine();

        // Step 2: Ask for password
        System.out.print("Enter Password: ");
        String password = sc.nextLine();

        // Step 3: Validate both
        boolean emailOk    = isValidEmail(email);
        boolean passwordOk = isValidPassword(password);

        // Step 4: Show result
        if (!emailOk) {
            System.out.println("\n❌ Invalid email format.");
            System.out.println("   Example valid email: abc@gmail.com");

        } else if (!passwordOk) {
            System.out.println("\n❌ Password too short.");
            System.out.println("   Password must be at least 6 characters.");

        } else {
            System.out.println("\n✅ Login successful! Welcome, " + email);
            showProductList();
        }

        sc.close();
    }

}
