package com.kafka.micro;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

@RestController
public class KafkaController {

	@Autowired
	public KafkaTemplate<String, TradeVO> kafkaTemplate;
	
	@Autowired
	public TradeDAO tradedao;
	
	private static final String TOPIC = "TestTopic"; 
	
	@RequestMapping("/publishmessages/publishTrade")
	@ResponseBody
	public String publishMessage(TradeVO vo) {
		tradedao.save(vo);
		kafkaTemplate.send(TOPIC, vo);
		return "Message : " + vo + " published successfully !!!";
	}
	
	@RequestMapping("/publishmessages/publishhome")
	public ModelAndView handleRequest()
	{
		ModelAndView mv = new ModelAndView();
		mv.addObject("Trade",new TradeVO());
		mv.setViewName("home");
		return mv;
	}
}
