package com.example.Numeralogiya.numeralogiya.dao.repository;

import com.example.Numeralogiya.numeralogiya.dao.entity.UserEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<UserEntity, Long> {
}
