package webapp.app.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import webapp.app.service.IJuheService;
import webapp.app.util.JuheDatasUtil;

@Service
public class JuheServiceDataImpl   implements IJuheService {

	@Autowired
	private JuheDatasUtil juheutils;

	@Override
	public Object getNewsDatas() {
		// TODO Auto-generated method stub
		System.out.println("JuheServiceDataImpl  is   getNewsDatas  start...");
		
		
		return this.juheutils.getNewsDatas();
	}

	@Override
	public Object getWeixin() {
		return this.juheutils.getWeixin();
	}

	@Override
	public Object getWeather() {
		return this.juheutils.getWeather();
	}

	@Override
	public Object getFilm() {
		return this.juheutils.getFilm();
	}

	@Override
	public Object getJiazhao() {
		return this.juheutils.getJiazhao();
	}

}
