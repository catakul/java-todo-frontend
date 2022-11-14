package com.example.backend.controller;

import com.example.backend.model.ToDo;
import com.example.backend.service.ToDoService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api")
public class BackendApplicationController {
    private ToDoService toDoService;

    public BackendApplicationController(ToDoService toDoService) {
        this.toDoService = toDoService;
    }
    @PostMapping("/todo")
    public ToDo addToDo(@RequestBody ToDo toDo) {
        return toDoService.addToDo(toDo);
    }
    @GetMapping("/todo")
    public List<ToDo> getToDos(){
        return toDoService.getToDos();
    }

    @GetMapping("/todo/{id}")
    public ToDo getToDosById(@PathVariable String id){
        return toDoService.getToDo(id);
    }
    @PutMapping("/todo/{id}")
    public ToDo editToDo(@PathVariable String id, @RequestBody ToDo toDoToEdit) {
        return  toDoService.editToDo(id, toDoToEdit);
    }
    @DeleteMapping("/todo/{id}")
    public String removeToDo(@PathVariable String id) {
        return toDoService.removeToDo(id);
    }
}


















































//
//@RestController
//@RequestMapping("api")
//public class ShopController {
//
//    private ShopService shopService;
//
//    public ShopController(ShopService shopService) {
//        this.shopService = shopService;
//    }
//
//    @GetMapping("products")
//    public List<Product> getAllProducts() {
//        return shopService.listProducts();
//    }
//
//    @GetMapping(path = "/products/{id}")
//    public Product getIdProduct(@PathVariable String id) {
//        return shopService.getProduct(id);
//    }
//
//    @GetMapping("orders")
//    public List<Order> getAllOrders() {
//        return shopService.listOrders();
//    }
//
//    @GetMapping(path = ("/orders/{id}"))
//    public Order getIdOrder(@PathVariable String index) {
//        return shopService.getOrder(index);
//    }
//
//    @PostMapping("products")
//    public Product addProduct(@RequestBody Product product) {
//        return shopService.addProduct(product);
//    }
//
//    @PostMapping
//    public Order addOrder(@RequestBody List<String> productIds) {
//        return shopService.addOrder("1", productIds);
//    }
//
//}
