package Controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class MainController {

    @RequestMapping("/")
    public String Index() {
        return "index";
    }

    @RequestMapping("/home")
    public String Home() {
        return "home";
    }

    @RequestMapping("/products")
    public String Products() {
        return "products";
    }

    @RequestMapping("/about")
    public String About() {
        return "about";
    }

    @RequestMapping("/productDetails")
    public String ProductDetails() {
        return "productDetails";
    }

    @RequestMapping("/cart")
    public String Cart() {
        return "cart";
    }
}
