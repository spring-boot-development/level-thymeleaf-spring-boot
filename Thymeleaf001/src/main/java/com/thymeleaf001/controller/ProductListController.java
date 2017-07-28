package com.thymeleaf001.controller;

import com.thymeleaf001.models.Product;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import java.util.ArrayList;

/**
 * Created by hiemseyha on 7/28/17.
 */

@Controller
public class ProductListController {

    @RequestMapping(value = "/products", method = RequestMethod.GET)
    public String product(Model model) {

        final ArrayList<Product> products = new ArrayList<Product>();
        Product product = new Product();
        products.add(product);
        product.setName("List Product 002");
        products.add(product);
        products.add(product);
        products.add(product);
        products.add(product);

        product.setCount(products.size());



        model.addAttribute("products", products);
        return "productlist";
    }
}
