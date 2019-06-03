import pymysql

con = pymysql.connect("127.0.0.1","root","0885","ching")

print(con)

sql="insert into t_students(name,pwd,sex,birthday,money) " \
    "values('小胖','555555','男','1998-10-1',100000)"

dbcursor = con.cursor()

dbcursor.execute(sql)

#手动事务  python操作mysql需要手动事务 commit()
con.commit()

print("插入成功")

sql="insert  into   t_students(name,pwd,sex,birthday,money" \
    ") values(%s,%s,%s,%s,%s)"

dbcursor=con.cursor()

dbcursor.execute(sql,('陈明','666666','男','1997-10-26',9000.00))

con.commit()

print("插入成功")