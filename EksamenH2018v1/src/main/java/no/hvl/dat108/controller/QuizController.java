package no.hvl.dat108.controller;

import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import no.hvl.dat108.model.Quiz;
import no.hvl.dat108.util.LoginUtil;

@Controller
public class QuizController {
	
	
	@GetMapping(value="/quiz")
	public String visQuiz(HttpSession session, RedirectAttributes ra){
		if(!LoginUtil.isLoggedIn(session)) {
			ra.addFlashAttribute("redirectMessage", "Du er ikke logget inn");
			return "redirect:/";
		}

		//Bemerk, du blir ikke sendt direkte til quizresultater om du logger inn igjen paa ny, sa denne er nok ikke helt 100% korrekt.
		
		if(session.getAttribute("gjeldendeQuiz")==null) {
			return "ingenaktivquiz";
		}else {
			return "quizresultat";			
		}
		
	}
	
	
	
	
	
	@PostMapping(value="/quiz")
	public String oppdaterQuiz(@RequestParam String nyQuiz, HttpSession session,
			RedirectAttributes ra) {
		if(!LoginUtil.isLoggedIn(session)) {
			ra.addFlashAttribute("redirectMessage", "Du er ikke logget inn");
			return "redirect:/";
		}
		
		Quiz gjeldendeQuiz = new Quiz(nyQuiz);
		session.setAttribute("gjeldendeQuiz", gjeldendeQuiz);
		
		
		return "redirect:quiz";
	}
	
	
	
}
