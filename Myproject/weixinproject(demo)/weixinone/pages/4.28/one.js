// pages/4.28/one.js
Page({

  /**
   * 页面的初始数据
   */
  data: {
     music:""
  
  },
  auclick(e){
    console.log(e);
    let url = e.currentTarget.dataset.url;
    console.log("获取的url:"+url);

    let name = e.currentTarget.dataset.name;
    console.log("获取的name:" + name);

    let author = e.currentTarget.dataset.author;
    console.log("获取的author:" + author);

    let img = e.currentTarget.dataset.img;
    console.log("获取的img:" + img);

    wx.navigateTo({
      url: '../4.28/music?name='+name+"&author="+author+"&img="+img+"&url="+url,
    })
  },

  /**
   * 生命周期函数--监听页面加载
   */
  onLoad: function (options) {
    
    wx.request({
      url: 'http://ching.natapp1.cc/text/music.json',
      success:(res)=>{
        console.log(res.data);
        this.setData({music:res.data})
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