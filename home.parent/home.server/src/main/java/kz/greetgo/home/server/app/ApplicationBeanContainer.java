package kz.greetgo.home.server.app;

import kz.greetgo.home.server.beans.AppInitializer;
import kz.greetgo.depinject.core.BeanContainer;
import kz.greetgo.depinject.core.Include;

@Include(BeanConfigApplication.class)
public interface ApplicationBeanContainer extends BeanContainer {
  AppInitializer appInitializer();
}
