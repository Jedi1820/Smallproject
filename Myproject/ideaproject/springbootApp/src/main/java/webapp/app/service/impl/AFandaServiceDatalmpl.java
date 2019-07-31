package webapp.app.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import webapp.app.service.IAFandaService;
import webapp.app.util.AFandaDatasUtil;


@Service
public class AFandaServiceDatalmpl implements IAFandaService {
	
	@Autowired
	private AFandaDatasUtil afandautils;
	
	
	@Override
	public Object queryMoviceDatas() {
		// TODO Auto-generated method stub
		System.out.println("AFandaServiceDatalmpl is getMviceDatas start.....  ");
		
		
		return this.afandautils.getMoviceDatas();
	}
	public Object 	querynba() {
		// TODO Auto-generated method stub
		System.out.println("AfandaServiceDataImpl  is   queryNewsDatas1  start...");

		return this.afandautils.getnba();
	}

	@Override
	public Object getXingshiqiyuanDatas() {
		// TODO Auto-generated method stub
		System.out.println("AFandaServiceDatalmpl  is   getXingshiqiyuanDatas    start...");
		
		
		return  this.afandautils.getXingshiqiyuanDatas();
	}
	
	@Override
	public Object getMingRenMingYanDatas() {
		// TODO Auto-generated method stub
		System.out.println("AFandaServiceDatalmpl  is   getMingRenMingYanDatas  start...");
		
		
		return  this.afandautils.getMingRenMingYanDatas();
	}
	
	@Override
	public Object getHistoryTodayDatas() {
		// TODO Auto-generated method stub
		System.out.println("AFandaServiceDatalmpl  is   getHistoryTodayDatas  start...");
		
		
		return  this.afandautils.getHistoryTodayDatas();
	}
	

	@Override
	public Object getZhuFuYuDatas() {
		// TODO Auto-generated method stub
		System.out.println("AFandaServiceDatalmpl  is   getZhuFuYuDatas  start...");
		
		
		return this.afandautils.getZhuFuYuDatas();
	}

	@Override
	public Object getMusicDatas() {
		// TODO Auto-generated method stub
		System.out.println("AFandaServiceDatalmpl  is   getMusicDatas  start...");
		
		
		return this.afandautils.getMusicDatas();
	}
	
	@Override
	public Object getConstellationDatas() {
		// TODO Auto-generated method stub
		System.out.println("AFandaServiceDatalmpl  is   getConstellationDatas  start...");
		
		
		return this.afandautils.getConstellationDatas();
	}
	
	@Override
	public Object getQueryBusDatas() {
		// TODO Auto-generated method stub
		System.out.println("AFandaServiceDatalmpl  is   getQueryBusDatas  start...");
		
		
		return this.afandautils.getQueryBusDatas();
	}
	
	@Override
	public Object getTrainDatas() {
		// TODO Auto-generated method stub
		System.out.println("AFandaServiceDatalmpl  is   getTrainDatas  start...");
		
		
		return this.afandautils.getTrainDatas();
	}
	
	@Override
	public Object getWinXinDatas() {
		// TODO Auto-generated method stub
		System.out.println("AFandaServiceDatalmpl  is   getWinXinDatas  start...");
		
		
		return this.afandautils.getWinXinDatas();
	}
	
	@Override
	public Object getGoodBookDatas() {
		// TODO Auto-generated method stub
		System.out.println("AFandaServiceDatalmpl  is   getGoodBookDatas  start...");
		
		
		return this.afandautils.getGoodBookDatas();
	}
	
	@Override
	public Object getCookDatas() {
		// TODO Auto-generated method stub
		System.out.println("AFandaServiceDatalmpl  is   getCookDatas  start...");
		
		
		return this.afandautils.getCookDatas();
	}
	@Override
	public Object getFinanceDatas() {
		// TODO Auto-generated method stub
		System.out.println("AFandaServiceDatalmpl  is   getFinanceDatas  start...");
		
		
		return this.afandautils.getFinanceDatas();
	}

	@Override
	public Object getJztkDatas() {
		// TODO Auto-generated method stub
System.out.println("AFandaServiceDatalmpl  is   getJztkDatas  start...");
		
		
		return this.afandautils.getJztkDatas();
	}

	@Override
	public Object getDrug() {
		// TODO Auto-generated method stub
		System.out.println("AFandaServiceDatalmpl  is   getDrug  start...");
		return this.afandautils.getDrug();
	}
	@Override
	public Object querytechnology() {
		// TODO Auto-generated method stub
		System.out.println("AFandaServiceDatalmpl  is   querytechnology  start...");
		return this.afandautils.querytechnology();
	}


	
	

}
