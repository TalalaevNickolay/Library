package by.htp.library.controller.command;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import by.htp.library.controller.command.impl.JSPPagePass;
import by.htp.library.domain.User;
import by.htp.library.service.ServiceFactory;
import by.htp.library.service.UserService;
import by.htp.library.service.exception.ServiceException;

public class SignIn implements Command{

	private static final String LOGIN_PARAM_NAME = "login";
	private static final String PASSWORD_PARAM_NAME = "password";
	
	public void execute(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		String login;
		String password;

		login = request.getParameter(LOGIN_PARAM_NAME);
		password = request.getParameter(PASSWORD_PARAM_NAME);

		ServiceFactory factory = ServiceFactory.getInstance();
		UserService userService = factory.getUserService();

		User user = null;
		String goToPage = null;
		try {

			user = userService.signin(login, password);
			if(user != null) {
				goToPage = JSPPagePass.USER_MAIN;
			}
			else {
				request.setAttribute("errorMessage","Incorrect login or password");
				goToPage = JSPPagePass.MAIN_PAGE;
			}

		} catch(ServiceException e){
			//goToPage = JSPPagePass.ERROR_PAGE;
			//log
			e.printStackTrace();

		}
		
		RequestDispatcher dispatcher = request.getRequestDispatcher(goToPage);
        
		dispatcher.forward(request, response);
	}

}
