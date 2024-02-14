package com.groupeisi.jenkinsProject.Repository;

import com.groupeisi.jenkinsProject.Entities.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {
}
