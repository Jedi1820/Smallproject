package webapp.app.model;

public class TMenu {


	private  int  navId;

	public int getNavId() {
		return navId;
	}

	public void setNavId(int navId) {
		this.navId = navId;
	}

	public String getNavTitle() {
		return navTitle;
	}

	public void setNavTitle(String navTitle) {
		this.navTitle = navTitle;
	}

	public String getNavUrl() {
		return navUrl;
	}

	public void setNavUrl(String navUrl) {
		this.navUrl = navUrl;
	}

	public String getTimg() {
		return timg;
	}

	public void setTimg(String timg) {
		this.timg = timg;
	}

	public int getNavParentId() {
		return navParentId;
	}

	public void setNavParentId(int navParentId) {
		this.navParentId = navParentId;
	}

	private String  navTitle;
	
	private String navUrl;
	
	private String timg;
	
	private int  navParentId;

}
