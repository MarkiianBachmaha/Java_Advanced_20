package repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import domain.User;

@Repository
public interface UserRepository extends CrudRepository<User, Long> {

	public User findByUserName(String username);
}