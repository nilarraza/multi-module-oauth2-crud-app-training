package com.inovaitsys.multicrud.user.service;

import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.authority.AuthorityUtils;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

import com.inovaitsys.multicrud.user.repository.UserRepository;



@Service
public class CustomUserDetailsService implements UserDetailsService {
	
	@Autowired
	PasswordEncoder passwordEncoder;
	
	@Autowired
	UserRepository userRepository;

	@Override
	public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
		
		return userRepository.findByUsername(username).map(
		u->new User(u.getUsername(), u.getPassword(), u.getActive(), u.getActive(), u.getActive(), u.getActive(), 
				AuthorityUtils.createAuthorityList(
						u.getRoles().stream().map(r->"ROLE_"+r.getName().toUpperCase()).
						collect(Collectors.toList()).toArray(new String[] {})
			))).orElseThrow(()-> new UsernameNotFoundException("User Not Found"));
	}
//	return new User(username, passwordEncoder.encode("password"), true, true, true, true, 
//	AuthorityUtils.createAuthorityList("ROLE_USER"));
}
