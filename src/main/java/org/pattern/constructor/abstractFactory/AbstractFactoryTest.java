package org.pattern.constructor.abstractFactory;

import org.pattern.common.Testable;
import org.pattern.constructor.abstractFactory.domain.product.Product;
import org.pattern.constructor.abstractFactory.domain.product.dao.ProductDao;
import org.pattern.constructor.abstractFactory.domain.userinfo.UserInfo;
import org.pattern.constructor.abstractFactory.domain.userinfo.dao.UserinfoDao;
import org.pattern.constructor.abstractFactory.factory.DaoFactory;
import org.pattern.constructor.abstractFactory.factory.MySqlDaoFactory;
import org.pattern.constructor.abstractFactory.factory.OracleDaoFactory;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class AbstractFactoryTest implements Testable {
    @Override
    public void run() {
        FileInputStream fis;
        Properties prop;
        String dbType;
        try {
            fis = new FileInputStream("db.setting.for.abstract.factory");
            prop = new Properties();
            prop.load(fis);
            dbType = prop.getProperty("DBTYPE");
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

        UserInfo userInfo = new UserInfo();
        userInfo.setUserId("12345");
        userInfo.setPassword("!@#$%");
        userInfo.setUserName("이하늘");

        Product product = new Product();
        product.setProductId("0011AA");
        product.setProductName("TV");

        DaoFactory daoFactory = null;
        if(dbType.equals("MYSQL")) {
            daoFactory = new MySqlDaoFactory();
        } else if(dbType.equals("ORACLE")) {
            daoFactory = new OracleDaoFactory();
        } else {
            System.out.println("error");
            // or
            //daoFactory = new defaultFactory();
        }

        UserinfoDao userinfoDao = daoFactory.createUserInfoDao();
        System.out.println("====UserInfo Transaction====");
        userinfoDao.insertUserInfo(userInfo);
        userinfoDao.updateUserInfo(userInfo);
        userinfoDao.deleteUserInfo(userInfo);

        ProductDao productDao = daoFactory.createProductDao();
        System.out.println("====Product Transaction====");
        productDao.insertProduct(product);
        productDao.updateProduct(product);
        productDao.deleteProduct(product);
    }
}
