
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

# checkMobile("Mozilla/5.0 (Windows NT 6.1; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/74.0.3729.169 Safari/537.36")
# checkMobile("Mozilla/5.0 (iPhone; CPU iPhone OS 9_1 like Mac OS X) AppleWebKit/601.1.46 (KHTML, like Gecko) Version/9.0 Mobile/13B143 Safari/601.1 wechatdevtools/1.02.1904090 MicroMessenger/6.7.3 Language/zh_CN webview/")
# checkMobile("Mozilla/5.0 (Linux; Android 5.1.1; Nexus 6 Build/LYZ28E) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/48.0.2564.23 Mobile Safari/537.36 wechatdevtools/1.02.1904090 MicroMessenger/6.7.3 webview/")
# checkMobile("Mozilla/5.0 (Macintosh; Intel Mac OS X 10_13_6) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/74.0.3729.169 Safari/537.36")