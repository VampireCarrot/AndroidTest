package com.lwd.androidtest;

/**
 * User: LWD
 * Date: 2017/2/13
 * Email: 13102169005@163.com
 * Description:地铁计费算法
 */

public class SubwayCalculator {
    /**
     * 地铁按照距离计算价格
     * @param miles 公里
     * @return 返回车票价格
     */
    public static int subwayPrice(int miles){
       if(miles<=0){
            return 0;
        }else if(miles<=6){
            return 3;
        }else if(miles > 6 && miles <= 12){
            return 4;
        }else if(miles > 12 && miles <= 22){
            return 5;
        }else if(miles > 22 && miles <=32){
            return 6;
        }
        return 7;
    }
}


