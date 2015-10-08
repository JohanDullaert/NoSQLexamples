package be.vdab.controller;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.data.redis.core.StringRedisTemplate;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
@RequestMapping("/")
public class IndexController {
	
	private final StringRedisTemplate redisTemplate;
	
	@Autowired	
	public IndexController(StringRedisTemplate redisTemplate) {
		this.redisTemplate = redisTemplate;
	}


	@RequestMapping(method=RequestMethod.GET)
	public String index(){
		redisTemplate.opsForValue().increment("bezoekers", 1);
		return "index";
	}

}
