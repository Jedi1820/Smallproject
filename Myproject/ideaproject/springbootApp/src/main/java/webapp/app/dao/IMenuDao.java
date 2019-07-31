package webapp.app.dao;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface IMenuDao {

	public List queryLeftMenu();

	public List queryFMenu();

	public List queryCMenu(int id);
	
	public List queryallleftmenu();
}
