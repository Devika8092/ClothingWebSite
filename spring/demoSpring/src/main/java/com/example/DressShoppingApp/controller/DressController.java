package com.example.DressShoppingApp.controller;

import com.example.DressShoppingApp.model.Dress;
import com.example.DressShoppingApp.service.DressService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/dresses")
public class DressController {

    @Autowired
    private DressService dressService;

    // Endpoint to get all dresses ordered by view_count
    @GetMapping
    public List<Dress> getAllDresses() {
        return dressService.getAllDressesOrderedByViewCount();
    }

    // Endpoint to get a dress by id and increment view count
    @GetMapping("/{id}")
    public Dress getDressById(@PathVariable Long id) {
        return dressService.getDressById(id);
    }
}
