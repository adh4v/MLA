package com.test.repository;

import com.test.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User,Integer> {
	
	//@Query("select u from User u where u.fname=?1",nativeQuery=true")
	//public User getByFirstName(String fname);

}
