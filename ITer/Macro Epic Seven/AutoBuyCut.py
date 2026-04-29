import pygetwindow as gw
import pyautogui
import time
import keyboard
import sys

pyautogui.FAILSAFE = True

TITLE = "Epic Seven"  

BUY_102_X = 135
BUY_102_Y = 410

BUY_5100_X = 540
BUY_5100_Y = 450

def setUpWindow():
    windows = gw.getWindowsWithTitle(TITLE)
    window = next((w for w in windows if w.title == TITLE), None)

    if window:
        try:
            if window.isMinimized or window.isMaximized:
                window.restore()
                time.sleep(0.5)

            window.activate()
            time.sleep(0.5)

            window.moveTo(0, 0)

            window.resizeTo(906, 539)

        except Exception:
            sys.exit()
    else:
        sys.exit()

def safe_click(x, y, delay=0.3):
    pyautogui.moveTo(x, y, duration=0.05)
    time.sleep(0.05)
    pyautogui.click()
    time.sleep(delay)

def check_exit():
    if keyboard.is_pressed("f6"):
        sys.exit()

def run():
    while True:
        check_exit()
        safe_click(BUY_102_X, BUY_102_Y, 0.4)
        
        check_exit()
        safe_click(BUY_5100_X, BUY_5100_Y, 0.4)

if __name__ == "__main__":
    setUpWindow()
    print("Giữ f6 để ngừng")
    run()
