package laboratoriski.prodavnica.Controller;

import laboratoriski.prodavnica.model.Category;
import laboratoriski.prodavnica.model.Manufacturer;
import laboratoriski.prodavnica.model.Product;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import java.util.ArrayList;
import java.util.List;

@Controller
public class ProductController {

    List<Product> products;

    public ProductController() {
        products = new ArrayList<>();
        products.add(
                new Product(1, "Nike225", "Patiki", "sdfg", new Category(1, "Patiki"), new Manufacturer(1, "Nike")
                )
        );
        products.add(
                new Product(2, "Adidas IO", "Patiki", "sdfg", new Category(2, "Patiki"), new Manufacturer(2, "Nike")));

        products.add(
                new Product(3, "Adidas456", "Patiki", "sdfg", new Category(3, "Patiki"), new Manufacturer(3, "Nike")));
        products.add(
                new Product(4, "Puma K", "Trenerki", "sdfg", new Category(3, "Patiki"), new Manufacturer(3, "Nike")));
        products.add(
                new Product(5, "UA", "Trenerki", "sdfg", new Category(3, "Patiki"), new Manufacturer(3, "Nike")));
        products.add(
                new Product(6, "Puna 45", "Patiki", "sdfg", new Category(3, "Patiki"), new Manufacturer(3, "Nike")));

    }

    @RequestMapping(value= "/products", method = RequestMethod.GET)
    public String getProducts(Model model){
        model.addAttribute("products",products);
        return "products";
    }
}

