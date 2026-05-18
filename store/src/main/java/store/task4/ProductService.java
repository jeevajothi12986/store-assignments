package store.task4;
import org.springframework.stereotype.Service;
import java.util.ArrayList;
import java.util.List;

    @Service  // This class contains business logic
    public class ProductService {

        // This is our "database" — lives in memory
        private List<Product> productList = new ArrayList<>();
        private int nextId = 1; // Auto-increment ID counter

        //ADD
        public Product addProduct(Product product) {
            product.setId(nextId++); // assign ID then increment counter
            productList.add(product);
            return product;
        }

        // LIST
        public List<Product> getAllProducts() {
            return productList;
        }

        // UPDATE
        public Product updateProduct(int id, Product updatedProduct) {
            for (Product p : productList) {
                if (p.getId() == id) {
                    p.setName(updatedProduct.getName());
                    p.setPrice(updatedProduct.getPrice());
                    p.setQty(updatedProduct.getQty());
                    return p; // return updated product
                }
            }
            return null; // product not found
        }

        // DELETE
        public boolean deleteProduct(int id) {
            return productList.removeIf(p -> p.getId() == id);
            // removeIf returns true if something was deleted, false if not found
        }
    }

