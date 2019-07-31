package webapp.app.action;

import com.alibaba.fastjson.JSON;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import webapp.app.service.IAFandaService;


@Controller
@CrossOrigin(origins="*",maxAge=3600)
@RequestMapping(value="/Afanda",method=RequestMethod.POST)
public class AFandaController {
	
	@Autowired
	private IAFandaService service;
	
	//影视
	@RequestMapping(value="movice",method=RequestMethod.POST)
	@ResponseBody
	public String getMovice() {
		System.out.println("AFandaController is getMovice start .......");
		Object result = this.service.queryMoviceDatas();
		String str = JSON.toJSONString(result);
		
		return str;
	}
	//NBA赛事
	@RequestMapping(value="nba",method=RequestMethod.POST)
	@ResponseBody
	public String getnba() 
	{
		System.out.println("AfandaController is getnba start...");
		Object result=this.service.querynba();
		String str= JSON.toJSONString(result);
		return str;
	}
	//科技新闻
	@RequestMapping(value="technology",method=RequestMethod.POST)
	@ResponseBody
	public String gettechnology() 
	{
		System.out.println("AfandaController is gettechnology start...");
		Object result=this.service.querytechnology();
		String str= JSON.toJSONString(result);
		return str;
	}
	//药品查询
	@RequestMapping(value="Drug",method=RequestMethod.POST)
	@ResponseBody
	public String getDrug() {
		System.out.println("AFandaController is getDrug start .......");
		Object result = this.service.getDrug();
		String str = JSON.toJSONString(result);
		
		return str;
	}
	//驾照题库
		@RequestMapping(value="jztk",method=RequestMethod.POST)
		@ResponseBody
		public String  getJztk()
		{
			System.out.println("AFandaController  is   getJztk  start...");
			
			Object  result=this.service.getJztkDatas();
			
			String  str= JSON.toJSONString(result);
			
			return  str;
		}
		//姓氏起源
		@RequestMapping(value="xingshiqiyuan",method=RequestMethod.POST)
		@ResponseBody
		public String  getXingshiqiyuan()
		{
			System.out.println("AFandaController  is   getXingshiqiyuan  start...");
			
			Object  result=this.service.getXingshiqiyuanDatas();
			
			String  strresult= JSON.toJSONString(result);
			
			return  strresult;
		}
		
		//名人名言
		
			@RequestMapping(value="mingrenmingyan",method=RequestMethod.POST)
			@ResponseBody
			public String  getMingRenMingYan()
			{
				System.out.println("AFandaController  is   getMingRenMingYan  start...");
				
				Object  result=this.service.getMingRenMingYanDatas();
				
				String  strresult= JSON.toJSONString(result);
				
				return  strresult;
			}
			//历史上的今天

			@RequestMapping(value="historytoday",method=RequestMethod.POST)
			@ResponseBody
			public String  getHistoryToday()
			{
				System.out.println("AFandaController  is   getHistoryToday  start...");
				
				Object  result=this.service.getHistoryTodayDatas();
				
				String  strresult= JSON.toJSONString(result);
				
				return  strresult;
			}
			//祝福短信大全

			@RequestMapping(value="zhufuyu",method=RequestMethod.POST)
			@ResponseBody
			public String  getZhuFuYu()
			{
				System.out.println("AFandaController  is   getZhuFuYu  start...");
				
				Object  result=this.service.getZhuFuYuDatas();
				
				String  strresult= JSON.toJSONString(result);
				
				return  strresult;
			}
		
			
			//搜索音乐
					@RequestMapping(value="music",method=RequestMethod.POST)
					@ResponseBody
					public String  getMusic()
					{
						System.out.println("AFandaController  is   getMusic  start...");
						
						Object  result=this.service.getMusicDatas();
						
						String  strresult= JSON.toJSONString(result);
						
						return  strresult;
					}
					
			//星座运势
					@RequestMapping(value="constellation",method=RequestMethod.POST)
					@ResponseBody
					public String  getConstellation()
					{
						System.out.println("AFandaController  is   getConstellation  start...");
						
						Object  result=this.service.getConstellationDatas();
						
						String  strresult= JSON.toJSONString(result);
						
						return  strresult;
					}
					
			//公交查询
					@RequestMapping(value="querybus",method=RequestMethod.POST)
					@ResponseBody
					public String  getQueryBus()
					{
						System.out.println("AFandaController  is   getQueryBus  start...");
						
						Object  result=this.service.getQueryBusDatas();
						
						String  strresult= JSON.toJSONString(result);
						
						return  strresult;
					}
			//火车时刻表
					@RequestMapping(value="train",method=RequestMethod.POST)
					@ResponseBody
					public String  getTrain()
					{
						System.out.println("AFandaController  is   getTrain  start...");
						
						Object  result=this.service.getTrainDatas();
						
						String  strresult= JSON.toJSONString(result);
						
						return  strresult;
					}	
			//微信精选
					@RequestMapping(value="weixin",method=RequestMethod.POST)
					@ResponseBody
					public String  getWinXin()
					{
						System.out.println("AFandaController  is   getWinXin  start...");
						
						Object  result=this.service.getWinXinDatas();
						
						String  str= JSON.toJSONString(result);
						
						return  str;
					}	
				//图书电商数据
					@RequestMapping(value="goodbook",method=RequestMethod.POST)
					@ResponseBody
					public String  getGoodBook()
					{
						System.out.println("AFandaController  is   getGoodBook  start...");
						
						Object  result=this.service.getGoodBookDatas();
						
						String  strresult= JSON.toJSONString(result);
						
						return  strresult;
					}	
					
				//菜谱大全
					@RequestMapping(value="cook",method=RequestMethod.POST)
					@ResponseBody
					public String  getCook()
					{
						System.out.println("AFandaController  is   getCook  start...");
						
						Object  result=this.service.getCookDatas();
						
						String  strresult= JSON.toJSONString(result);
						
						return  strresult;
					}	
				//股票数据
					@RequestMapping(value="finance",method=RequestMethod.POST)
					@ResponseBody
					public String  getFinance()
					{
						System.out.println("AFandaController  is   getFinance  start...");
						
						Object  result=this.service.getFinanceDatas();
						
						String  strresult= JSON.toJSONString(result);
						
						return  strresult;
					}
	
	
}
