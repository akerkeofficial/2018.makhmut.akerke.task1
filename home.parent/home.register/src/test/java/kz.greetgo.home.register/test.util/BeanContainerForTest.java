package kz.greetgo.home.register.test.util;

import kz.greetgo.home.register.bean.postgres.AllBeanConfig;
import kz.greetgo.depinject.core.BeanConfig;
import kz.greetgo.depinject.core.Include;

@BeanConfig
@Include({AllBeanConfig.class})
public class BeanContainerForTest {
}