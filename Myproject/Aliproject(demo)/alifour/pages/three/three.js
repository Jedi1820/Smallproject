Page({
  data: {
    cityName:"",
    currentweather:{},
    futureweather:[]
  },
  onLoad() {},
  inputVal(e)
  {
    console.log(e);
    let cityname=e.detail.value;
    console.log("获取的城市名称："+cityname);
    this.setData({cityName:cityname})
  },
  searchweather(e)
  {
    console.log(e);
    console.log("点击");
    let that=this;
    let name=this.data.cityName;
    console.log("点击icon获取的城市："+name);
    let url="http://apis.juhe.cn/simpleWeather/query?city="+encodeURI(name)+"+&key=8a6d38bb2dbbe4fac61cb5dc68974297";
    console.log(url);
         
    my.httpRequest({
      url: "http://apis.juhe.cn/simpleWeather/query?city="+encodeURI(name)+"+&key=8a6d38bb2dbbe4fac61cb5dc68974297", // 目标服务器url
      success: (res) => {
        console.log(res.data)
        console.log(res.data.result.future);
        that.setData({currentweather:res.data.result.future[0]});
        that.setData({futureweather:res.data.result.future})
      },
      fail:function(error)
      {
        console.log(error)
      }
    });
  }
});
