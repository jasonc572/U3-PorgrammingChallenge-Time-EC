package com.example.project;


public class Time{
    //PRIVATE INSTANCE VARIABLES HERE
    private int hour;
    private int minute;
    private int second;
    //CONSTRUCTOR HERE 
    //constructure should take in 3 parameters (int hour, int minute, int seconds)


    //GETTERS 
 

    public Time (int h, int m, int s){
        hour = h;
        minute = m;
        second = s;
    }
    
    public String info(){
        String answer = "";
        if (hour >= 10) {
            answer = answer + hour + ":";
        } else {
            answer = answer + "0" + hour + ":";
        }
        if (minute >= 10) {
            answer = answer + minute + ":";
        } else {
            answer = answer + "0" + minute + ":";
        }
        if (second >= 10) {
            answer = answer + second;
        } else {
            answer = answer + "0" + second;
        }
        return answer;
    }


    public void tick(){
        second = second + 1;
        if (second == 60) {
            second = 0;
            minute++;
            if (minute == 60) {
                minute = 0;
                hour++;
                if (hour == 24) {
                    hour = 0;
                }
            }
        }
    }

    public int getHour() {
        return hour;
    }
    public int getMinute() {
        return minute;
    }
    public int getSecond() {
        return second;
    }

    public void add(Time time2){
       hour = hour + time2.getHour();
       minute = minute + time2.getMinute();
       second = second + time2.getSecond();
       if (second >= 60) {
        second = second - 60;
        minute++;
       }
       if (minute >= 60) {
        minute = minute - 60;
        hour++;
       }
       if (hour >= 24) {
        hour = hour - 24;
       }
    }
}

