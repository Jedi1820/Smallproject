package webapp.app.dao;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface IUserDao {
	
	public Object checkLogin(Object obj);
	
	public Object checkUserName(String name);
	
	public List  queryUserInfo(String name);

	public List  querySwiperInfo();
	


}
