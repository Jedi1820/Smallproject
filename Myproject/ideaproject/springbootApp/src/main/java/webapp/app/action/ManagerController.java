package webapp.app.action;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.alibaba.fastjson.JSON;
import webapp.app.model.TMenu;
import webapp.app.service.IMenuService;

@Controller
@RequestMapping("/manager")
public class ManagerController {

	@Autowired
	private IMenuService mservice;
	
	@RequestMapping("/leftmenu")
	public String left() {
		System.out.println("ManagerController  is   left  start...");

		return "emp/leftmenu";
	}

	@RequestMapping("/index")
	public String forwardManagerView() {
		System.out.println("ManagerController  is   forwardManagerView  start...");

		return "manager/manager_index";
	}

	@RequestMapping("/infos")
	public String smallOperatorView() {
		System.out.println("ManagerController  is   smallOperatorView  start...");

		return "manager/wx_opview";
	}

	@RequestMapping("/menus")
    @ResponseBody
	public String queryFCMenu(Model  model) {
		System.out.println("ManagerController  is   queryFCMenu  start...");
		
		
		
		
		
		List<TMenu>  tlists=this.mservice.queryallleftmenu();
		
		String  menustr=JSON.toJSONString(tlists);
		
		return  menustr;

		/**List<FMenu> lists = this.mservice.queryFMenu();

		for (FMenu f : lists) {
			System.out.println(f.getFname() + "\t" + f.getFid());

			List<CMenu> clists = this.mservice.queryCMenu(f.getFid());

			System.out.println("" + clists.size());
			f.setCmenus(clists);
		}

		System.out.println("----------------------");

		for (FMenu fm : lists) {

			// 一级
			System.out.println("-----父---" + fm.getFname());

			// 二级
			for (CMenu cm : fm.getCmenus()) {
				System.out.println(cm.getCname());
			}
		}
//		List<String>  strList  = new ArrayList<String>();
//		strList.add("华建成");
//		strList.add("秦帅");
//		model.addAttribute("menus", lists);
//		model.addAttribute("datas", strList);
//		
//		Object  dataJson=JSON.toJSON(lists);
//
//		return dataJson.toString();
		
		return  "emp/leftmenu";**/
	}

}
