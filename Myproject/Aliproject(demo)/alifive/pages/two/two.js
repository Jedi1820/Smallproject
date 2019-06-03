Page({
  data: {
    test:0,
    image:["http://yiazyr.natappfree.cc/images/a1.jpg",
           "http://yiazyr.natappfree.cc/images/a2.jpg",
           "http://yiazyr.natappfree.cc/images/a3.jpg"],
    news:{}
  },
  click(e)
  {
    console.log("点击");
    let value=e.currentTarget.dataset.item;
    console.log("获取的数据"+value);
    this.setData({test:e.currentTarget.dataset.item})
  },

  
  onLoad() {
    // let that=this;
    // my.httpRequest({
    //   url: 'http://v.juhe.cn/toutiao/index?type=top&key=c1fdcdb7ca2d81e0392442d73bf3202d', // 目标服务器url
    //   header:{"content-type":"json"},
    //   success: (res) => {
    //     console.log(res.data),
    //     console.log(res.data.result.data),
    //     that.setData({news:res.data.result.data})
    //   },
    // });
  },
});
