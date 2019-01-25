package com.lance.study.time;

import java.time.LocalDate;
import java.time.LocalTime;
import java.time.MonthDay;
import java.time.temporal.ChronoUnit;

/**
 * @author: Lance(ZYH)
 * @Date: 2019-01-25 11:30
 * @Description: java8时间使用示例
 */
public class TimeTest {

    /**
     * @Description: 获取当天的日期
     * @Param: []
     * @return: void
     * @author: Lance(ZYH)
     * @Date: 2019/1/25
     */
    public static void getCurrentDate() {
        LocalDate today = LocalDate.now();
        System.out.println("当前日期为" + today);
    }

    /**
     * @Description: 获取当前的年月日
     * @Param: []
     * @return: void
     * @author: Lance(ZYH)
     * @Date: 2019/1/25
     */
    public static void getEveryDateDetail() {
        LocalDate everyDate = LocalDate.now();
        //获取年
        int year = everyDate.getYear();
        //获取月
        int month = everyDate.getMonthValue();
        //获取日
        int day = everyDate.getDayOfMonth();
        System.out.println("年：" + year + "\n月：" + month + "\n日：" + day);
    }

    /**
     * @Description: 获取某个特定的日期
     * @Param: []
     * @return: void
     * @author: Lance(ZYH)
     * @Date: 2019/1/25
     */
    public static void getSettingDate() {
        LocalDate settingDate = LocalDate.of(2012, 12, 12);
        System.out.println("设置的日期为:" + settingDate);
    }

    /**
     * @Description: 检查两个日期是否相等
     * @Param: []
     * @return: void
     * @author: Lance(ZYH)
     * @Date: 2019/1/25
     */
    public static void judgeDateEquals() {
        LocalDate date1 = LocalDate.of(2012, 12, 12);
        LocalDate date2 = LocalDate.now();
        System.out.println("今天日期是2012-12-12吗？" + date2.equals(date1));
    }

    /**
     * @Description: 检查重复事件，比如生日
     * @Param: []
     * @return: void
     * @author: Lance(ZYH)
     * @Date: 2019/1/25
     * java中判断是否是某个节日或者重复事件，使用MonthDay类。这个类由月日组合，不包含年信息
     */
    public static void checkRepeatEvent() {
        LocalDate dateOfBirth = LocalDate.of(1996, 1, 25);
        LocalDate nowDay = LocalDate.now();
        MonthDay birthday = MonthDay.of(dateOfBirth.getMonthValue(), dateOfBirth.getDayOfMonth());
        MonthDay currentMonthday = MonthDay.from(nowDay);
        if (currentMonthday.equals(birthday)) {
            System.out.println("今天是你的生日");
        } else {
            System.out.println("今天不是你的生日");
        }
    }

    /**
     * @Description: 获取当前时间
     * @Param: []
     * @return: void
     * @author: Lance(ZYH)
     * @Date: 2019/1/25
     */
    public static void getCurrentTime() {
        LocalTime nowTime = LocalTime.now();
        System.out.println("当前时间为：" + nowTime);
    }

    /**
     * @Description: 增加时间里面的小时数
     * @Param: []
     * @return: void
     * @author: Lance(ZYH)
     * @Date: 2019/1/25
     */
    public static void addHours() {
        LocalTime nowTime = LocalTime.now();
        System.out.println("现在时间为：" + nowTime);
        LocalTime addTimeResult = nowTime.plusHours(2);
        System.out.println("两小时后的时间为：" + addTimeResult);
    }
    /** 
    * @Description: 获取2周后的日期
    * @Param: [] 
    * @return: void 
    * @author: Lance(ZYH)
    * @Date: 2019/1/25
    */ 
    public static void addWeek() {
        LocalDate nowDate = LocalDate.now();
        System.out.println("当前日期为：" + nowDate);
        LocalDate addWeekResult = nowDate.plus(2, ChronoUnit.WEEKS);
        System.out.println("两周后的日期为：" + addWeekResult);
    }
    /** 
    * @Description: 一年前后的日期
    * @Param: [] 
    * @return: void 
    * @author: Lance(ZYH)
    * @Date: 2019/1/25
    */ 
    public static void beforeAndLaterYear(){
        LocalDate nowDate = LocalDate.now();
        System.out.println("今天日期为："+nowDate);
        LocalDate minusDate = nowDate.minus(1, ChronoUnit.YEARS);
        System.out.println("一年前的日期为："+minusDate);
        LocalDate addYearDate = nowDate.plus(1, ChronoUnit.YEARS);
        System.out.println("一年后的日期为："+addYearDate);
    }

    public static void main(String[] args) {
//        getCurrentDate();
//        getEveryDateDetail();
//        getSettingDate();
//        judgeDateEquals();
//        checkRepeatEvent();
//        getCurrentTime();
//        addHours();
//        addWeek();
//        beforeAndLaterYear();
        

    }
}
