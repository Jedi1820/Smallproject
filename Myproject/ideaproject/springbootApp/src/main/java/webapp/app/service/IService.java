package webapp.app.service;

import java.util.List;

public interface IService {
	public  Object  checkLogin(Object obj);
	
	public Object  checkUserName(String name);
	
	public List  queryUserInfo(String name);
	
	public List  querySwiperInfo();

	

}
