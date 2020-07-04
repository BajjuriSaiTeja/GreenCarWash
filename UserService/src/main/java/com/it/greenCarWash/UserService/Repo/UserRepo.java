package com.it.greenCarWash.UserService.Repo;

import com.it.greenCarWash.UserService.Model.UserDAO;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepo extends MongoRepository<UserDAO, String> {

    UserDAO findByUserName(String username);
}
