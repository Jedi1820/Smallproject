package webapp.app.action;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import webapp.app.util.interfaces.ICode;

@RestController
@RequestMapping("/utils")
public class UtilsController {

	@Autowired
	private ICode code;

	@RequestMapping("/createcode")
	public String createCode() {
		System.out.println("UtilsController  is   createCode  start...");

		String codes = code.createCode();

		return codes;
	}

}
