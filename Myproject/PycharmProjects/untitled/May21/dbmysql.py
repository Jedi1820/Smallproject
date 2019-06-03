import  pymysql
#连接mysql
con = pymysql.connect("127.0.0.1","root","0885","ching")

print(con)

#构建sql，查询这个t_students的所有记录
sql = "select * from t_students"

#构建操作数据库的对象
dbcursor = con.cursor()

#执行sql语句
dbcursor.execute(sql)

data = dbcursor.fetchall()

print(data)

for datas in data:
    for value in datas:
        print(value)

lists=[]
#[[],[],[],[]]
for  data1 in data:
     d=[]
     for onedata in  data1:
         d.append(onedata)
     lists.append(d)
print(lists)