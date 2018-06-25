package com.iqarr.maven.plugin.support;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * Created by clg on 2018/6/25.
 */
public class Test {
    public static void main(String[] args){
        Pattern pattern = Pattern.compile("([a-zA-Z0-9/\\.-_]+(\\.js|\\.css|\\.less)(\\?[a-zA-Z0-9\\.=]+)?)");
        Matcher matcher = pattern.matcher(":@{/assets/scripts/core/clear/plugins/less-1.7.1.js?v=1}");
        matcher.find();
        System.out.println(matcher.group());
    }
}
