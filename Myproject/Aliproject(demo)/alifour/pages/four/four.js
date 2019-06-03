Page({
  data: {
    personPhonedatas:[]

  },
  callphone(e)
  {
     let  phoneNum=e.currentTarget.dataset.phonenum;

     console.log(phoneNum);

     my.makePhoneCall({
       number: phoneNum 
     
     });
  },
  onLoad() {

    let  that=this;
  
     my.httpRequest({
       url: 'http://yxe8fi.natapp1.cc/text/china_text.json', // 目标服务器url
       success: (res) => {

         console.log(res.data);

         that.setData({personPhonedatas:res.data.address.addressListDatas});

       },
       fail:function(error)
       {
         console.log(error);
       }
     });
  }
});
