public class MyTime {
    private int hour;
    private int minute;
    private int second;

    public MyTime() {
        hour = 0;
        minute = 0;
        second = 0;
    }

    public MyTime(int hour, int minute, int second) {
        setHour(hour);
        setMinute(minute);
        setSecond(second);
    }

    public MyTime(MyTime t) {
        this.hour = t.hour;
        this.minute = t.minute;
        this.second = t.second;
    }

    public int getHour() {
        return this.hour;
    }

    public int getMinute() {
        return this.minute;
    }

    public int getSecond() {
        return this.second;
    }

    public void setHour(int hour) {
        if (hour >= 0 && hour <= 23) {
            this.hour = hour;
        } else if (hour == 24) {
            this.setHour(0);
        } else if (hour == -1) {
            this.setHour(23);
        }
    }

    public void setMinute(int minute) {
        if (minute >= 0 && minute <= 59) {
            this.minute = minute;
        } else if (minute == 60) {
            this.setMinute(0);
            this.setHour(hour + 1);
        } else if (minute == -1) {
            this.setMinute(59);
            this.setHour(hour - 1);
        }
    }

    public void setSecond(int second) {
        if (second >= 0 && second <= 59) {
            this.second = second;
        } else if (second == 60) {
            this.setSecond(0);
            this.setMinute(minute + 1);
        } else if (second == -1) {
            this.setSecond(59);
            this.setMinute(minute - 1);
        }
    }

    @Override
    public String toString() {
        return String.format("Time: %02d:%02d:%02d", hour, minute, second);
    }

    public boolean equals(Object obj) {
        if (obj instanceof MyTime) {
            MyTime other = (MyTime) obj;
            return this.getHour() == other.getHour() &&
                    this.getMinute() == other.getMinute() &&
                    this.getSecond() == other.getSecond();
        } else {
            return false;
        }
    }

    public MyTime nextSecond() {
        MyTime newTime = new MyTime(hour, minute, second + 1);
        return newTime;
    }

    public MyTime previousSecond() {
        MyTime newTime = new MyTime(hour, minute, second - 1);
        return newTime;
    }
}
