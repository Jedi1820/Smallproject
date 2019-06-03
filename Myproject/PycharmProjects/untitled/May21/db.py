import pymysql

conn = pymysql.connect(host="127.0.0.1",
                       port=3306,
                       user="root",
                       password="cm19971026",
                       database="ching")

print(conn)
