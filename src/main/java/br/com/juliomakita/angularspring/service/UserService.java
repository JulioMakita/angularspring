package br.com.juliomakita.angularspring.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import br.com.juliomakita.angularspring.dao.UserDao;
import br.com.juliomakita.angularspring.model.User;

@Service("userService")
public class UserService {
	
	@Autowired
	private UserDao userDao;

	public List<User> findAllUsers() {
		return this.userDao.getList();
	}

	public User findById(final long id) {
		return this.userDao.find(id);
	}

	@Transactional
	public void saveUser(final User user) {
		this.userDao.save(user);
	}

	@Transactional
	public void updateUser(final User currentUser) {
		this.userDao.update(currentUser);
	}

	@Transactional
	public void deleteUserById(final User user) {
		this.userDao.remove(user);
	}
}
