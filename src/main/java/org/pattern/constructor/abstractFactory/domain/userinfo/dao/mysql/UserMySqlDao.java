package org.pattern.constructor.abstractFactory.domain.userinfo.dao.mysql;

import org.pattern.constructor.abstractFactory.domain.userinfo.UserInfo;
import org.pattern.constructor.abstractFactory.domain.userinfo.dao.UserinfoDao;

public class UserMySqlDao implements UserinfoDao {
    @Override
    public void insertUserInfo(UserInfo userInfo) {
        System.out.println("insert into Mysql userId = " +userInfo.getUserId());
    }

    @Override
    public void updateUserInfo(UserInfo userInfo) {
        System.out.println("update into Mysql userId = " + userInfo.getUserId());
    }

    @Override
    public void deleteUserInfo(UserInfo userInfo) {
        System.out.println("delete from  Mysql userId = " + userInfo.getUserId());
    }
}
