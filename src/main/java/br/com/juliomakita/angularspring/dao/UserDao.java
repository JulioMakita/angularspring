package br.com.juliomakita.angularspring.dao;

import java.util.List;
import java.util.concurrent.atomic.AtomicLong;

import org.springframework.stereotype.Repository;

import br.com.juliomakita.angularspring.configuration.GenericDao;
import br.com.juliomakita.angularspring.model.User;

@Repository
public class UserDao extends GenericDao<User, Long>{
	
	private static final AtomicLong counter = new AtomicLong();
	
	private static List<User> users;
	
	public UserDao(){
		super(User.class);
	}
}
