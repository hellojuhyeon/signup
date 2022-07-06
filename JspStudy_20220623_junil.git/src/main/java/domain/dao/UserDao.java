package domain.dao;

import domain.entity.User;

public interface UserDao {
	public int save(User user) throws Exception;
	public User findUserByUsername(String username) throws Exception;//유저객체를 찾아라 유저를 가지고
	public int modify(int user_code) throws Exception;
	public int remove(int user_code) throws Exception;
	
}
