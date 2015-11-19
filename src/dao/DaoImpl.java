package dao;

import java.util.List;

import org.springframework.orm.ibatis.support.SqlMapClientDaoSupport;
import org.springframework.stereotype.Repository;

import entity.User;

@Repository("dao")
public class DaoImpl extends SqlMapClientDaoSupport implements Dao{

	public void delete(String username) {
		getSqlMapClientTemplate().delete("delete",username);  
	}

	@SuppressWarnings("unchecked")
	public List<User> queryAll() {
		  return getSqlMapClientTemplate().queryForList("queryAll");  
	}

	public User queryByName(String username) {
		return (User)getSqlMapClientTemplate().queryForObject("username",username);
	}

	public void save(User user) {
		getSqlMapClientTemplate().insert("save",user);
	}

	public void update(User user) {
		getSqlMapClientTemplate().update("update",user);
	}
}
