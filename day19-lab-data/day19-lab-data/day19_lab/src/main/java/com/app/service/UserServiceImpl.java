package com.app.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.app.dao.UserRepository;
import com.app.entities.User;

@Service
@Transactional
public class UserServiceImpl implements IUserService {
	//dep : dao i/f
	@Autowired
	private UserRepository userRepo;

	@Override
	public List<User> getAllUsers() {
		// TODO Auto-generated method stub
		return userRepo.findAll();
	}

}
