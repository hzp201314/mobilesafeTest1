package com.hzp.mobilesafe.util;

import android.content.Context;
import android.widget.Toast;

/**
 * created by hzp on 2018/11/21 13:37
 * 作者：codehan
 * 描述：
 */
public class ToastUtil {
    /**
     * @param ctx	上下文环境
     * @param msg	打印文本内容
     */
    public static void show(Context ctx, String msg) {
        Toast.makeText(ctx, msg, Toast.LENGTH_SHORT).show();
    }
}
