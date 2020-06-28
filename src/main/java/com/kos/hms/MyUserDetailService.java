package com.kos.hms;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import com.kos.hms.dao.userRepository;
import com.kos.hms.models.User;
@Service
public class MyUserDetailService implements UserDetailsService{

	@Autowired
	private userRepository userRepo;
	
	@Override
	public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
		// TODO Auto-generated method stub
		User user = userRepo.findByUsername(username);
		if(user == null)
				throw new UsernameNotFoundException("No username found...!!");
		return new MyUserDetails(user);
	}

}
