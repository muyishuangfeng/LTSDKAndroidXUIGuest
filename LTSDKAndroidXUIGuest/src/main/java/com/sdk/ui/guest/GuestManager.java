package com.sdk.ui.guest;


import android.content.Context;
import android.text.TextUtils;


import com.sdk.ui.core.impl.OnLoginSuccessListener;
import com.sdk.ui.core.manager.LoginResultManager;

import java.util.Map;
import java.util.WeakHashMap;

public class GuestManager {

    /**
     * 游客登录
     */
    public static void guestLogin(Context context, boolean isServerTest, String LTAppID, String LTAppKey,
                                  String adID, String packageID, OnLoginSuccessListener mListener) {
        Map<String, Object> map = new WeakHashMap<>();
        if (!TextUtils.isEmpty(adID)) {
            map.put("platform", 2);
            map.put("adid", adID);
            map.put("gps_adid", adID);
            map.put("platform_id", packageID);
        }
        LoginResultManager.guestLogin(context, isServerTest, LTAppID, LTAppKey, map, mListener);
    }

    /**
     * 绑定账户
     */
    public static void bindAccount(Context context, boolean isServerTest, String LTAppID, String LTAppKey,
                                   String adID, String packageID,String tag,String token,
                                   OnLoginSuccessListener mListener) {
        Map<String, Object> map = new WeakHashMap<>();
        if (!TextUtils.isEmpty(adID)) {
            map.put("access_token", token);
            map.put("platform", 2);
            map.put("adid", adID);
            map.put("gps_adid", adID);
            map.put("platform_id", packageID);
            map.put("type", tag);
        }
        LoginResultManager.bingAccount(context, isServerTest, LTAppID, LTAppKey, map, mListener);
    }

}
