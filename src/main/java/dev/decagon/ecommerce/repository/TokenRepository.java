package dev.decagon.ecommerce.repository;

import dev.decagon.ecommerce.model.AuthToken;
import dev.decagon.ecommerce.model.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TokenRepository extends JpaRepository<AuthToken, Integer> {
    AuthToken findTokenByUser(User user);
    AuthToken findTokenByToken(String token);
}
