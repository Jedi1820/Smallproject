// pages/four1/four1.js
Page({

  /**
   * 页面的初始数据
   */
  data: {
       swiperdata:[
         "http://hx676z.natappfree.cc/images/1.png",
         "http://img.kaiyanapp.com/f2c497cb520d8360ef2980ecd0efdee7.jpeg?imageMogr2/quality/60",
         "http://img.kaiyanapp.com/64f96635ddc425e3be237b5f70374d87.jpeg?imageMogr2/quality/60"]
  },
  onclick(){
      console.log("点击按钮");
      wx.navigateTo({url: '../three1/three1'})
  },
  /**
   * 生命周期函数--监听页面加载
   */
  onLoad: function (options) {


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