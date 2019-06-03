import pymysql

def   deleteAll(*data):
     con=pymysql.connect('127.0.0.1','root','0885','ching')

     print(con)

     sql="delete from t_students where id=%s"

     dbcursor=con.cursor()

     dbcursor.execute(sql,data)

     con.commit()

     print("删除成功")

deleteAll(1)
