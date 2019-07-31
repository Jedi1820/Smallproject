package webapp.app.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import webapp.app.dao.IMenuDao;
import webapp.app.service.IMenuService;


@Service
public class MenuServiceImpl  implements IMenuService {

	@Autowired
	private IMenuDao mdao;
	
	@Override
	public List queryLeftMenu() {
		// TODO Auto-generated method stub
		System.out.println("MenuServiceImpl  is  queryLeftMenu  start...");
		return this.mdao.queryLeftMenu();
	}

	@Override
	public List queryFMenu() {
		// TODO Auto-generated method stub
		System.out.println("MenuServiceImpl  is  queryFMenu  start...");
		return this.mdao.queryFMenu();
	}

	@Override
	public List queryCMenu(int id) {
		// TODO Auto-generated method stub
		System.out.println("MenuServiceImpl  is  queryCMenu  start...");
		return this.mdao.queryCMenu(id);
	}

	@Override
	public List queryallleftmenu() {
		// TODO Auto-generated method stub
		System.out.println("MenuServiceImpl  is  queryleftmenu  start...");
		return this.mdao.queryallleftmenu();
	}

}
