import yagmail
#创建对象

class Sendmail:
    def sendmail(self,id,str,content):
        gmail=yagmail.SMTP(user="1415746774@qq.com",password="ikffnjfywvddhiij",host="smtp.qq.com")
        print(gmail)
        #构建文本内容
        #发送发邮件
        gmail.send(id,str,content)