package com.desarrollasoftware.app.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.desarrollasoftware.app.model.User;

public interface UserRepository extends JpaRepository<User, Long> {

	User findByUsernameAndDisabled(String username, boolean disabled);

}
