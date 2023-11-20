package by.academy.homeworkStart.taskGit;

public class Task5 {

  /*  Продолжить пример, добавить расчет и вывод суток
    и недель. (месяц по желанию)*/

    public static void main(String[] args) {
        int s = 2628003;
        int sec;
        int m;
        int min;
        int h;
        int hour;
        int d;
        int day;
        int w;
        int week;
        int month;
        sec = s % 60;
        m = (s - sec) / 60;
        min = m % 60;
        h = (m - min) / 60;
        hour = h % 24;
        d = (h - hour) / 24;
        day = d % 7;
        w = (d - day) / 7;
        week = w % 4;
        month = (w - week)/30;



        System.out.println(month + " месяцев " + week + " недель " + day + " дней " + hour + " часов " + min + " минут "
                + sec + " секунд");
    }
}


