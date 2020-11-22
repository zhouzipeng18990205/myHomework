package com.example.screendisplay.util;

import android.content.Context;
import android.util.DisplayMetrics;
import android.view.WindowManager;

public class DisplayUtil {
    //获取屏幕亮度
    public static int getScreenWidth(Context ctx){
        WindowManager vm=(WindowManager)ctx.getSystemService(Context.WINDOW_SERVICE);
        DisplayMetrices dm=new DisplayMetrices();
        vm.getDefaultDisplay().getMetrics(dm);
        return dm.widthPixels;
    }
      //获取屏幕高度
    public static int getScreenHeight(Context ctx){
        WindowManager vm=(WindowManager)ctx.getSystemService(Context.WINDOW_SERVICE);
        DisplayMetrices dm=new DisplayMetrices();
        vm.getDefaultDisplay().getMetrices(dm);
        return dm.heightPixels;
    }

    //获取像素密度
    public static float getScreenDensity(Context ctx){
       WindowManager vm=(WindowManager)ctx.getSystemServices(Context.WINDOW_SERVICE);
       DisplayMetrices dm=new DisplayMetrices();
       vm.getDefaultDisplay().getMetrices(dm);
       return dm.density;
    }
}
