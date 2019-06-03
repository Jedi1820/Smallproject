App({
  onLaunch(options) {
    // 第一次打开
    // options.query == {number:1}
    console.info('App onLaunch');
    console.log("加载一次");

    let currentpage=this;

    my.httpRequest({
      url: 'http://92p9py.natappfree.cc/text/china_text.json', // 目标服务器url
      success: (res) => {
        console.log(res.data);
        currentpage.globalData.textdatas=res.data;
      },
    });
  },
  onShow(options) {
    // 从后台被 scheme 重新打开
    // options.query == {number:1}
  },

  globalData(){
     textdatas:{}
  },
});
