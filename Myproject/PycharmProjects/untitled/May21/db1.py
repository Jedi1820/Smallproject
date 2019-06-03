import cx_Oracle

con=cx_Oracle.connect("system/oracle@127.0.0.1/ORCL")
print("连接成功",con)