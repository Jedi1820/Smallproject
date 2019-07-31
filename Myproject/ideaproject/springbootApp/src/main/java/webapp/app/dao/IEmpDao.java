package webapp.app.dao;

import java.util.Map;

import org.apache.ibatis.annotations.Mapper;
@Mapper
public interface IEmpDao {
	public Object queryEmpInfo(Map maps);
}
