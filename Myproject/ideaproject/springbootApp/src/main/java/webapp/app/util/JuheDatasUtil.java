package webapp.app.util;

import cn.hutool.http.HttpUtil;
import com.alibaba.fastjson.JSONObject;
import org.springframework.stereotype.Component;

import java.util.HashMap;

@Component
public class JuheDatasUtil {

	public Object getNewsDatas() {
		System.out.println("JuheDatasUtil  is getNewsDatas  start");

		HashMap<String, Object> maps = new HashMap<String, Object>();
		maps.put("type", "top");
		maps.put("key", "c1fdcdb7ca2d81e0392442d73bf3202d");

		String result = HttpUtil.post("http://v.juhe.cn/toutiao/index", maps);

		System.out.println("result-->" + result);

		JSONObject obj = JSONObject.parseObject(result);

		return obj;

	}

	public  Object getWeixin(){
		System.out.println("JuheDatasUtil  is getWeixin  start");

		HashMap<String, Object> maps = new HashMap<String, Object>();

		maps.put("key", "163946f44482ce67e772c633cfa0afdd");

		String wresult = HttpUtil.post("http://v.juhe.cn/weixin/query?key=", maps);

		System.out.println("result-->" + wresult);

		JSONObject wobj = JSONObject.parseObject(wresult);

		return wobj;

	}
	public  Object getWeather(){
		System.out.println("JuheDatasUtil  is getWeather  start");

		HashMap<String, Object> maps = new HashMap<String, Object>();

		maps.put("key", "e5c6c2244f76cf1f0f3f985863ea8ec7");

		String wresult = HttpUtil.post("http://v.juhe.cn/weather/index?format=2&cityname=%e5%8d%97%e4%ba%ac&key=", maps);

		System.out.println("result-->" + wresult);

		JSONObject weobj = JSONObject.parseObject(wresult);

		return weobj;

	}

	public  Object getFilm(){
		System.out.println("JuheDatasUtil  is getfilm  start");

		HashMap<String, Object> maps = new HashMap<String, Object>();

		maps.put("key", "19c9009d1f8cd0b35cb073475e434cc6");

		String wresult = HttpUtil.post("http://v.juhe.cn/movie/index?key=&title=%E9%92%A2%E9%93%81%E4%BE%A03", maps);

		System.out.println("result-->" + wresult);

		JSONObject fiobj = JSONObject.parseObject(wresult);

		return fiobj;

	}

	public  Object getJiazhao(){
		System.out.println("JuheDatasUtil  is getjiazhao  start");

		HashMap<String, Object> maps = new HashMap<String, Object>();

		maps.put("key", "ec9581c9f698732ea96e648a190892ce");

		String wresult = HttpUtil.post("http://v.juhe.cn/jztk/query?subject=1&model=c1&key=&testType=rand", maps);

		System.out.println("result-->" + wresult);

		JSONObject jiobj = JSONObject.parseObject(wresult);

		return jiobj;

	}
}
