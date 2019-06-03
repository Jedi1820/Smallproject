#python元祖  ()

a1=(1,"2")
print(a1[0])

#a1[0]=10
print(a1)

print("-------")

for item  in a1:
     print(item)


#列表  []  可变

a2=[1,"2",True,20.90]
print(type(a2))

a2.append(100)
print(a2)

for item  in a2:
     print(item)

b1=[1,2]
b2=[1,2]

print(b1==b2)
print(b1  is  b2)

a3={"name","aa","bb"}
print(type(a3))

#set是不能添加重复元素
a3.add("name")
a3.add("aa")
a3.add("bc")
print(len(a3))

#字典类型
a={"name":"gg","age":10}
print(type(a))

for key in a.keys():
    print(key)

for val in a.values():
    print(val)

for  key,value  in  a.items():
    print(key,value)
#python数据类型
#int float  bool str  tuple,list,dict,set