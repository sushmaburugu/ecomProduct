package com.ibm.casestudy.ecommerce.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.ibm.casestudy.ecommerce.entity.User;

@Repository
public interface UserRepository extends JpaRepository<User, Long> {
}
