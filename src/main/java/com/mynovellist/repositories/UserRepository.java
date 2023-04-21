package com.mynovellist.repositories;

//============================================{ Imports }============================================//
import com.mynovellist.model.User;
import org.springframework.data.jpa.repository.JpaRepository;
//============================================{ END Imports }============================================//

public interface UserRepository extends JpaRepository<User, Long> {


}
