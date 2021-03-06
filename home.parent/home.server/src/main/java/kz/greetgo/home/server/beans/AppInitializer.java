package kz.greetgo.home.server.beans;

import kz.greetgo.home.register.util.App;
import kz.greetgo.home.register.util.LiquibaseManager;
import kz.greetgo.depinject.core.Bean;
import kz.greetgo.depinject.core.BeanGetter;

import javax.servlet.ServletContext;

@Bean
public class AppInitializer {

  public BeanGetter<LiquibaseManager> liquibaseManager;

  public BeanGetter<ControllerServlet> controllerServlet;

  public BeanGetter<Utf8AndTraceResetFilter> utf8AndTraceResetFilter;

  public void initialize(ServletContext ctx) throws Exception {

    liquibaseManager.get().apply();

    utf8AndTraceResetFilter.get().register(ctx);

    controllerServlet.get().register(ctx);
  }
}
