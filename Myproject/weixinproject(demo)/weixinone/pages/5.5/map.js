// pages/5.5/map.js
const gdmap = require("../../utils/amap-wx.js")
Page({

  /**
   * 页面的初始数据
   */
  data: {
    latitude:"",
    longitude:""
  },

  /**
   * 生命周期函数--监听页面加载
   */
  onLoad: function (options) {
     wx.getLocation({
       success: (res)=> {
         console.log(res);
         //纬度
         console.log(res.latitude);
         //经度
         console.log(res.longitude);
         this.setData({ latitude: res.latitude, longitude:res.longitude})
       },
     });
     var that = this;
     var mapFun = new gdmap.AMapWX({ key: 'c2eb9e2979bfca6f280a3e583e6a7f04' });
     mapFun.getRegeo({
       success: function (resp) {
          console.log(resp)
         //成功回调
       },
       fail: function (info) {
        //失败回调
          console.log(info)
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