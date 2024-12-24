package dev.naimsulejmani.gr1facebook.repositories;

import dev.naimsulejmani.gr1facebook.entities.UserEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends JpaRepository<UserEntity, Long> {
}
