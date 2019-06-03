// pages/4.26/one.js
Page({

  /**
   * 页面的初始数据
   */
  data: {
    image:"",
    visible:true,
    mobile:false,
  },
  bt1()
  {
    wx.navigateTo({
      url: '../4.26/one',
    })
  },
  bt(e)
  {
    let that=this;
    console.log(e);
    let camera=wx.createCameraContext();
    console.log(camera);
    camera.takePhoto({
      success(res){
        console.log(res.tempImagePath);
        that.setData({ image: res.tempImagePath,
                       visible:false,
                       mobile:true})
      }
    })
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