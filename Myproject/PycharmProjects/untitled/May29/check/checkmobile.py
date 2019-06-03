
def  checkMobile(headinfos):
      mobileinfos=["iphone","android","windowsphone"]
      infos=headinfos.lower()
      print(infos)

      for  item  in mobileinfos:
            flag=item in infos
            print(flag)

            if  flag:
                return True

      return False