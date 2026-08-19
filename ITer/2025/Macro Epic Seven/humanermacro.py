import pygetwindow as gw
import pyautogui
import time
import keyboard
import sys
import os
import random

pyautogui.FAILSAFE = True

TITLE = "Epic Seven"  
ROUND = 700
CLEAR_TIME = 100

def setUpWindow():
    windows = gw.getWindowsWithTitle(TITLE)
    window = next((w for w in windows if w.title == TITLE), None)

    if window:
        try: 
            if window.isMinimized or window.isMaximized:
                window.restore()
                time.sleep(0.3) 

            window.activate()
            time.sleep(0.3) 

            window.moveTo(0, 0)
            window.resizeTo(906, 539)

            print("Done setup window!")

        except Exception as e:
            print("Error:", e)
            sys.exit()
    else:
        print("Not found window!")
        sys.exit()

def safe_click(x, y, delay=1.2):
    jx = x + random.randint(-3, 3)
    jy = y + random.randint(-3, 3)
    
    move_time = random.uniform(0.08, 0.15)
    pyautogui.moveTo(jx, jy, duration=move_time) 
    
    time.sleep(random.uniform(0.2, 0.4)) 
    pyautogui.click()
    
    time.sleep(delay + random.uniform(-0.1, 0.2))

def check_exit():
    if keyboard.is_pressed("F6"):
        print("Exit detected!") 
        sys.exit()

def testClick():
    time.sleep(1.2) 

    safe_click(589, 375, delay=0.4)  
    safe_click(771, 492, delay=0.8) 
    safe_click(771, 492, delay=1.8)  
    safe_click(514, 376, delay=1.8)  

def moveToStage1():
    check_exit()
    
    start_x = 589 + random.randint(-3, 3)
    start_y = 215 + random.randint(-3, 3)
    pyautogui.moveTo(start_x, start_y)
    
    time.sleep(random.uniform(0.2, 0.4))
    
    for _ in range(12):
        check_exit()
        curr_x, curr_y = pyautogui.position()
        pyautogui.moveTo(curr_x + random.randint(-3, 3), curr_y + random.randint(-3, 3))
        pyautogui.click()
        time.sleep(random.uniform(0.01, 0.03))

def waitForBattle(sec):
    print(f"[+] Waiting {sec}s")
    time.sleep(sec)
    safe_click(127, 487)

def exitBattle():
    print("[*] Exit battle")
    time.sleep(1.0) 
    safe_click(127, 487)
    time.sleep(2) 

def run(round_count):
    for i in range(round_count):
        print(f"Round {i+1}")
        check_exit()
        moveToStage1() 
        
        testClick()

        waitForBattle(CLEAR_TIME)
        exitBattle()

if __name__ == "__main__":
    keyboard.add_hotkey('f6', lambda: print("\n[!] Emergency Stop Triggered!") or os._exit(0))
    
    print("Script Started. Press F6 to Kill.")
    setUpWindow()
    try:
        run(ROUND)
    except Exception as e:
        print(f"Script ended: {e}")