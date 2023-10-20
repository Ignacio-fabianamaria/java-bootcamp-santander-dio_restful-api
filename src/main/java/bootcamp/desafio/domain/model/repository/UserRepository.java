package bootcamp.desafio.domain.model.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import bootcamp.desafio.domain.model.User;

@Repository
public interface UserRepository extends JpaRepository<User, Long>{
    boolean existsByAccountNumber(String accountNumber);
}
