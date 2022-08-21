package org.pattern.constructor.abstractFactory.factory;
import org.pattern.constructor.abstractFactory.domain.product.dao.ProductDao;
import org.pattern.constructor.abstractFactory.domain.userinfo.dao.UserinfoDao;

public interface DaoFactory {

    public UserinfoDao createUserInfoDao();
    public ProductDao createProductDao();

}
