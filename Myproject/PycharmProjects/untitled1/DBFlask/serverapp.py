from flask import Flask, request, render_template
from flask import jsonify
from pyecharts import Pie

from DBFlask.dbconnect.Dbmysql import *
from DBFlask.dbconnect.checkmobile import *


#创建一个flask应用的对象


webapp=Flask(__name__)

#语法糖
@webapp.route("/")
def defaultview():
    return ("你好")
    # headInfos = request.headers["User-Agent"]
    # print(headInfos)

@webapp.route("/loadswiper")
def loadswiperdatas():
    print("加载轮播图的数据")

    swiperdatas=queryswiperdatas()

    datas = jsonify(swiperdatas)
    print(datas)

    return datas

@webapp.route("/login")
def checklogin():
    print("登录请求")

    name=request.args.get("uname")
    pwd = request.args.get("upwd")
    print(name,pwd)

    resultdata=checkdblogin(name,pwd)

    result=""

    if resultdata==0:
        result = "失败"
        print("登录失败")
    else:
        result = "成功"
        print("登录成功")

    return result

@webapp.route("/registerstu")
def  addStu():
    print("用户发起注册")

    name=request.args.get("sname")

    pwd=request.args.get("spwd")

    sex=request.args.get("sex")

    birthday=request.args.get("birthday")

    money=request.args.get("money")

    print(name,pwd,sex,birthday,money)

    adddbStu(name,pwd,sex,birthday,money)

    return "注册成功"

@webapp.route("/querysexgroupdata")
def  querySexGroup():
    print("用户需要查询性别比例")

    qdatas=querydbSexData()
    headInfos = request.headers["User-Agent"]

    print(headInfos)

    flag = checkMobile(headInfos)

    if  flag:
        print("来自移动端的请求")

        print(qdatas)

        listdatas=[]
        for linedatas  in qdatas:
            sexdata={}
            sexdata["name"]=linedatas[0]
            sexdata["value"]=linedatas[1]
            listdatas.append(sexdata)

        print(listdatas)
        return  jsonify(listdatas)
    else:
        print("来自浏览器的请求")

        sex = []
        sexdatas = []

        for item in qdatas:
            sex.append(item[0])
            sexdatas.append(item[1])

        pie = Pie("天汇智码学生比例")
        print(sex)
        print(sexdatas)

        pie.add("性别", sex, sexdatas)

        # 生成图表对象
        piesexImg = pie.render_embed()
        return render_template("stu_pie.html", sexpie=piesexImg)

if   __name__=="__main__":
    webapp.run(debug=True,port=8900)