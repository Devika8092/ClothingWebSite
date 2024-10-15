package com.example.DressShoppingApp.repository;

import com.example.DressShoppingApp.model.Dress;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface DressRepository extends JpaRepository<Dress, Long> {

    // Find all dresses ordered by view_count in descending order
    List<Dress> findAllByOrderByViewCountDesc();
}
