package kz.greetgo.home.stand.bean_containres;

import kz.greetgo.depinject.core.BeanConfig;
import kz.greetgo.depinject.core.Include;
import kz.greetgo.home.stand.beans.BeanConfigForPackageBeans;

@BeanConfig
@Include(BeanConfigForPackageBeans.class)
public class BeanConfigForStandBeanContainer {
}
