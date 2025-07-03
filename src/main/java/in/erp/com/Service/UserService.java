package in.erp.com.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import in.erp.com.Repository.UserRepository;
import in.erp.com.entity.User;

@Service
public class UserService {
	@Autowired
	private UserRepository userRepo;
	
	public void addUser(User user) {
        userRepo.save(user);
    }

    public User getUserById(Long id) {
        return userRepo.findById(id)
            .orElseThrow(() -> new RuntimeException("User not found with ID: " + id));
    }

    public List<User> getAllUsers() {
        return userRepo.findAll();
    }

}
