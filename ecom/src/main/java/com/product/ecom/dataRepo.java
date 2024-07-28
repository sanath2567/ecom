package com.product.ecom;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface dataRepo extends JpaRepository<productItem, Integer> {

}