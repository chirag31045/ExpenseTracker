package in.erp.com.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import in.erp.com.Service.UserService;
import in.erp.com.entity.User;

@RestController
@RequestMapping("/api/users")
public class UserController {
	
	@Autowired
	private UserService userService;
	
	 @PostMapping
	    public ResponseEntity<String> addUser(@RequestBody User user) {
	        userService.addUser(user);
	        return ResponseEntity.ok("User added successfully.");
	    }

	    // Get a user by ID
	    @GetMapping("/{id}")
	    public ResponseEntity<User> getUser(@PathVariable("id") Long id) {
	        User user = userService.getUserById(id);
	        return ResponseEntity.ok(user);
	    }

	    // Get all users
	    @GetMapping
	    public ResponseEntity<List<User>> getAllUsers() {
	        List<User> users = userService.getAllUsers();
	        return ResponseEntity.ok(users);
	    }

}
