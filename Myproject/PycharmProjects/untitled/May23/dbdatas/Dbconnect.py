import pymysql

def queryswiperdatas():
    conn=pymysql.Connect('127.0.0.1','root','cm19971026','ching');
    print(conn)
    sql='select * from t_swiperimg where flag=1'

    dbcursor=conn.cursor()
    dbcursor.execute(sql)

    datas=dbcursor.fetchall()
    print(datas)
    return(datas)

