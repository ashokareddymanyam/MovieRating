package com.movierating.api.repositories;


import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.movierating.api.entity.CustomerData;

@Repository
public interface CustomerDataRepository extends JpaRepository<CustomerData, Long>{

	@Query("select data.id from CustomerData data where data.firstName =:firstName and data.lastName =:lastName")
	Optional<Long> getIDUsingFirstLastName(@Param("firstName") String firstName, @Param("lastName") String lastName);
	
}
