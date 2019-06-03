// pages/weather/weather.js
Page({

  /**
   * 页面的初始数据
   */
  data: {
    cityName: "",
    currentweather: {},
    futureweather: [],
    weather: [],
    weatherimg:[]
  },
  bt()
  {
    wx.navigateTo({
      url: '../zhuye/zhuye',
    })
  },
  getWeatherImg() {
    let weather = this.data.result.future
    let weatherImg = []
    let that = this


    weather.forEach((data, index) => {

      let fa = Number(data.weather_id.fa)

      if (fa == 0) {
        // console.log("晴天")
        weatherImg = weatherImg.concat([{
          "index": index,
          "imgPath": that.data.weather.item[0].path,
        }])
        return
      }
      else if (fa == 1) {
        // console.log('多云')
        weatherImg = weatherImg.concat([{
          "index": index,
          "imgPath": that.data.weather.item[2].path,
        }])
        return
      }
      else if (fa == 2) {
        // console.log('阴')
        weatherImg = weatherImg.concat([{
          "index": index,
          "imgPath": that.data.weather.item[1].path,
        }])
        return
      }
      else if (2 <= fa <= 12) {
        // console.log('雨')
        weatherImg = weatherImg.concat([{
          "index": index,
          "imgPath": that.data.weather.item[3].path,
        }])
        return
      }
      else if (fa == 18 || fa == 53) {
        // console.log('雾或霾')
        weatherImg = weatherImg.concat([{
          "index": index,
          "imgPath": that.data.weather.item[5].path,
        }])
        return
      }
    })
    console.log("输出weatherimg的值")
    console.log(weatherImg)
    that.setData({ weatherimg: weatherImg })
  },
  input(e) {
    console.log(e);
    let cityname = e.detail.value;
    console.log("获取的城市名称：" + cityname);
    this.setData({ cityName: cityname })
  },
  searchweather(e) {
    console.log("点击");
    let that = this;
    let name = this.data.cityName;
    console.log("点击icon获取的城市：" + name);
    let url = "http://v.juhe.cn/weather/index?format=2&cityname=" + encodeURI(name) + "+&key=e5c6c2244f76cf1f0f3f985863ea8ec7";
    console.log(url);

    wx.request({
      url: "http://v.juhe.cn/weather/index?format=2&cityname=" + encodeURI(name) + "+&key=e5c6c2244f76cf1f0f3f985863ea8ec7", // 目标服务器url
      success: (res) => {
        console.log(res.data)
        console.log(res.data.result.future);
        that.setData({ currentweather: res.data.result.future[0] });
        that.setData({ futureweather: res.data.result.future })
      },
      fail: function (error) {
        console.log(error)
      }
    });
    wx.request({
      url: 'http://ching.natapp1.cc/text/weatherImg.json',
      success:(res)=>{
        console.log(res.data);
        this.setData({weather:res.data})
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