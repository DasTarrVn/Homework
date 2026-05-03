Settings.MoveMouseDelay = 0.2
print("Bat dau chay Auto Roll Speed 5")


vung_quet = Region(662,226,333,229)
so_lan_roll = 0

while True:

    click("1776500059403.png") 
    
    so_lan_roll += 1
    print("Dang roll lan " + str(so_lan_roll))
    
  
    sleep(2) 
    

    vung_quet.highlight(0.5) 


    if vung_quet.exists(Pattern("1776501528213.png").similar(0.83)):
        print(">>> THANH CONG! Da thay Speed 5. Dang dung Script!")

        popup("chuc mung thang lon SPEED 5 DA XUAT HIEN!") 
        break
    else:
        print("[-] Khong thay Speed 5. Dang tien hanh roll tiep...")