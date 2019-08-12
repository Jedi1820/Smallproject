// pages/first/first.js
import * as echarts from '../../ec-canvas/echarts';

const app = getApp();

function initChart(canvas, width, height) {
  /** data: [{ name: "男", value: 30 }, { name: "女", value: 40}]**/
  var piedata = null;

  //var pieoptions=null;
  //1.初始化报表的长度和宽度
  const chart = echarts.init(canvas, null, {
    width: width,
    height: height
  });

  console.log(chart.getHeight());

  //2.设置对象到canvas
  canvas.setChart(chart);


  //3.小程序请求学生的性别的数据
  //请求服务器 异步
  wx.request({
    url: 'http://cm.free.idcfengye.com/querysexgroupdata',
    success: (resp) => {
      console.log(resp.data);
      piedata = resp.data;
      /**console.log("请求服务器去了-->" + piedata);
     //配置报表数据
      pieoptions = {
       backgroundColor: "#ccffcc",
       color: ["#37A2DA", "#FFCC9A"],
       series: [{
         label: {
           normal: {
             show: true,
             fontSize: 8,
             formatter: '{b}:{c},{d}%'

           }
         },
         type: 'pie',
         center: ['50%', '50%'],
         radius: [0, '60%'],
         data: piedata
       
       }]
     };

     chart.setOption(pieoptions);
     return chart;**/
    }
  });
  //js的定时函数
  setTimeout(function () {
    console.log("等会执行");
    console.log("请求服务器去了-->" + piedata);
    //配置报表数据
    var pieoptions = {
      backgroundColor: "#ccffcc",
      color: ["#37A2DA", "#FFCC9A"],
      series: [{
        label: {
          normal: {
            show: true,
            fontSize: 10,
            formatter: '{b}:{c},{d}%'
          }
        },
        type: 'pie',
        center: ['50%', '50%'],
        radius: [0, '60%'],
        data: piedata
      }]
    };

    chart.setOption(pieoptions);
    return chart;
  }, 5000);
}

/**function initChart(canvas, width, height) {
  //初始化报表的长度和宽度
  const chart = echarts.init(canvas, null, {
    width: width,
    height: height
  });

  //设置对象到canvas
  canvas.setChart(chart);

  //饼图的数据
  var option = {
    backgroundColor: "#ccffcc",
    color: ["#37A2DA", "#32C5E9", "#67E0E3", "#91F2DE", "#FFDB5C"],
    series: [{
      label: {
        normal: {
          show:true,
          fontSize: 15
        }
      },
      type: 'pie',
      center: ['50%', '50%'],
      radius: [0, '60%'],
      data: [{
        value: 55,
        name: '北京'
      }, {
        value: 20,
        name: '武汉'
      }, {
        value: 10,
        name: '杭州'
      }, {
        value: 20,
        name: '广州'
      }, {
        value: 38,
        name: '上海'
      },
      ],
      itemStyle: {
        emphasis: {
          shadowBlur: 10,
          shadowOffsetX: 0,
          shadowColor: 'rgba(0, 2, 2, 0.3)'
        }
      }
    }]
  };

  chart.setOption(option);
  return chart;
}**/
Page({

  /**
   * 页面的初始数据
   */
  data: {

    ec:{}

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

  },
  echartInit(e) {
    initChart(e.detail.canvas, e.detail.width, e.detail.height);
  }
})