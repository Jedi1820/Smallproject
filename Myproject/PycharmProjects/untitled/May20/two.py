from pyecharts import WordCloud

name=["张三",'lisi','王二','毛不易','廖俊涛','....','zhoujielun']

value=[1000,2000,5567,8339,2001,3321,1000]

wd=WordCloud(height=650,width=1000)

wd.add('circle',name,value,word_size_range=[20,100])

wd.render('WC.html')