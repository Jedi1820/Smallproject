package webapp.app.action;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import webapp.app.model.Swiper;
import webapp.app.service.IService;

//th模板语言，
@Controller  //接受用户请求，由UserAction完成用户请求的分配
public class UserAction {
	
	
	@Autowired
	private IService service;
	
	@RequestMapping("/")
	public String  defaultView(Model  model)
	{
		System.out.println("UserAction  is  defaultView  start...");
		


//		List<Swiper>   lists=this.service.querySwiperInfo();
//		System.out.println("-->"+lists.size());
//		model.addAttribute("swiperdatas", lists);
		
		return  "index";
	}
	

}
