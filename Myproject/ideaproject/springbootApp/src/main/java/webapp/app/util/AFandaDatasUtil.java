package webapp.app.util;

import cn.hutool.http.HttpUtil;
import com.alibaba.fastjson.JSONObject;
import org.springframework.stereotype.Component;

import java.util.HashMap;

@Component
public class AFandaDatasUtil {
	
	public Object getMoviceDatas() {
		System.out.println("AFandaDatasUtil  is getMoviceDatas  start");

		HashMap<String, Object> maps = new HashMap<String, Object>();
		maps.put("key", "e0ff7c39578742dd94b4109fb2eb3439");
		maps.put("name","大侦探福尔摩斯");

		String result = HttpUtil.post("http://api.avatardata.cn/Movie/Query", maps);
		
		System.out.println("result-->" + result);

		JSONObject obj = JSONObject.parseObject(result);

		return obj;

	}
	
	public Object getDrug() {
		// TODO Auto-generated method stub
		System.out.println("AFandaDatasUtil is getDrug start");
		HashMap<String, Object> map = new HashMap<String,Object>();
		map.put("key","9990b5b963184460b1e6c850483eb9b8");
		map.put("id",1);
		String result = HttpUtil.post("http://api.avatardata.cn/Drug/DrugClass", map);
		
		System.out.println("result-->" + result);

		JSONObject obj = JSONObject.parseObject(result);

		return obj;

	}


	public Object getXingshiqiyuanDatas() {
		// TODO Auto-generated method stub
		
		System.out.println("AFandaDatasUtil is getXingshiqiyuanDatas start");
		HashMap<String, Object> map = new HashMap<String,Object>();
		
		map.put("key", "3c74253c78fe43269fb40f2b786993e9");
		map.put("xingshi", "陈");
		String result=HttpUtil.post("http://api.avatardata.cn/XingShiQiYuan/LookUp",map);
		System.out.println("result--->"+result);
		
		JSONObject obj = JSONObject.parseObject(result);
		
		return obj;
	}
	

	public Object getJztkDatas() {
		// TODO Auto-generated method stub
		
		System.out.println("AFandaDatasUtil is getJztkDatas start");
		HashMap<String, Object> map = new HashMap<String,Object>();
		
		map.put("key", "fb40f3dfe6954d8491c67e399b2456f9");
		map.put("subject", "1");//1代表科目一 4：代表科目四
		map.put("model", "c2");
		String result=HttpUtil.post("http://api.avatardata.cn/Jztk/Query",map);
		System.out.println("result--->"+result);
		
		JSONObject obj = JSONObject.parseObject(result);
		
		return obj;
	}
	
	

	public Object getMingRenMingYanDatas() {
		// TODO Auto-generated method stub
		
		System.out.println("AFandaDatasUtil is getMingRenMingYanDatas start");
		HashMap<String, Object> map = new HashMap<String,Object>();
		
		map.put("key", "d10db4ed3c544df0b2f5dbaa82709565");
		map.put("keyword", "天才");
		map.put("page", "1");
		map.put("rows ", "20");
		String result=HttpUtil.post("http://api.avatardata.cn/MingRenMingYan/LookUp",map);
		System.out.println("result--->"+result);
		
		JSONObject obj = JSONObject.parseObject(result);
		
		return obj;
	}
	

	public Object getHistoryTodayDatas() {
		// TODO Auto-generated method stub
		
		System.out.println("AFandaDatasUtil is getHistoryTodayDatas start");
		HashMap<String, Object> map = new HashMap<String,Object>();
		
		map.put("key", "a323058468694f8e8d972638b59927bf");
		map.put("yue", "1");
		map.put("ri", "1");
		map.put("type", "1");//1：国内国际大事件，2：民间事件包含部分国家大事件 
		map.put("page", "1");
		map.put("rows", "5");
		String result=HttpUtil.post("http://api.avatardata.cn/HistoryToday/LookUp",map);
		System.out.println("result--->"+result);
		
		JSONObject obj = JSONObject.parseObject(result);
		
		return obj;
	}
	
	
	public Object getZhuFuYuDatas() {
		// TODO Auto-generated method stub
		
		System.out.println("AFandaDatasUtil is getZhuFuYuDatas start");
		HashMap<String, Object> map = new HashMap<String,Object>();
		
		map.put("key", "0256fc52a96a4c8a86e7366963ad9510");
		map.put("typename", "爱情");
		map.put("page", "1");
		map.put("rows", "5");
		String result=HttpUtil.post("http://api.avatardata.cn/ZhuFuYu/QueryZhufu",map);
		System.out.println("result--->"+result);
		
		JSONObject obj = JSONObject.parseObject(result);
		
		return obj;
	}
	
	
	public Object getMusicDatas() {
		// TODO Auto-generated method stub
		
		System.out.println("AFandaDatasUtil is getMusicDatas start");
		HashMap<String, Object> map = new HashMap<String,Object>();
		
		map.put("key", "de6eba803c714fb08562f32ed0726da9");
		map.put("keyword", "晴天");
		map.put("page", "1");
		map.put("rows", "5");
		String result=HttpUtil.post("http://api.avatardata.cn/Music/Search",map);
		System.out.println("result--->"+result);
		
		JSONObject obj = JSONObject.parseObject(result);
		
		return obj;
	}
	
	
	public Object getConstellationDatas() {
		// TODO Auto-generated method stub
		
		System.out.println("AFandaDatasUtil is getConstellationDatas start");
		HashMap<String, Object> map = new HashMap<String,Object>();
		
		map.put("key", "ebfce9fdc33d4d4a981ae7e5a0acbb48");
		map.put("consName", "金牛座");
		map.put("type", "today");
	
		String result=HttpUtil.post("http://api.avatardata.cn/Constellation/Query",map);
		System.out.println("result--->"+result);
		
		JSONObject obj = JSONObject.parseObject(result);
		
		return obj;
	}
	

	public Object getQueryBusDatas() {
		// TODO Auto-generated method stub
		
		System.out.println("AFandaDatasUtil is getQueryBusDatas start");
		HashMap<String, Object> map = new HashMap<String,Object>();
		//https://route.showapi.com/1463-4?cityName=北京&lineId=59e6e1d612b901263f819c58&showapi_appid=100883&
		//showapi_timestamp=20190728004833&showapi_sign=47f2c34344bbbb7727a29159657419f5
	
		map.put("cityName", "北京");
		map.put("lineId", "59e6e1d612b901263f819c58");
		map.put("showapi_appid", "100883");
		map.put("showapi_timestamp", "20190728004833");
		map.put("showapi_sign", "47f2c34344bbbb7727a29159657419f5");
		//map.put("my_appSecret", "613003e949fc4428a93db4f107630e17");
		//map.put("showapi_appid", "100");
		String result=HttpUtil.post("http://route.showapi.com/1463-4",map);
		System.out.println("result--->"+result);
		
		JSONObject obj = JSONObject.parseObject(result);
		
		return obj;
	}
	

	public Object getTrainDatas() {
		// TODO Auto-generated method stub
		
		System.out.println("AFandaDatasUtil is getTrainDatas start");
		HashMap<String, Object> map = new HashMap<String,Object>();
		
		map.put("key","6b41f91febb74b3eb85c288e3eea3173");
		map.put("train", "z196");

	
		String result=HttpUtil.post("http://api.avatardata.cn/Train/QueryByTrain",map);
		System.out.println("result--->"+result);
		
		JSONObject obj = JSONObject.parseObject(result);
		
		return obj;
	}
	
	public Object getWinXinDatas() {
		// TODO Auto-generated method stub
		
		System.out.println("AFandaDatasUtil is getWinXinDatas start");
		HashMap<String, Object> map = new HashMap<String,Object>();
		
		map.put("key","bc6b62580d3aa7b031ec8f69f0b9d61d");
		map.put("pno", "1");
		map.put("ps", "20");

	
		String result=HttpUtil.post("http://v.juhe.cn/weixin/query",map);
		System.out.println("result--->"+result);
		
		JSONObject obj = JSONObject.parseObject(result);
		
		return obj;
	}
	
	public Object getGoodBookDatas() {
		// TODO Auto-generated method stub
		
		System.out.println("AFandaDatasUtil is getGoodBookDatas start");
		HashMap<String, Object> map = new HashMap<String,Object>();
		
		map.put("key","d3cad95475a40ff27c96267ee212b29d");

	
		String result=HttpUtil.post("http://apis.juhe.cn/goodbook/catalog",map);
		System.out.println("result--->"+result);
		
		JSONObject obj = JSONObject.parseObject(result);
		
		return obj;
	}
	
	public Object getCookDatas() {
		// TODO Auto-generated method stub
		
		System.out.println("AFandaDatasUtil is getCookDatas start");
		HashMap<String, Object> map = new HashMap<String,Object>();
		
		map.put("key","b00b208fbad89ed99c3f9092be0065b7");
		map.put("menu", "水煮肉片");
	
		String result=HttpUtil.post("http://apis.juhe.cn/cook/query.php",map);
		System.out.println("result--->"+result);
		
		JSONObject obj = JSONObject.parseObject(result);
		
		return obj;
	}
	public Object getFinanceDatas() {
		// TODO Auto-generated method stub
		
		System.out.println("AFandaDatasUtil is getFinanceDatas start");
		HashMap<String, Object> map = new HashMap<String,Object>();
		map.put("gid", "sh601009");
		map.put("key","3d9ce8a009a25c06aec9c10e7ef51970");
		
	
		String result=HttpUtil.post("http://web.juhe.cn:8080/finance/stock/hs",map);
		System.out.println("result--->"+result);
		
		JSONObject obj = JSONObject.parseObject(result);
		
		return obj;
	}
	public Object getnba() {
		// TODO Auto-generated method stub
		System.out.println("AfandaDatasUtil  is getnbaNewsDatas1  start");

		HashMap<String, Object> maps = new HashMap<String, Object>();
		maps.put("key", "334fea38409045d58ddd3be383421a72");
	
		String result = HttpUtil.post("http://api.avatardata.cn/Nba/NomalRace", maps);

		System.out.println("result-->" + result);

		JSONObject obj = JSONObject.parseObject(result);

		return obj;
	}

	public Object querytechnology() {
		// TODO Auto-generated method stub
		System.out.println("AfandaDatasUtil  is querytechnology  start");

		HashMap<String, Object> maps = new HashMap<String, Object>();
		maps.put("key", "98e8666296d447d1aa9714c878bcd32a");
		maps.put("page", "1");
		maps.put("rows", "50");
	
		String result = HttpUtil.post("http://api.avatardata.cn/TechNews/Query", maps);

		System.out.println("result-->" + result);

		JSONObject obj = JSONObject.parseObject(result);

		return obj;

	}


		
	
	public static void main(String[] args) {
		AFandaDatasUtil  ad= new AFandaDatasUtil();
		ad.querytechnology();
}
}
