Page({
  data: {
    name:"",
    author:"",
    img:"",
    url:""
  },
  onLoad: function (options) {
    let murl=options.url;
    let mimg = options.img;
    let mauthor = options.author;
    let mname = options.name;
    console.log(murl+","+mimg+","+mname+","+mauthor);
    this.setData({name:mname,author:mauthor,url:murl,img:mimg});
    let audioPlay = my.createAudioContext("ad", this);
    audioPlay.play();
  },
});
