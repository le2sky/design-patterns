package org.pattern.creational.abstractFactory.factory;
import org.pattern.creational.abstractFactory.domain.product.dao.ProductDao;
import org.pattern.creational.abstractFactory.domain.userinfo.dao.UserinfoDao;

public interface DaoFactory {

    public UserinfoDao createUserInfoDao();
    public ProductDao createProductDao();

}
