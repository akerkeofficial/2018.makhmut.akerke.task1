package kz.greetgo.home.server.app;
public final class ApplicationBeanContainerAutomaticallyGeneratedImplementation implements kz.greetgo.home.server.app.ApplicationBeanContainer{

  private final java.lang.Object forSynchronizedBlocks = new java.lang.Object();

  //
  // Bean container methods
  //

  @java.lang.Override
  public kz.greetgo.home.server.beans.AppInitializer appInitializer() {
    return getter_native_AppInitializer_12.get();
  }

  //
  // Bean creations
  //

  private final java.util.concurrent.atomic.AtomicReference<kz.greetgo.home.controller.controller.AuthController> cachedValue_native_AuthController_1 = new java.util.concurrent.atomic.AtomicReference<>(null);
  private final kz.greetgo.depinject.core.BeanGetter<kz.greetgo.home.controller.controller.AuthController> getter_native_AuthController_1 = this::get_native_AuthController_1;
  private kz.greetgo.home.controller.controller.AuthController get_native_AuthController_1 () {
    {
      kz.greetgo.home.controller.controller.AuthController x = cachedValue_native_AuthController_1.get();
      if (x != null) return x;
    }
    synchronized (forSynchronizedBlocks) {
      {
        kz.greetgo.home.controller.controller.AuthController x = cachedValue_native_AuthController_1.get();
        if (x != null) return x;
      }
      try {
        kz.greetgo.home.controller.controller.AuthController localValue = new kz.greetgo.home.controller.controller.AuthController();
        localValue.authRegister = (kz.greetgo.depinject.core.BeanGetter<kz.greetgo.home.controller.register.AuthRegister>)(java.lang.Object)getter_native_AuthRegisterImpl_10;
        cachedValue_native_AuthController_1.set(localValue);
        return localValue;
      } catch (java.lang.Exception e) {
        if (e instanceof java.lang.RuntimeException) throw (java.lang.RuntimeException) e;
        throw new java.lang.RuntimeException(e);
      }
    }
  }

  private final java.util.concurrent.atomic.AtomicReference<kz.greetgo.home.controller.controller.TestController> cachedValue_native_TestController_2 = new java.util.concurrent.atomic.AtomicReference<>(null);
  private final kz.greetgo.depinject.core.BeanGetter<kz.greetgo.home.controller.controller.TestController> getter_native_TestController_2 = this::get_native_TestController_2;
  private kz.greetgo.home.controller.controller.TestController get_native_TestController_2 () {
    {
      kz.greetgo.home.controller.controller.TestController x = cachedValue_native_TestController_2.get();
      if (x != null) return x;
    }
    synchronized (forSynchronizedBlocks) {
      {
        kz.greetgo.home.controller.controller.TestController x = cachedValue_native_TestController_2.get();
        if (x != null) return x;
      }
      try {
        kz.greetgo.home.controller.controller.TestController localValue = new kz.greetgo.home.controller.controller.TestController();
        localValue.testRegisterBean = (kz.greetgo.depinject.core.BeanGetter<kz.greetgo.home.controller.register.TestRegister>)(java.lang.Object)getter_native_TestRegisterImpl_11;
        cachedValue_native_TestController_2.set(localValue);
        return localValue;
      } catch (java.lang.Exception e) {
        if (e instanceof java.lang.RuntimeException) throw (java.lang.RuntimeException) e;
        throw new java.lang.RuntimeException(e);
      }
    }
  }

  private final java.util.concurrent.atomic.AtomicReference<kz.greetgo.home.register.bean.postgres.AllConfigFactory> cachedValue_native_AllConfigFactory_3 = new java.util.concurrent.atomic.AtomicReference<>(null);
  private final kz.greetgo.depinject.core.BeanGetter<kz.greetgo.home.register.bean.postgres.AllConfigFactory> getter_native_AllConfigFactory_3 = this::get_native_AllConfigFactory_3;
  private kz.greetgo.home.register.bean.postgres.AllConfigFactory get_native_AllConfigFactory_3 () {
    {
      kz.greetgo.home.register.bean.postgres.AllConfigFactory x = cachedValue_native_AllConfigFactory_3.get();
      if (x != null) return x;
    }
    synchronized (forSynchronizedBlocks) {
      {
        kz.greetgo.home.register.bean.postgres.AllConfigFactory x = cachedValue_native_AllConfigFactory_3.get();
        if (x != null) return x;
      }
      try {
        kz.greetgo.home.register.bean.postgres.AllConfigFactory localValue = new kz.greetgo.home.register.bean.postgres.AllConfigFactory();
        cachedValue_native_AllConfigFactory_3.set(localValue);
        return localValue;
      } catch (java.lang.Exception e) {
        if (e instanceof java.lang.RuntimeException) throw (java.lang.RuntimeException) e;
        throw new java.lang.RuntimeException(e);
      }
    }
  }

  private final java.util.concurrent.atomic.AtomicReference<kz.greetgo.home.register.bean.postgres.DaoImplFactory> cachedValue_native_DaoImplFactory_4 = new java.util.concurrent.atomic.AtomicReference<>(null);
  private final kz.greetgo.depinject.core.BeanGetter<kz.greetgo.home.register.bean.postgres.DaoImplFactory> getter_native_DaoImplFactory_4 = this::get_native_DaoImplFactory_4;
  private kz.greetgo.home.register.bean.postgres.DaoImplFactory get_native_DaoImplFactory_4 () {
    {
      kz.greetgo.home.register.bean.postgres.DaoImplFactory x = cachedValue_native_DaoImplFactory_4.get();
      if (x != null) return x;
    }
    synchronized (forSynchronizedBlocks) {
      {
        kz.greetgo.home.register.bean.postgres.DaoImplFactory x = cachedValue_native_DaoImplFactory_4.get();
        if (x != null) return x;
      }
      try {
        kz.greetgo.home.register.bean.postgres.DaoImplFactory localValue = new kz.greetgo.home.register.bean.postgres.DaoImplFactory();
        localValue.dbSessionFactory = (kz.greetgo.depinject.core.BeanGetter<kz.greetgo.home.register.bean.postgres.DbSessionFactory>)(java.lang.Object)getter_native_DbSessionFactory_5;
        cachedValue_native_DaoImplFactory_4.set(localValue);
        return localValue;
      } catch (java.lang.Exception e) {
        if (e instanceof java.lang.RuntimeException) throw (java.lang.RuntimeException) e;
        throw new java.lang.RuntimeException(e);
      }
    }
  }

  private final java.util.concurrent.atomic.AtomicReference<kz.greetgo.home.register.bean.postgres.DbSessionFactory> cachedValue_native_DbSessionFactory_5 = new java.util.concurrent.atomic.AtomicReference<>(null);
  private final kz.greetgo.depinject.core.BeanGetter<kz.greetgo.home.register.bean.postgres.DbSessionFactory> getter_native_DbSessionFactory_5 = this::get_native_DbSessionFactory_5;
  private kz.greetgo.home.register.bean.postgres.DbSessionFactory get_native_DbSessionFactory_5 () {
    {
      kz.greetgo.home.register.bean.postgres.DbSessionFactory x = cachedValue_native_DbSessionFactory_5.get();
      if (x != null) return x;
    }
    synchronized (forSynchronizedBlocks) {
      {
        kz.greetgo.home.register.bean.postgres.DbSessionFactory x = cachedValue_native_DbSessionFactory_5.get();
        if (x != null) return x;
      }
      try {
        kz.greetgo.home.register.bean.postgres.DbSessionFactory localValue = new kz.greetgo.home.register.bean.postgres.DbSessionFactory();
        localValue.dbConfig = (kz.greetgo.depinject.core.BeanGetter<kz.greetgo.home.register.config.DbConfig>)(java.lang.Object)getter_native_DbConfig_7;
        localValue.afterInject();
        cachedValue_native_DbSessionFactory_5.set(localValue);
        return localValue;
      } catch (java.lang.Exception e) {
        if (e instanceof java.lang.RuntimeException) throw (java.lang.RuntimeException) e;
        throw new java.lang.RuntimeException(e);
      }
    }
  }

  private final java.util.concurrent.atomic.AtomicReference<kz.greetgo.home.register.bean.postgres.LiquibaseManagerImpl> cachedValue_native_LiquibaseManagerImpl_6 = new java.util.concurrent.atomic.AtomicReference<>(null);
  private final kz.greetgo.depinject.core.BeanGetter<kz.greetgo.home.register.bean.postgres.LiquibaseManagerImpl> getter_native_LiquibaseManagerImpl_6 = this::get_native_LiquibaseManagerImpl_6;
  private kz.greetgo.home.register.bean.postgres.LiquibaseManagerImpl get_native_LiquibaseManagerImpl_6 () {
    {
      kz.greetgo.home.register.bean.postgres.LiquibaseManagerImpl x = cachedValue_native_LiquibaseManagerImpl_6.get();
      if (x != null) return x;
    }
    synchronized (forSynchronizedBlocks) {
      {
        kz.greetgo.home.register.bean.postgres.LiquibaseManagerImpl x = cachedValue_native_LiquibaseManagerImpl_6.get();
        if (x != null) return x;
      }
      try {
        kz.greetgo.home.register.bean.postgres.LiquibaseManagerImpl localValue = new kz.greetgo.home.register.bean.postgres.LiquibaseManagerImpl();
        localValue.dbConfig = (kz.greetgo.depinject.core.BeanGetter<kz.greetgo.home.register.config.DbConfig>)(java.lang.Object)getter_native_DbConfig_7;
        cachedValue_native_LiquibaseManagerImpl_6.set(localValue);
        return localValue;
      } catch (java.lang.Exception e) {
        if (e instanceof java.lang.RuntimeException) throw (java.lang.RuntimeException) e;
        throw new java.lang.RuntimeException(e);
      }
    }
  }

  private final java.util.concurrent.atomic.AtomicReference<kz.greetgo.home.register.config.DbConfig> cachedValue_native_DbConfig_7 = new java.util.concurrent.atomic.AtomicReference<>(null);
  private final kz.greetgo.depinject.core.BeanGetter<kz.greetgo.home.register.config.DbConfig> getter_native_DbConfig_7 = this::get_native_DbConfig_7;
  private kz.greetgo.home.register.config.DbConfig get_native_DbConfig_7 () {
    {
      kz.greetgo.home.register.config.DbConfig x = cachedValue_native_DbConfig_7.get();
      if (x != null) return x;
    }
    synchronized (forSynchronizedBlocks) {
      {
        kz.greetgo.home.register.config.DbConfig x = cachedValue_native_DbConfig_7.get();
        if (x != null) return x;
      }
      try {
        kz.greetgo.home.register.config.DbConfig localValue = getter_native_AllConfigFactory_3.get().createDbConfig();
        cachedValue_native_DbConfig_7.set(localValue);
        return localValue;
      } catch (java.lang.Exception e) {
        if (e instanceof java.lang.RuntimeException) throw (java.lang.RuntimeException) e;
        throw new java.lang.RuntimeException(e);
      }
    }
  }

  private final java.util.concurrent.atomic.AtomicReference<kz.greetgo.home.register.dao.postgres.AuthDaoPostgres> cachedValue_native_AuthDaoPostgres_8 = new java.util.concurrent.atomic.AtomicReference<>(null);
  private final kz.greetgo.depinject.core.BeanGetter<kz.greetgo.home.register.dao.postgres.AuthDaoPostgres> getter_native_AuthDaoPostgres_8 = this::get_native_AuthDaoPostgres_8;
  private kz.greetgo.home.register.dao.postgres.AuthDaoPostgres get_native_AuthDaoPostgres_8 () {
    {
      kz.greetgo.home.register.dao.postgres.AuthDaoPostgres x = cachedValue_native_AuthDaoPostgres_8.get();
      if (x != null) return x;
    }
    synchronized (forSynchronizedBlocks) {
      {
        kz.greetgo.home.register.dao.postgres.AuthDaoPostgres x = cachedValue_native_AuthDaoPostgres_8.get();
        if (x != null) return x;
      }
      try {
        kz.greetgo.home.register.dao.postgres.AuthDaoPostgres localValue = (kz.greetgo.home.register.dao.postgres.AuthDaoPostgres) getter_native_DaoImplFactory_4.get().createBean(kz.greetgo.home.register.dao.postgres.AuthDaoPostgres.class);
        cachedValue_native_AuthDaoPostgres_8.set(localValue);
        return localValue;
      } catch (java.lang.Exception e) {
        if (e instanceof java.lang.RuntimeException) throw (java.lang.RuntimeException) e;
        throw new java.lang.RuntimeException(e);
      }
    }
  }

  private final java.util.concurrent.atomic.AtomicReference<kz.greetgo.home.register.dao.postgres.TestDaoPostgres> cachedValue_native_TestDaoPostgres_9 = new java.util.concurrent.atomic.AtomicReference<>(null);
  private final kz.greetgo.depinject.core.BeanGetter<kz.greetgo.home.register.dao.postgres.TestDaoPostgres> getter_native_TestDaoPostgres_9 = this::get_native_TestDaoPostgres_9;
  private kz.greetgo.home.register.dao.postgres.TestDaoPostgres get_native_TestDaoPostgres_9 () {
    {
      kz.greetgo.home.register.dao.postgres.TestDaoPostgres x = cachedValue_native_TestDaoPostgres_9.get();
      if (x != null) return x;
    }
    synchronized (forSynchronizedBlocks) {
      {
        kz.greetgo.home.register.dao.postgres.TestDaoPostgres x = cachedValue_native_TestDaoPostgres_9.get();
        if (x != null) return x;
      }
      try {
        kz.greetgo.home.register.dao.postgres.TestDaoPostgres localValue = (kz.greetgo.home.register.dao.postgres.TestDaoPostgres) getter_native_DaoImplFactory_4.get().createBean(kz.greetgo.home.register.dao.postgres.TestDaoPostgres.class);
        cachedValue_native_TestDaoPostgres_9.set(localValue);
        return localValue;
      } catch (java.lang.Exception e) {
        if (e instanceof java.lang.RuntimeException) throw (java.lang.RuntimeException) e;
        throw new java.lang.RuntimeException(e);
      }
    }
  }

  private final java.util.concurrent.atomic.AtomicReference<kz.greetgo.home.register.impl.AuthRegisterImpl> cachedValue_native_AuthRegisterImpl_10 = new java.util.concurrent.atomic.AtomicReference<>(null);
  private final kz.greetgo.depinject.core.BeanGetter<kz.greetgo.home.register.impl.AuthRegisterImpl> getter_native_AuthRegisterImpl_10 = this::get_native_AuthRegisterImpl_10;
  private kz.greetgo.home.register.impl.AuthRegisterImpl get_native_AuthRegisterImpl_10 () {
    {
      kz.greetgo.home.register.impl.AuthRegisterImpl x = cachedValue_native_AuthRegisterImpl_10.get();
      if (x != null) return x;
    }
    synchronized (forSynchronizedBlocks) {
      {
        kz.greetgo.home.register.impl.AuthRegisterImpl x = cachedValue_native_AuthRegisterImpl_10.get();
        if (x != null) return x;
      }
      try {
        kz.greetgo.home.register.impl.AuthRegisterImpl localValue = new kz.greetgo.home.register.impl.AuthRegisterImpl();
        localValue.authDao = (kz.greetgo.depinject.core.BeanGetter<kz.greetgo.home.register.dao.AuthDao>)(java.lang.Object)getter_native_AuthDaoPostgres_8;
        cachedValue_native_AuthRegisterImpl_10.set(localValue);
        return localValue;
      } catch (java.lang.Exception e) {
        if (e instanceof java.lang.RuntimeException) throw (java.lang.RuntimeException) e;
        throw new java.lang.RuntimeException(e);
      }
    }
  }

  private final java.util.concurrent.atomic.AtomicReference<kz.greetgo.home.register.impl.TestRegisterImpl> cachedValue_native_TestRegisterImpl_11 = new java.util.concurrent.atomic.AtomicReference<>(null);
  private final kz.greetgo.depinject.core.BeanGetter<kz.greetgo.home.register.impl.TestRegisterImpl> getter_native_TestRegisterImpl_11 = this::get_native_TestRegisterImpl_11;
  private kz.greetgo.home.register.impl.TestRegisterImpl get_native_TestRegisterImpl_11 () {
    {
      kz.greetgo.home.register.impl.TestRegisterImpl x = cachedValue_native_TestRegisterImpl_11.get();
      if (x != null) return x;
    }
    synchronized (forSynchronizedBlocks) {
      {
        kz.greetgo.home.register.impl.TestRegisterImpl x = cachedValue_native_TestRegisterImpl_11.get();
        if (x != null) return x;
      }
      try {
        kz.greetgo.home.register.impl.TestRegisterImpl localValue = new kz.greetgo.home.register.impl.TestRegisterImpl();
        localValue.testDao = (kz.greetgo.depinject.core.BeanGetter<kz.greetgo.home.register.dao.TestDao>)(java.lang.Object)getter_native_TestDaoPostgres_9;
        cachedValue_native_TestRegisterImpl_11.set(localValue);
        return localValue;
      } catch (java.lang.Exception e) {
        if (e instanceof java.lang.RuntimeException) throw (java.lang.RuntimeException) e;
        throw new java.lang.RuntimeException(e);
      }
    }
  }

  private final java.util.concurrent.atomic.AtomicReference<kz.greetgo.home.server.beans.AppInitializer> cachedValue_native_AppInitializer_12 = new java.util.concurrent.atomic.AtomicReference<>(null);
  private final kz.greetgo.depinject.core.BeanGetter<kz.greetgo.home.server.beans.AppInitializer> getter_native_AppInitializer_12 = this::get_native_AppInitializer_12;
  private kz.greetgo.home.server.beans.AppInitializer get_native_AppInitializer_12 () {
    {
      kz.greetgo.home.server.beans.AppInitializer x = cachedValue_native_AppInitializer_12.get();
      if (x != null) return x;
    }
    synchronized (forSynchronizedBlocks) {
      {
        kz.greetgo.home.server.beans.AppInitializer x = cachedValue_native_AppInitializer_12.get();
        if (x != null) return x;
      }
      try {
        kz.greetgo.home.server.beans.AppInitializer localValue = new kz.greetgo.home.server.beans.AppInitializer();
        localValue.controllerServlet = (kz.greetgo.depinject.core.BeanGetter<kz.greetgo.home.server.beans.ControllerServlet>)(java.lang.Object)getter_native_ControllerServlet_13;
        localValue.liquibaseManager = (kz.greetgo.depinject.core.BeanGetter<kz.greetgo.home.register.util.LiquibaseManager>)(java.lang.Object)getter_native_LiquibaseManagerImpl_6;
        localValue.utf8AndTraceResetFilter = (kz.greetgo.depinject.core.BeanGetter<kz.greetgo.home.server.beans.Utf8AndTraceResetFilter>)(java.lang.Object)getter_native_Utf8AndTraceResetFilter_14;
        cachedValue_native_AppInitializer_12.set(localValue);
        return localValue;
      } catch (java.lang.Exception e) {
        if (e instanceof java.lang.RuntimeException) throw (java.lang.RuntimeException) e;
        throw new java.lang.RuntimeException(e);
      }
    }
  }

  private final java.util.concurrent.atomic.AtomicReference<kz.greetgo.home.server.beans.ControllerServlet> cachedValue_native_ControllerServlet_13 = new java.util.concurrent.atomic.AtomicReference<>(null);
  private final kz.greetgo.depinject.core.BeanGetter<kz.greetgo.home.server.beans.ControllerServlet> getter_native_ControllerServlet_13 = this::get_native_ControllerServlet_13;
  private kz.greetgo.home.server.beans.ControllerServlet get_native_ControllerServlet_13 () {
    {
      kz.greetgo.home.server.beans.ControllerServlet x = cachedValue_native_ControllerServlet_13.get();
      if (x != null) return x;
    }
    synchronized (forSynchronizedBlocks) {
      {
        kz.greetgo.home.server.beans.ControllerServlet x = cachedValue_native_ControllerServlet_13.get();
        if (x != null) return x;
      }
      try {
        kz.greetgo.home.server.beans.ControllerServlet localValue = new kz.greetgo.home.server.beans.ControllerServlet();
        localValue.controllerList = (kz.greetgo.depinject.core.BeanGetter<java.util.List<kz.greetgo.home.controller.utils.Controller>>)(java.lang.Object)getter_ref_list_Controller_16;
        localValue.views = (kz.greetgo.depinject.core.BeanGetter<kz.greetgo.mvc.interfaces.Views>)(java.lang.Object)getter_native_WarEducationViews_15;
        cachedValue_native_ControllerServlet_13.set(localValue);
        return localValue;
      } catch (java.lang.Exception e) {
        if (e instanceof java.lang.RuntimeException) throw (java.lang.RuntimeException) e;
        throw new java.lang.RuntimeException(e);
      }
    }
  }

  private final java.util.concurrent.atomic.AtomicReference<kz.greetgo.home.server.beans.Utf8AndTraceResetFilter> cachedValue_native_Utf8AndTraceResetFilter_14 = new java.util.concurrent.atomic.AtomicReference<>(null);
  private final kz.greetgo.depinject.core.BeanGetter<kz.greetgo.home.server.beans.Utf8AndTraceResetFilter> getter_native_Utf8AndTraceResetFilter_14 = this::get_native_Utf8AndTraceResetFilter_14;
  private kz.greetgo.home.server.beans.Utf8AndTraceResetFilter get_native_Utf8AndTraceResetFilter_14 () {
    {
      kz.greetgo.home.server.beans.Utf8AndTraceResetFilter x = cachedValue_native_Utf8AndTraceResetFilter_14.get();
      if (x != null) return x;
    }
    synchronized (forSynchronizedBlocks) {
      {
        kz.greetgo.home.server.beans.Utf8AndTraceResetFilter x = cachedValue_native_Utf8AndTraceResetFilter_14.get();
        if (x != null) return x;
      }
      try {
        kz.greetgo.home.server.beans.Utf8AndTraceResetFilter localValue = new kz.greetgo.home.server.beans.Utf8AndTraceResetFilter();
        cachedValue_native_Utf8AndTraceResetFilter_14.set(localValue);
        return localValue;
      } catch (java.lang.Exception e) {
        if (e instanceof java.lang.RuntimeException) throw (java.lang.RuntimeException) e;
        throw new java.lang.RuntimeException(e);
      }
    }
  }

  private final java.util.concurrent.atomic.AtomicReference<kz.greetgo.home.server.beans.WarEducationViews> cachedValue_native_WarEducationViews_15 = new java.util.concurrent.atomic.AtomicReference<>(null);
  private final kz.greetgo.depinject.core.BeanGetter<kz.greetgo.home.server.beans.WarEducationViews> getter_native_WarEducationViews_15 = this::get_native_WarEducationViews_15;
  private kz.greetgo.home.server.beans.WarEducationViews get_native_WarEducationViews_15 () {
    {
      kz.greetgo.home.server.beans.WarEducationViews x = cachedValue_native_WarEducationViews_15.get();
      if (x != null) return x;
    }
    synchronized (forSynchronizedBlocks) {
      {
        kz.greetgo.home.server.beans.WarEducationViews x = cachedValue_native_WarEducationViews_15.get();
        if (x != null) return x;
      }
      try {
        kz.greetgo.home.server.beans.WarEducationViews localValue = new kz.greetgo.home.server.beans.WarEducationViews();
        cachedValue_native_WarEducationViews_15.set(localValue);
        return localValue;
      } catch (java.lang.Exception e) {
        if (e instanceof java.lang.RuntimeException) throw (java.lang.RuntimeException) e;
        throw new java.lang.RuntimeException(e);
      }
    }
  }

  //
  // Bean references
  //

  private final kz.greetgo.depinject.core.BeanGetter<java.util.List<kz.greetgo.home.controller.utils.Controller>> getter_ref_list_Controller_16 = this::get_ref_list_Controller_16;
  private java.util.List<kz.greetgo.home.controller.utils.Controller> get_ref_list_Controller_16() {
    java.util.List<kz.greetgo.home.controller.utils.Controller> list = new java.util.ArrayList<>();
    list.add(getter_native_AuthController_1.get());
    list.add(getter_native_TestController_2.get());
    return list;
  }
  
  //
  // Getter creations
  //
}
