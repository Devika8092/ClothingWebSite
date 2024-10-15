package com.example.DressShoppingApp.service;

import com.example.DressShoppingApp.model.Dress;
import com.example.DressShoppingApp.repository.DressRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class DressService {

    @Autowired
    private DressRepository dressRepository;

    // Fetch all dresses ordered by view_count
    public List<Dress> getAllDressesOrderedByViewCount() {
        return dressRepository.findAllByOrderByViewCountDesc();
    }

    // Fetch a single dress by id and increment its view count
    public Dress getDressById(Long id) {
        Dress dress = dressRepository.findById(id).orElseThrow(() -> new RuntimeException("Dress not found"));
        dress.setViewCount(dress.getViewCount() + 1); // Increment view count
        dressRepository.save(dress); // Save the updated dress with new view count
        return dress;
    }
}
