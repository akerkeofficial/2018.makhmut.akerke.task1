package kz.greetgo.home.register.bean.postgres;

import kz.greetgo.home.controller.controller.BeanConfigForPackageController;
import kz.greetgo.home.register.dao.postgres.DaoBeanConfig;
import kz.greetgo.home.register.impl.BeanScannerForImpl;
import kz.greetgo.depinject.core.BeanConfig;
import kz.greetgo.depinject.core.BeanScanner;
import kz.greetgo.depinject.core.Include;

@BeanConfig
@BeanScanner
@Include({DaoBeanConfig.class, BeanScannerForImpl.class, BeanConfigForPackageController.class})
public class AllBeanConfig {
}
