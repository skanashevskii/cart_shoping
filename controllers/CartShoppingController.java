package com.example.spring_cart.controllers;


import com.example.spring_cart.services.CartShoppingServiceImpl;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;


import java.util.List;

@RestController
@RequestMapping("/store/order")

public class CartShoppingController {

    private final CartShoppingServiceImpl cartShoppingService;

    public CartShoppingController(CartShoppingServiceImpl cartShoppingService) {
        this.cartShoppingService = cartShoppingService;
    }

    @GetMapping("/add")
    public String addProduct(@RequestParam("id") List<Integer> idProd) {
        cartShoppingService.addProduct(idProd);
        return "idProduct: "+idProd;

    }

    @GetMapping("/get")
    public  List<Integer> getAll() {
    return cartShoppingService.getProd();

    }
}
