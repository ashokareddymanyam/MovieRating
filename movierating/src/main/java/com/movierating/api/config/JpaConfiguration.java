package com.movierating.api.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.transaction.annotation.EnableTransactionManagement;

@Configuration
@EnableJpaRepositories("com.movierating.api.repositories")
@EnableTransactionManagement
public class JpaConfiguration {

}
