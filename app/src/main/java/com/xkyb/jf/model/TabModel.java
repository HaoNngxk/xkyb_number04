package com.xkyb.jf.model;


import com.xkyb.jf.config.Config;

/**
 * author：Anumbrella
 * Date：16/5/24 下午7:47
 */
public class TabModel {


    public static String[] getTabTexts() {
        if (Config.tabs.length > 0) {
            return Config.tabs;
        }
        return null;
    }


    public static int[] getTabImgs() {
        if (Config.tabImgs.length > 0) {
            return Config.tabImgs;
        }
        return null;
    }


    public static Class[] getFragments() {
        if (Config.tabClass.length > 0) {
            return Config.tabClass;
        }
        return null;
    }

}