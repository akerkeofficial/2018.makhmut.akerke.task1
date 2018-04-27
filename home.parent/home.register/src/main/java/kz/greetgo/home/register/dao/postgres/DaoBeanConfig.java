package kz.greetgo.home.register.dao.postgres;

import kz.greetgo.depinject.core.BeanConfig;
import kz.greetgo.depinject.core.BeanScanner;
import kz.greetgo.home.register.bean.postgres.DaoImplFactory;

@BeanConfig(defaultFactoryClass = DaoImplFactory.class)
@BeanScanner
public class DaoBeanConfig {
}
