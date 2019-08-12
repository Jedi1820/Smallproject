// pages/first/first.js
Page({

  /**
   * 页面的初始数据
   */
  data: {
    swiperdata:"",
    namevalue:"",
    pwdvalue:"",
    showflag:false
  },
  nameinput(e){
    let name = e.detail.value
    console.log(name)
    this.setData({ namevalue:name})
  },
  pwdinput(e) {
    let pwd = e.detail.value
    console.log(pwd)
    this.setData({ pwdvalue: pwd})
  },
  click() {

    //请求服务器发起登录的请求
    wx.request({
      url: 'http://cm.free.idcfengye.com/login',
      data: { "uname": this.data.namevalue, "upwd": this.data.pwdvalue },
      success: (resp) => {
        var flag = resp.data
        console.log(flag);

        if (flag == "成功") {
          //跳转页面
          wx.navigateTo({
            url: '../zhuye/zhuye',
          })
        }
        else {
          this.setData({ showflag: true });
        }
      }
    })

  },
  click1(){
  wx.navigateTo({
    url: '../two/two',
  })
  },
  /**
   * 生命周期函数--监听页面加载
   */
  onLoad: function (options) {
  wx.request({
    url: 'http://cm.free.idcfengye.com/loadswiper',
    success: (resp) => {
      console.log(resp.data);
      this.setData({ swiperdata: resp.data });
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