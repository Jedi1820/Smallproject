Page({
  data: {
    music:""
  },
  muclick(e)
  {
    console.log(e);
    let url = e.currentTarget.dataset.url;
    console.log("获取的url:"+url);

    let name = e.currentTarget.dataset.name;
    console.log("获取的name:" + name);

    let author = e.currentTarget.dataset.author;
    console.log("获取的author:" + author);

    let img = e.currentTarget.dataset.img;
    console.log("获取的img:" + img);

    my.navigateTo({
      url: '../4.28/music/music?name='+name+"&author="+author+"&img="+img+"&url="+url,
    })
  },

  onLoad() {
    my.request({
      url: 'http://vnhbf8.natappfree.cc/text/music.json', // 目标服务器url
      success: (res) => {
        console.log(res.data);
        this.setData({music:res.data})
      },
    });
  },
});