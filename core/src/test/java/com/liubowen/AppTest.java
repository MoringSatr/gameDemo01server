package com.liubowen;

import com.google.common.collect.Lists;
import com.liubowen.common.Gender;
import com.liubowen.user.entity.UserInfo;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

/**
 * Unit test for simple App.
 */
public class AppTest {

    public static void main(String[] args) {
        UserInfo userInfo1 = new UserInfo(1, "11", 10, Gender.MAN);
        UserInfo userInfo2 = new UserInfo(2, "22", 20, Gender.UNKNOW);
        UserInfo userInfo3 = new UserInfo(3, "33", 10, Gender.WOMAN);
        List<UserInfo> userInfos = Lists.newArrayList(userInfo3, userInfo1, userInfo2);
        System.out.println(Arrays.toString(userInfos.toArray()));
        userInfos.sort(Comparator.comparingLong(UserInfo::getUserId));
        System.out.println(Arrays.toString(userInfos.toArray()));
//        userInfos.sort(Comparator.comparingInt(UserInfo::getLevel));
        userInfos.sort((user1, user2) -> Integer.compare(user2.getLevel(), user1.getLevel()));
        System.out.println(Arrays.toString(userInfos.toArray()));

    }

}
