package co.GrandCircus.SpringLabs;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;	


@Controller
public class CoffeeController {
	@Autowired 
	UserRepository dao;
	
	@RequestMapping("/")
	public ModelAndView home() {
		
		return new ModelAndView("coffeeShop","testing","Welcome to Q's Cofee And Bagels!");
	}
	
	
	@RequestMapping("/personform")
	public ModelAndView personForm() {
	ModelAndView mv = new ModelAndView("PersonForm");
	
	return mv;
	
	}
	
	@RequestMapping("/hellopage")
	public ModelAndView registeredPerson(User user) {
		ModelAndView mv = new ModelAndView("HelloPage","firstName","Hello, " + user.getFirstName());
		
		return mv;
	}
	
	@RequestMapping("/addToDB")
	public ModelAndView addToDB(User user) {
		dao.addToDB(user.getFirstName(), user.getLastName(), user.geteMail(), user.getPassWord(), user.getPhoneNum());
		return new ModelAndView("redirect:/listItems");
	}
	
	@RequestMapping("/listItems")
	public ModelAndView listItems() {
		
		return new ModelAndView("HelloPage","listItems",dao.listItems());
	}


	
}
