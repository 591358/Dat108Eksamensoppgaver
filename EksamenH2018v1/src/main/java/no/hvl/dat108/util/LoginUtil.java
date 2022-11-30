package no.hvl.dat108.util;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

public class LoginUtil {
	private static int MAX_INTERACTIVE_TIME = 120;
	public static void login(HttpServletRequest request, String password) {
		logout(request.getSession());
		HttpSession session = request.getSession();
		session.setMaxInactiveInterval(MAX_INTERACTIVE_TIME);
		session.setAttribute("password", password);
		
	}
	
	
	
	private static void logout(HttpSession session) {
		session.invalidate();		
	}



	public static boolean isLoggedIn(HttpSession session) {
		return session != null && session.getAttribute("password")!=null;
	}
	
}
