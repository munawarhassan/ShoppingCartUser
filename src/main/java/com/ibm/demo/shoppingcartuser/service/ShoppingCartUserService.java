package com.ibm.demo.shoppingcartuser.service;

import org.springframework.cloud.netflix.ribbon.RibbonClient;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;
import com.ibm.demo.shoppingcartuser.model.User;
import com.ibm.demo.shoppingcartuser.repo.ShoppingCartUserRepository;

import lombok.RequiredArgsConstructor;
import lombok.extern.java.Log;


@Component
@RibbonClient(name = "currencyconversionfactorservice")
@RequiredArgsConstructor
@Log
@Service
public class ShoppingCartUserService {
	
	final private ShoppingCartUserRepository  userrepo;
	
	public ResponseEntity<?> adduser(User user) {
		try {
			userrepo.save(user);
		} catch (Exception ex) {
			//return ResponseEntity.status(HttpStatus.BAD_REQUEST).body(new PromoEngineException(ex.getMessage()));
		}

		return ResponseEntity.ok("successfully added in DB");
	}

	
	public ResponseEntity<?> updateuser(User user) {
		try {
			if (userrepo.findById(user.getId()) != null) {
				userrepo.save(user);
				log.info(" Record Updated Successfully");
				return ResponseEntity.ok("Record Updated Successfully");
			} else {
				return ResponseEntity.ok("Record Not Found");
			}
		} catch (Exception ex) {
			//return ResponseEntity.status(HttpStatus.BAD_REQUEST).body(new PromoEngineException(ex.getMessage()));
			return null;
		}
	}
	
	
	public ResponseEntity<?> deleteuser(User user) {
		try {
			if (userrepo.findById(user.getId()) != null) {
				userrepo.delete(user);
				log.info(" Record Deleted Successfully");
				return ResponseEntity.ok("Record Updated Successfully");
			} else {
				return ResponseEntity.ok("Record Not Found");
			}
		} catch (Exception ex) {
			//return ResponseEntity.status(HttpStatus.BAD_REQUEST).body(new PromoEngineException(ex.getMessage()));
			return null;
		}
	}
		
		
	

}
