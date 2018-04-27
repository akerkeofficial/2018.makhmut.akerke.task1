package kz.greetgo.home.register.bean.postgres;

import kz.greetgo.home.controller.controller.BeanConfigForPackageController;
import kz.greetgo.depinject.core.BeanConfig;
import kz.greetgo.depinject.core.BeanScanner;
import kz.greetgo.depinject.core.Include;

@BeanConfig
@BeanScanner
@Include({BeanConfigForPackageController.class})
public class BeanConfigAll {
}
