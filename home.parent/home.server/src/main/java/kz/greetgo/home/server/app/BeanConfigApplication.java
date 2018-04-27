package kz.greetgo.home.server.app;

import kz.greetgo.home.register.bean.postgres.AllBeanConfig;
import kz.greetgo.home.server.beans.BeanConfigServer;
import kz.greetgo.depinject.core.BeanConfig;
import kz.greetgo.depinject.core.Include;

@BeanConfig
@Include({BeanConfigServer.class, AllBeanConfig.class})
public class BeanConfigApplication {}
