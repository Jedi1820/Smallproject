// pages/five1/five1.js
Page({

  /**
   * 页面的初始数据
   */
  data: {
       
  },

  /**
   * 生命周期函数--监听页面加载
   */
  onLoad: function (options) {
     var currentthis = this;
     wx.request({
       url: 'http://v.juhe.cn/toutiao/index?type=top&key=c1fdcdb7ca2d81e0392442d73bf3202d',
      header:{"content-type":"json"},
      success:function(r)
      {
        console.log(r.data);
        console.log(r.data.result.data);
        currentthis.setData({ top: r.data.result.data})
      },
      fail:function(e)
      {
        console.log(e);
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