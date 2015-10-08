package be.vdab.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import be.vdab.dao.EigenaarDAO;

@Controller
@RequestMapping("/eigenaars")
public class EigenaarController {
	
	private final EigenaarDAO eigenaarDAO;

	@Autowired
	public EigenaarController(EigenaarDAO eigenaarDAO) {
		this.eigenaarDAO = eigenaarDAO;
	}
	
	@RequestMapping(method=RequestMethod.GET)
	public ModelAndView get(){
		return new ModelAndView("eigenaar", "eigenaars", eigenaarDAO.findAll());
	}

}
