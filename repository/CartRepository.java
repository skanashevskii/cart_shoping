package com.example.spring_cart.repository;

import org.springframework.stereotype.Repository;
import org.springframework.web.context.annotation.SessionScope;

import java.util.ArrayList;
import java.util.List;

@Repository
@SessionScope
public class CartRepository {
   private final List<Integer> idList = new ArrayList<>();

   public void addProduct(List<Integer> idProd){
       idList.addAll(idProd);
   }
   public  List<Integer> getProd (){
       return this.idList;
   }

}
