package org.pattern.constructor.abstractFactory.domain.userinfo.dao;


import org.pattern.constructor.abstractFactory.domain.userinfo.UserInfo;

public interface UserinfoDao {
    void insertUserInfo(UserInfo userInfo);
    void updateUserInfo(UserInfo userInfo);
    void deleteUserInfo(UserInfo userInfo);
}
