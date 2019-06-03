import pymysql

def checkdblogin(*args):
    conn=pymysql.Connect(host="127.0.0.1",port=3306,user="root",password="cm19971026",database="ching")

    dbcursor=conn.cursor()

    sql = "select  count(*)  from  t_students where sname=%s  and spwd=%s"

    dbcursor.execute(sql,args)

    datas = dbcursor.fetchone()

    print(datas)

    return datas[0]


def  adddbStu(*args):
     conn = pymysql.connect(host="127.0.0.1",port=3306,user="root",password="cm19971026",database="ching")

     sql="INSERT  INTO t_students(sname,spwd,ssex,sbirthday,money) VALUES(%s,%s,%s,%s,%s)"

     dbcursor = conn.cursor()
     dbcursor.execute(sql,args)

     conn.commit()


def querydbSexData():
    conn = pymysql.connect(host="127.0.0.1",port=3306,user="root",password="cm19971026",database="ching")

    sql = "SELECT ssex,COUNT(ssex)  FROM t_students  GROUP  BY  ssex"

    dbcursor = conn.cursor()
    dbcursor.execute(sql)

    datas = dbcursor.fetchall()
    print(datas)

    return datas