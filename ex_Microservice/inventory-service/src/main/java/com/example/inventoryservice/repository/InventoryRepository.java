package com.example.inventoryservice.repository;

import com.example.inventoryservice.model.InventoryItem;
import com.example.inventoryservice.model.InventoryStatus;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public interface InventoryRepository extends JpaRepository<InventoryItem, Long> {
    Optional<InventoryItem> findByProductId(Long productId);
    List<InventoryItem> findByStatus(InventoryStatus status);
    List<InventoryItem> findByQuantityLessThan(Integer quantity);
} 