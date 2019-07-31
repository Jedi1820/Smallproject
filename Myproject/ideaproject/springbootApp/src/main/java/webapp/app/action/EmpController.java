package webapp.app.action;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import webapp.app.service.IEmpService;

@Controller
@RequestMapping("/emps")
public class EmpController {
	
	@Autowired
	private IEmpService eservice;
	
	@RequestMapping("/infos")
	public String  empsImfo(HttpServletRequest  request,Model  model)
	{
		System.out.println("EmpController  is  empsImfo  start...");
		
		//什么表(表名)，第几页，每页几条(固定值)
		//t_emp             3
		
		String spageNum=request.getParameter("pageNum");
		
		int  pageNum=(null==spageNum||"".equals(spageNum))?1:Integer.parseInt(spageNum);
		
		Map<String,Object>  maps  = new HashMap<String,Object>();
		maps.put("tabName", "t_emp");
		maps.put("pagenum", pageNum);
		maps.put("fixednum", 3);
		
		this.eservice.queryEmpInfo(maps);
		
		Integer  vcount=(Integer)maps.get("vount");
		System.out.println("总条数为:"+vcount);
		
		Integer  vsize=(Integer)maps.get("vsize");
		System.out.println("总页数为:"+vsize);
		
		List<Map<String,Object>>  lists=(List<Map<String,Object>>)maps.get("infocursor");
		
		
		model.addAttribute("vcount", vcount);
		model.addAttribute("vsize", vsize);
		model.addAttribute("empdatas", lists);
		model.addAttribute("currentnum", pageNum);
		
		return "emp/emp_infos";
		
	}

}
