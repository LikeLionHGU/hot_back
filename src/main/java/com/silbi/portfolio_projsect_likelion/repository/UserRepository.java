package com.silbi.portfolio_projsect_likelion.repository;

import com.silbi.portfolio_projsect_likelion.domain.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {}
