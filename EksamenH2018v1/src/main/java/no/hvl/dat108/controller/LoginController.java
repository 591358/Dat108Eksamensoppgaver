package no.hvl.dat108.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import no.hvl.dat108.util.LoginUtil;

@Controller
public class LoginController {
	@Value("${spring.datasource.password}")
	private String Password;
	@GetMapping(value="/")
	public String login() {
		
		return "login";
	}
	@PostMapping(value="/")
	public String sjekkLogin(@RequestParam String pinkode, HttpServletRequest request,
			RedirectAttributes ra, HttpSession session) {

		if (!pinkode.equals(Password)) {
			ra.addFlashAttribute("redirectMessage", "Feil pin kode");
			return "redirect:" + "/";
		}
		

		
		
		LoginUtil.login(request, pinkode);
		return "redirect:" + "quiz";
	}

}
