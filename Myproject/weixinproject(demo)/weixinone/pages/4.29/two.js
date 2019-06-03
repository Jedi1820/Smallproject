// pages/4.29/two.js
Page({

  /**
   * 页面的初始数据
   */
  data: {
     videodata:"",
     src:""
  },

  /**
   * 生命周期函数--监听页面加载
   */
  onLoad: function (options) {
    let that = this;
     wx.request({
       url: 'http://localhost:8800/text/video.json',
       success:function(res){
         console.log(res.data);
         that.setData({videodata:res.data});
        //  that.setData({src:res.data.videopath})
       },
       fail:function(error){
         console.log(error)
       }
     })
  },
  click(e){
     console.log(e);
     let url = e.currentTarget.dataset.url;
     console.log(url);
     this.setData({src:url})
     let vdContext=wx.createVideoContext("vd", this);
     vdContext.play()
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