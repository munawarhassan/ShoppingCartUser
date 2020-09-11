package com.ibm.demo.shoppingcartuser.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.ibm.demo.shoppingcartuser.model.User;

@Repository
public interface ShoppingCartUserRepository extends JpaRepository<User, Integer> {
	
	User findById(long id);

}
