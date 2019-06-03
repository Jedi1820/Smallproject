from pyecharts import Bar

ba = Bar("柱状图","信息报表")

ba.add("瑞幸咖啡",["美式",'卡布奇诺','拿铁','摩卡'],["20",'40','50','60'])

ba.render('xinxi.html')