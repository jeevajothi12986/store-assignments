package store.task4;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController           // This class handles API requests
@RequestMapping("/product") // All URLs here start with /product
public class ProductController {

    @Autowired  // Spring automatically connects ProductService here
    private ProductService productService;

    //POST/product/add
    @PostMapping("/add")
    public ResponseEntity<Product> addProduct(@RequestBody Product product) {
        Product saved = productService.addProduct(product);
        return ResponseEntity.ok(saved);
    }

    //GET/product/list
    @GetMapping("/list")
    public ResponseEntity<List<Product>> getAllProducts() {
        return ResponseEntity.ok(productService.getAllProducts());
    }

    //PUT/product/update/{id}
    @PutMapping("/update/{id}")
    public ResponseEntity<String> updateProduct(
            @PathVariable int id,
            @RequestBody Product updatedProduct) {

        Product result = productService.updateProduct(id, updatedProduct);

        if (result != null) {
            return ResponseEntity.ok("Product updated successfully");
        } else {
            return ResponseEntity.status(404).body("Product not found");
        }
    }

    //DELETE/product/delete/{id}
    @DeleteMapping("/delete/{id}")
    public ResponseEntity<String> deleteProduct(@PathVariable int id) {
        boolean deleted = productService.deleteProduct(id);
        if (deleted) {
            return ResponseEntity.ok("Product deleted successfully");
        } else {
            return ResponseEntity.status(404).body("Product not found");
        }
    }
}
