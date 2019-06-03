// pages/news/news.js
Page({

  /**
   * 页面的初始数据
   */
  data: {
    test:0,
    news:{},
    news1:{},
    news2:{},
    news3:{},
    news4:{}
  },
  click(e)
  {
    console.log(e);
    //传递参数
    let value = e.currentTarget.dataset.item;
    console.log("点击获取的item:"+value);
    this.setData({test:value})
  },
  bt(){
    wx.navigateTo({
      url: '../zhuye/zhuye',
    })
  },
  /**
   * 生命周期函数--监听页面加载
   */
  onLoad: function (options) {
    // 请求聚合
    wx.request({
      url: 'http://v.juhe.cn/toutiao/index?type=top&key=c1fdcdb7ca2d81e0392442d73bf3202d',
      success:(res)=>
      {
        console.log(res.data.result),
          this.setData({ news: res.data.result.data})
      }
    });
    wx.request({
      url: 'http://v.juhe.cn/toutiao/index?type=tiyu&key=c1fdcdb7ca2d81e0392442d73bf3202d',
      success: (res) => {
        console.log(res.data.result),
          this.setData({ news1: res.data.result.data })
      }
    });
    wx.request({
      url: 'http://v.juhe.cn/toutiao/index?type=keji&key=c1fdcdb7ca2d81e0392442d73bf3202d',
      success: (res) => {
        console.log(res.data.result),
          this.setData({ news2: res.data.result.data })
      }
    });
    wx.request({
      url: 'http://v.juhe.cn/toutiao/index?type=yule&key=c1fdcdb7ca2d81e0392442d73bf3202d',
      success: (res) => {
        console.log(res.data.result),
          this.setData({ news3: res.data.result.data })
      }
    });
    wx.request({
      url: 'http://v.juhe.cn/toutiao/index?type=guoji&key=c1fdcdb7ca2d81e0392442d73bf3202d',
      success: (res) => {
        console.log(res.data.result),
          this.setData({ news4: res.data.result.data })
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