package be.vdab.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.StringRedisTemplate;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequestMapping("statistiek")
public class StatistiekController {
	
	private final StringRedisTemplate redisTemplate;
	
	@Autowired	
	public StatistiekController(StringRedisTemplate redisTemplate) {
		this.redisTemplate = redisTemplate;
	}

	@RequestMapping(method=RequestMethod.GET)
	public ModelAndView get(){
		int bezoekers = Integer.valueOf(redisTemplate.opsForValue().get("bezoekers"));		
		return new ModelAndView("statistiek", "bezoekers", bezoekers);
	}


}
