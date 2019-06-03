import pymysql

def updatePwd(*data):

  con = pymysql.connect("127.0.0.1","root","0885","ching")

  print(con)

  sql="update t_students  set pwd=%s,money=%s  where name=%s"

  dbcursor=con.cursor()

  dbcursor.execute(sql,data)

  con.commit() #insert into ,update,delete

  print("更新密码成功")

updatePwd('888888','7000','张三')