package com.example.tcndemo.liftdemo;

import android.annotation.SuppressLint;
import android.content.Context;

/**
 * Created by Administrator on 2016/4/18.
 */
public class ResourceUtil {
    @SuppressLint("DiscouragedApi")
    public static int getLayoutId(Context paramContext, String paramString) {
        return paramContext.getResources().getIdentifier(paramString, "layout",
                paramContext.getPackageName());
    }
    @SuppressLint("DiscouragedApi")
    public static int getStringId(Context paramContext, String paramString) {
        return paramContext.getResources().getIdentifier(paramString, "string",
                paramContext.getPackageName());
    }
    @SuppressLint("DiscouragedApi")
    public static int getDrawableId(Context paramContext, String paramString) {
        return paramContext.getResources().getIdentifier(paramString,
                "drawable", paramContext.getPackageName());
    }

    @SuppressLint("DiscouragedApi")
    public static int getStyleId(Context paramContext, String paramString) {
        return paramContext.getResources().getIdentifier(paramString,
                "style", paramContext.getPackageName());
    }

    @SuppressLint("DiscouragedApi")
    public static int getId(Context paramContext, String paramString) {
        return paramContext.getResources().getIdentifier(paramString,"id", paramContext.getPackageName());
    }

    @SuppressLint("DiscouragedApi")
    public static int getColorId(Context paramContext, String paramString) {
        return paramContext.getResources().getIdentifier(paramString,
                "color", paramContext.getPackageName());
    }
    @SuppressLint("DiscouragedApi")
    public static int getArrayId(Context paramContext, String paramString) {
        return paramContext.getResources().getIdentifier(paramString,
                "array", paramContext.getPackageName());
    }
}
