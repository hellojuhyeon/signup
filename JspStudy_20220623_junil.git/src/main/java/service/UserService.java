package service;

import domain.entity.User;
import web.dto.SignupReqDto;

public interface UserService {
	public boolean checkUsername(String username) throws Exception;
	public boolean createUser(SignupReqDto signupReqDto) throws Exception; //예외처리 무조건 달아줄것!!!
	public void getUser() throws Exception;
	public boolean updateUser() throws Exception;
	public boolean deleteUser() throws Exception;
	
	public User loadUser(String username, String password) throws Exception;
}
