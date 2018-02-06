package com.liubowen;

import com.liubowen.common.Gender;
import com.liubowen.user.entity.UserInfo;
import java.util.List;

/**
 * Hello world!
 */
public class App {
    public static void main(String[] args) {
        UserInfo userInfo1 = new UserInfo(1, "11", 10, Gender.MAN);
        UserInfo userInfo2 = new UserInfo(2, "22", 20, Gender.UNKNOW);
        UserInfo userInfo3 = new UserInfo(3, "33", 30, Gender.WOMAN);
        List<UserInfo> userInfos ;

    }
}
