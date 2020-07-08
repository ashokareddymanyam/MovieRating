package com.movierating.api.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.movierating.api.entity.Customer;

@Repository
public interface CustomerRepository extends JpaRepository<Customer, Long> {

}
