// pages/one/one.js
Page({

  /**
   * 页面的初始数据
   */
  data: {
    tex:"页面设计",
    swipdata:[{"url":"","text":"这是一个轮播文字"},
            {"url":"", "text":"周三复仇者联盟4上映"},
            {"url":"", "text": "马上就要到五一" }],
    page:"title"
  },

  /**
   * 生命周期函数--监听页面加载
   */
  onLoad: function (options) {
    let currentPage=this;
    wx.request({
      url: 'http://6kvjup.natappfree.cc/text/text1.json',
      header:{"content-type":"json"},
      success:function(response){
        console.log(response.data.data);
        currentPage.setData({page:response.data.data.title})
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