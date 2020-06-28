package com.kos.hms;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import com.kos.hms.controllers.homeController;
import com.kos.hms.dao.userRepository;
import com.kos.hms.models.User;
@Service
public class MyUserDetailService implements UserDetailsService{

	@Autowired
	private userRepository userRepo;
	@Autowired
	private homeController hc;
	
	@Override
	public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
		// TODO Auto-generated method stub
		User user = userRepo.findByUsername(username);
		if(user == null)
				throw new UsernameNotFoundException("No username found...!!");
		hc.setUser(user);
		return new MyUserDetails(user);
	}

}
