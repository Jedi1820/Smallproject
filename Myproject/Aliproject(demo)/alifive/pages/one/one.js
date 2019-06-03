let appone=getApp();
Page({
  data: {
    tdatas:{}
  },
  clickbtn(){
  my.navigateTo({
    url:"../one/one"
  });
  },
  onLoad() {
    let that=this;
    console.log("页面被加载");
    let datas=appone.globalData.textdatas;
    console.log(datas);
    if(datas===undefined){
      my.httpRequest({
        url: 'http://92p9py.natappfree.cc/text/china_text.json', // 目标服务器url
        success: (result) => {
          console.log(result.data);
          that.setData({tdatas:result.data})
        },
      });

    }
    else{
      console.log("已获取数据");
      console.log({tdatas:datas})
    }
  },
});
