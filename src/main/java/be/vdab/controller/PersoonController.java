package be.vdab.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import be.vdab.dao.PersoonDAO;
import be.vdab.model.Persoon;

@Controller
@RequestMapping("personen")
public class PersoonController {

	private final PersoonDAO persoonDAO;

	@Autowired
	public PersoonController(PersoonDAO persoonDAO) {
		this.persoonDAO = persoonDAO;
	}
	
	@RequestMapping(method=RequestMethod.GET)
	public ModelAndView get(){
		List<Persoon> personen = persoonDAO.findAll();
		return new ModelAndView("personen", "personen", personen);
	}
	
	@RequestMapping(method=RequestMethod.GET, params="familienaam")
	public ModelAndView get(String familienaam){
		return new ModelAndView("personen", "personen", persoonDAO.findByFamilienaam(familienaam));
	}
	
}
