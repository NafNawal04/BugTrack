package com.bugtrack.user_service.repository;


import org.springframework.data.mongodb.repository.MongoRepository;
import com.bugtrack.user_service.entity.User;
import java.util.List;

public interface UserRepository extends MongoRepository<User, String> {
    User findByEmail(String email);
    List<User> findByProjectIdsContaining(String projectId);
    List<User> findByNameContainingIgnoreCase(String name);
    List<User> findByRoleIgnoreCase(String role);
}
