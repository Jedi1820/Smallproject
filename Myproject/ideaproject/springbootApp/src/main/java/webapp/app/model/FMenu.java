package webapp.app.model;

import java.util.List;

public class FMenu {
	
	public int getFid() {
		return fid;
	}

	public void setFid(int fid) {
		this.fid = fid;
	}

	public String getFname() {
		return fname;
	}

	public void setFname(String fname) {
		this.fname = fname;
	}

	public String getCtime() {
		return ctime;
	}

	public void setCtime(String ctime) {
		this.ctime = ctime;
	}

	private  int  fid;
	
	private String  fname;
	
	private String ctime;
	
	public List<CMenu> getCmenus() {
		return cmenus;
	}

	public void setCmenus(List<CMenu> cmenus) {
		this.cmenus = cmenus;
	}

	private List<CMenu>  cmenus;

}
