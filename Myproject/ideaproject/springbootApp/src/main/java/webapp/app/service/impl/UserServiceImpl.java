package webapp.app.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import webapp.app.dao.IUserDao;
import webapp.app.service.IService;

@Service
public class UserServiceImpl   implements IService {

	@Autowired
	private IUserDao dao;
	
	@Override
	public Object checkLogin(Object obj) {
		// TODO Auto-generated method stub
		System.out.println("UserServiceImpl  is  checkLogin  start..");
		return dao.checkLogin(obj);
	}

	@Override
	public Object checkUserName(String name) {
		// TODO Auto-generated method stub
		System.out.println("UserServiceImpl  is  checkLogin  start..");
		return dao.checkUserName(name);
	}

	@Override
	public List queryUserInfo(String name) {
		// TODO Auto-generated method stub
		System.out.println("UserServiceImpl  is  queryUserInfo  start..");
		return this.dao.queryUserInfo(name);
	}

	@Override
	public List querySwiperInfo() {
		// TODO Auto-generated method stub
		System.out.println("UserServiceImpl  is  querySwiperInfo  start..");
		return this.dao.querySwiperInfo();
	}





}
