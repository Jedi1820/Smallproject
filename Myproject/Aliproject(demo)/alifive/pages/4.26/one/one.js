Page({
  data: {
    snumber:"",
    phone:false,
    Id:false,
    phoneinfo:"",
    Idinfo:{}
  },
  search(e)
  {
    let  value=e.detail.value;
    console.log(value);
    this.setData({snumber:value})
  },
  but()
  { 
    let that=this;
    my.showToast({
      title:"正在查询，请稍候",
      icon:"success",
      duration:2000,
    });
    let num = that.data.snumber;
    my.request({
      url: 'https://www.zhaotool.com/v1/wx/info/', 
      data:{"q":num},
      method:"post",
      success: (res) => {
        console.log(res.data);
        let receive=res.data;
        if(receive.sid=="S101")
        {
          console.log("1."+that.data.phone);
          that.setData({phoneinfo:receive.data.phoneArea,phone:true});
        }
        else if(receive.sid=="S102")
        {
          console.log("2."+that.data.Id);
          that.setData({Idinfo:receive.data,Id:true});
        }
      },
      fail:function(error){
        console.log(error);
      }
    });

  },
  onLoad() {},
});
