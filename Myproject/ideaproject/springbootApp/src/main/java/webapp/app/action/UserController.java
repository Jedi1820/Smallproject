package webapp.app.action;

import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.alibaba.fastjson.JSON;
import webapp.app.model.LeftMenu;
import webapp.app.model.UserInfo;
import webapp.app.service.IMenuService;
import webapp.app.service.IService;

@Controller
@RequestMapping("/users")
public class UserController {

	@Autowired
	private IService service;

	@Autowired
	private IMenuService mservice;

	@RequestMapping("/login")
	public String checkLogin(HttpServletRequest request, Model model) {
		String viewPath = "";
		System.out.println("UserController  is  checkLogin  start...");

		String username = request.getParameter("username");
		String userpwd = request.getParameter("userpwd");
		System.out.println(username + "\t" + userpwd);

		UserInfo user = new UserInfo();
		user.setUname(username);
		user.setUpwd(userpwd);

		Integer count = (Integer) service.checkLogin(user);
		System.out.println("count-->" + count);

		if (count > 0) {
			
			List<UserInfo>  ulists=this.service.queryUserInfo(username);
			
			System.out.println("--->"+ulists.size());

			List<LeftMenu> mlists = this.mservice.queryLeftMenu();

			System.out.println(mlists.size());

			model.addAttribute("menudatas", mlists);
			model.addAttribute("userdata", ulists);
			model.addAttribute("successName", username);
			viewPath = "/manager/manager_main";
		} else {
			model.addAttribute("failmsg", "错误");
			viewPath = "/manager/manager_index";
		}

		return viewPath;
	}

	@RequestMapping("/checkUserName")
	@ResponseBody
	public String checkUserName(HttpServletRequest request) {
		System.out.println("UserController  is  checkUserName  start...");
		String uname = request.getParameter("uname");

		System.out.println("uname" + uname);
		Integer count = (Integer) this.service.checkUserName(uname);

		System.out.println("count-->" + count);

		String result = JSON.toJSONString(count);

		return result;

	}

}
