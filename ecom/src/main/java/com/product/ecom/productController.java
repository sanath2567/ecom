package com.product.ecom;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

@RestController
@RequestMapping("/api")
@CrossOrigin
public class productController {

    // @Autowired
    // private productService service;
    @Autowired
    private DataService service;

    @GetMapping
    public String get() {
        return "Hello World";
    }

    @GetMapping("/products")
    public List<productItem> getAllId() {
        return service.getAllDataItems();
    }

    @GetMapping("/product/{id}")
    public Optional<productItem> getproduct(@PathVariable int id) {
        return service.getElementId(id);
    }

    @PostMapping("/update")
    public productItem createDataItem(@RequestBody productItem newDataItem) {
        service.addElement(newDataItem);
        return newDataItem;
    }
}
