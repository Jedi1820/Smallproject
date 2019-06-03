// pages/five/five.js
Page({

  /**
   * 页面的初始数据
   */
  data: {
    imagdata:[
      { "path": "../two/two", "imagepath":"http://kfbnng.natappfree.cc/images/1.jpeg"},
      { "path": "../three/three", "imagepath":"http://kfbnng.natappfree.cc/images/2.jpeg" },
      { "path": "../four/four", "imagepath": "http://kfbnng.natappfree.cc/images/3.jpeg" }],
  },
  onclick1(){
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