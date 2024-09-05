package br.com.gameslibrary.model.user.repository;

import br.com.gameslibrary.model.user.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {
}
