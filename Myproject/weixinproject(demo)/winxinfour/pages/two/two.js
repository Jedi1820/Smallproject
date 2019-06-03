// pages/two/two.js
Page({

  /**
   * 页面的初始数据
   */
  data: {
      language:"china",
      languageobjs:{},
    
  },
  changelanguage(e){
      console.log(e);
      let that=this;
      console.log(e.currentTarget.dataset.value);
      let selectLanguage=e.currentTarget.dataset.value;
      console.log("获取的名称"+selectLanguage)
      wx.request({
        url: "http://92p9py.natappfree.cc/text/"+selectLanguage+"_text.json",
        success:function(res){
          console.log(res.data);
          that.setData({languageobjs:res.data.data})
        }
      })
  },
  /**
   * 生命周期函数--监听页面加载
   */
  onLoad: function (options) {
    // let that=this;
    //   wx.request({
    //     url: 'http://5tvt5b.natappfree.cc/text/text1.json',
    //     success(res){
    //       console.log(res.data);
    //       that.setData({languageobjs:res.data.data})
    //     }
    //   });
    // let currentpage=this;
    // wx.request({
    //   url: 'http://v.juhe.cn/weather/index?format=2&cityname=%E8%8B%8F%E5%B7%9E&key=e5c6c2244f76cf1f0f3f985863ea8ec7', // 目标服务器url
    //   header: { "content-type": "json" },
    //   success(result){
    //   console.log(result.data)
    //   // currentpage.setData({ tianqi: result.data.data })
    //   }
    // })
    let that=this;
    let selectLanguage=this.data.language;
    wx.request({
      url: "http://92p9py.natappfree.cc/text/"+selectLanguage+"_text.json",
      success(res){
        console.log(res.data);
        that.setData({languageobjs:res.data.data})
      }
    })
  },

  /**
   * 生命周期函数--监听页面初次渲染完成
   */
  onReady: function () {

  },

  /**
   * 生命周期函数--监听页面显示
   */
  onShow: function () {

  },

  /**
   * 生命周期函数--监听页面隐藏
   */
  onHide: function () {

  },

  /**
   * 生命周期函数--监听页面卸载
   */
  onUnload: function () {

  },

  /**
   * 页面相关事件处理函数--监听用户下拉动作
   */
  onPullDownRefresh: function () {

  },

  /**
   * 页面上拉触底事件的处理函数
   */
  onReachBottom: function () {

  },

  /**
   * 用户点击右上角分享
   */
  onShareAppMessage: function () {

  }
})