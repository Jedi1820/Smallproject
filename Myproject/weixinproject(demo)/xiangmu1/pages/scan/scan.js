// pages/scan/scan.js
Page({

  /**
   * 页面的初始数据
   */
  data: {
    cityID: ""
  },
  click() {
    // 城市ID
    let cityID = this.data.cityID;
    console.log("扫描之前获取的城市:"+cityID);

    let linenumber="";
    //获取条形码的值
    wx.scanCode({
      success(res)
      {
        console.log(res.result);
        linenumber = res.result;
        console.log("获得的条形码:"+linenumber);

        wx.request({
          url: "http://api.juheapi.com/jhbar/bar?appkey=8358304b4e0fbd49392663077c6f0e8e&pkg=com.ching.model&barcode="+linenumber+"&cityid="+cityID,
          success:(res)=>{
            console.log(res.data)
          }
        })
      }
    })
  },
  /**
   * 生命周期函数--监听页面加载
   */
  onLoad: function (options) {
    let cityname = "北京市";
    //请求城市的ID
    wx.request({
      url: 'http://api.juheapi.com/jhbar/city?appkey=8358304b4e0fbd49392663077c6f0e8e&pkg=com.ching.model',
    success:(resp)=>{
      console.log(resp.data.result);
      //获取城市的数组
      let cityArrary = resp.data.result;
      for (let i=0;i<cityArrary.length;i++){
       if(cityArrary[i].cityName == cityname){
      //获取城市的id
        console.log(cityArrary[i]._id);
        this.setData({cityID:cityArrary[i]._id})

       }
      }
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