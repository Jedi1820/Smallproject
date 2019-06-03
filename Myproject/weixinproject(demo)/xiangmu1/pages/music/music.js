// pages/music/music.js
Page({

  /**
   * 页面的初始数据
   */
  data: {
    music:"",
    name: "",
    author: "",
    img: "",
    url: ""
  },
  back(){
     wx.navigateTo({
       url: '../zhuye/zhuye',
     })
  },
  click(e){
   console.log(e);
    //传递参数
    let murl = e.currentTarget.dataset.url;
    console.log("获取的url:" + murl);

    let mname = e.currentTarget.dataset.name;
    console.log("获取的name:" + mname);

    let mauthor = e.currentTarget.dataset.author;
    console.log("获取的author:" + mauthor);

    let mimg = e.currentTarget.dataset.img;
    console.log("获取的img:" + mimg);
    
    this.setData({url:murl,img:mimg,author:mauthor,name:mname});

    let audioPlay=wx.createAudioContext("ad",this);
    audioPlay.play();
  },
  /**
   * 生命周期函数--监听页面加载
   */
  onLoad: function (options) {
    let that=this;
    //请求远程服务器
   wx.request({
     url: 'http://ching.natapp1.cc/text/music.json',
     success:(res)=>{
       console.log(res.data),
       this.setData({music:res.data});
    
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