package by.htp.library.dao;

import by.htp.library.dao.exception.DAOException;
import by.htp.library.domain.User;

public interface UserDAO {
	
	User checkUser(String login, String password) throws DAOException;
	//void edit(int id, UserInfo user) throws DAOException;

}
