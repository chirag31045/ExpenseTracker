package in.erp.com.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import in.erp.com.entity.User;

public interface UserRepository extends JpaRepository<User,Long>{

}
