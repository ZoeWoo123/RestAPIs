package com.flexon.projectOct;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ApiController {
	
	@Autowired
	private AccountRepository userRepo;

	@GetMapping(path="/")
	public String test() {
		return "Welcome to my app!";
	}
	//Display
	@GetMapping(path="/users")
	public List<User> getAllUsers(){
		return userRepo.findAll();
	}
	//Create
	@PostMapping(path="/users")
	public ResponseEntity<User> newUser(@RequestBody User user) {
		User newUser = userRepo.save(user);
		return new ResponseEntity<>(newUser,HttpStatus.CREATED);

	}
	//Remove
	@DeleteMapping(path="/users/{id}")
	public ResponseEntity<String> deleteUser(@PathVariable long id) {
		userRepo.deleteById(id);
		return new ResponseEntity<>("Deleted user", HttpStatus.OK);
	}
	//Edit preparation
    @GetMapping("/users/{id}")
    public User getTodo(@PathVariable long id){
        return userRepo.findById(id).get();
    }
    //Edit
    @PutMapping("/users/{id}")
    public ResponseEntity<User> updateTodo(@PathVariable long id, @RequestBody User user){
        User userUpdated = userRepo.save(user);
        return new ResponseEntity<User>(userUpdated, HttpStatus.OK);
    }
	
}
