// pages/two/two.js
Page({

  /**
   * 页面的初始数据
   */
  data: {
    namevalue: "",
    pwdvalue: "",
    sexvalue: "",
    birthdayvalue: "",
    moneyvalue: ""
  },
  nameinput(e) {
    var name = e.detail.value;
    console.log(name);
    this.setData({ namevalue: name });
  },
  pwdinput(e) {
    var pwd = e.detail.value;
    console.log(pwd);
    this.setData({ pwdvalue: pwd });
  },
  sexinput(e) {
    var sex = e.detail.value;
    console.log(sex);
    this.setData({ sexvalue: sex });
  },
  birthdayinput(e) {
    var birthday = e.detail.value;
    console.log(birthday);
    this.setData({ birthdayvalue: birthday });
  },
  moneyinput(e) {
    var money = e.detail.value;
    console.log(money);
    this.setData({ moneyvalue: money });
  },
  regclick() {
    wx.request({
      url: 'http://cm.free.idcfengye.com/registerstu',
      data: { "sname": this.data.namevalue, "spwd": this.data.pwdvalue, "sex": this.data.sexvalue, "birthday": this.data.birthdayvalue, "money": this.data.moneyvalue },
      success: (resp) => {
        console.log(resp.data);
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