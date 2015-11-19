package dao;

import java.util.List;

import entity.User;

public interface Dao {
	public void save(User user);

	public void delete(String username);

	public void update(User user);

	public User queryByName(String username);

	public List<User> queryAll();
}
