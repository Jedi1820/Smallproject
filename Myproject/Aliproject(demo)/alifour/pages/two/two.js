Page({
  data: {
    name:"title",
    tianqi:""
  },
  onLoad() {
    let that=this;
    my.request({
      url: 'http://6xpeuv.natappfree.cc/text/text1.json', // 目标服务器url
      header:{"content-type":"json"},
      success: (res) => {
        that.setData({name:res.data.data.title})
      },
    });
    my.request({
      url: 'http://v.juhe.cn/weather/index?format=2&cityname=%E8%8B%8F%E5%B7%9E&key=e5c6c2244f76cf1f0f3f985863ea8ec7', // 目标服务器url
      header:{"content-type":"json"},
      success: (result) => {
         console.log(result.data.data),
         currentpage.setData({tianqi:result.data})
      },
    })
  },
});
