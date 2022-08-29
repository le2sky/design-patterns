package org.pattern.creational.abstractFactory.domain.userinfo.dao.oracle;

import org.pattern.creational.abstractFactory.domain.userinfo.UserInfo;
import org.pattern.creational.abstractFactory.domain.userinfo.dao.UserinfoDao;


public class UserOracleDao implements UserinfoDao {
    @Override
    public void insertUserInfo(UserInfo userInfo) {
        System.out.println("insert into Oracle userId = " +userInfo.getUserId());
    }

    @Override
    public void updateUserInfo(UserInfo userInfo) {
        System.out.println("update into Oracle userId = " + userInfo.getUserId());
    }

    @Override
    public void deleteUserInfo(UserInfo userInfo) {
        System.out.println("delete from  Oracle userId = " + userInfo.getUserId());
    }
}
