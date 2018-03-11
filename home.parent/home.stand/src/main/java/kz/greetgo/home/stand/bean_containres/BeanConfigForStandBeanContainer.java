package kz.greetgo.home.stand.bean_containres;

import kz.greetgo.depinject.core.BeanConfig;
import kz.greetgo.depinject.core.Include;
import kz.greetgo.home.controller.controller.BeanConfigForPackageController;
import kz.greetgo.home.stand.beans.BeanConfigForPackageBeans;
import kz.greetgo.home.stand.register_impl.BeanConfigForPackageRegisterImpl;

@BeanConfig
@Include({BeanConfigForPackageBeans.class,
        BeanConfigForPackageController.class,
        BeanConfigForPackageRegisterImpl.class})

public class BeanConfigForStandBeanContainer {
}
