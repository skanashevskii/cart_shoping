package com.example.spring_cart.services;


import com.example.spring_cart.repository.CartRepository;
import org.springframework.stereotype.Service;

import java.util.List;


@Service
public class CartShoppingServiceImpl {
    private final CartRepository cartRepository;

    public CartShoppingServiceImpl(CartRepository cartRepository) {
        this.cartRepository = cartRepository;
    }

    public void addProduct(List<Integer> idProd){
        this.cartRepository.addProduct(idProd);
    }

public List<Integer> getProd(){
        return this.cartRepository.getProd();
}



}
