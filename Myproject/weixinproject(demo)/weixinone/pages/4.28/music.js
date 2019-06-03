// pages/4.28/music.js
Page({

  /**
   * 页面的初始数据
   */
  data: {
    name:"",
    author:"",
    img:"",
    url:""
  },

  /**
   * 生命周期函数--监听页面加载
   */
  onLoad: function (options) {
    let murl=options.url;
    let mimg = options.img;
    let mauthor = options.author;
    let mname = options.name;
    console.log(murl+","+mimg+","+mname+","+mauthor);
    this.setData({name:mname,author:mauthor,url:murl,img:mimg});
    let audioPlay = wx.createAudioContext("ad", this);
    audioPlay.play();
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