package webapp.app.action;

import com.alibaba.fastjson.JSON;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import webapp.app.service.IJuheService;


@Controller
@CrossOrigin(origins="*",maxAge=3600)
@RequestMapping(value="/juhe",method=RequestMethod.POST)
public class JuheController {
	
	
	@Autowired
	private IJuheService service;
	
	
	@RequestMapping(value="news",method=RequestMethod.POST)
	@ResponseBody
	public String  getNews()
	{
		System.out.println("JuheController  is   getNews  start...");
		
		Object  result=this.service.getNewsDatas();
		
		String  strresult= JSON.toJSONString(result);
		
		return  strresult;
	}

	@RequestMapping(value = "weixin",method = RequestMethod.POST)
	@ResponseBody
	public String getWeixin()
	{
		System.out.printf("Juhecontroller is weixin start...");
		Object wresult = this.service.getWeixin();
		String  wxresult= JSON.toJSONString(wresult);

		return  wxresult;
	}

	@RequestMapping(value = "weather",method = RequestMethod.POST)
	@ResponseBody
	public String getWeather()
	{
		System.out.printf("Juhecontroller is weather start...");
		Object weresult = this.service.getWeather();
		String  wearesult= JSON.toJSONString(weresult);

		return  wearesult;
	}

	@RequestMapping(value = "film",method = RequestMethod.POST)
	@ResponseBody
	public String getFilm()
	{
		System.out.printf("Juhecontroller is film start...");
		Object fresult = this.service.getFilm();
		String  firesult= JSON.toJSONString(fresult);

		return  firesult;
	}

	@RequestMapping(value = "jiazhao",method = RequestMethod.POST)
	@ResponseBody
	public String getJiazhao()
	{
		System.out.printf("Juhecontroller is jiazhao start...");
		Object jresult = this.service.getJiazhao();
		String  jiresult= JSON.toJSONString(jresult);

		return  jiresult;
	}
}
