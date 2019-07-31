package webapp.app.service.impl;

import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import webapp.app.dao.IEmpDao;
import webapp.app.service.IEmpService;


@Service
public class EmpServiceImpl   implements IEmpService {
	
	@Autowired
	private IEmpDao edao;

	@Override
	public Object queryEmpInfo(Map maps) {
		// TODO Auto-generated method stub
		System.out.println("EmpServiceImpl  is  queryEmpInfo  start...");
		return this.edao.queryEmpInfo(maps);
	}

}
