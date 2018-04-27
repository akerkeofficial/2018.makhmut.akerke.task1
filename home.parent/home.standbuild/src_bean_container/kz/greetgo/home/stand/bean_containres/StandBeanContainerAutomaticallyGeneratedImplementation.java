package kz.greetgo.home.stand.bean_containres;
public final class StandBeanContainerAutomaticallyGeneratedImplementation implements kz.greetgo.home.stand.bean_containres.StandBeanContainer{

  private final java.lang.Object forSynchronizedBlocks = new java.lang.Object();

  //
  // Bean container methods
  //

  @java.lang.Override
  public kz.greetgo.home.stand.beans.StandServer standServer() {
    return getter_native_StandServer_6.get();
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
        localValue.authRegister = (kz.greetgo.depinject.core.BeanGetter<kz.greetgo.home.controller.register.AuthRegister>)(java.lang.Object)getter_native_AuthRegisterStandImpl_8;
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
        localValue.testRegisterBean = (kz.greetgo.depinject.core.BeanGetter<kz.greetgo.home.controller.register.TestRegister>)(java.lang.Object)getter_native_TestRegisterImpl_9;
        cachedValue_native_TestController_2.set(localValue);
        return localValue;
      } catch (java.lang.Exception e) {
        if (e instanceof java.lang.RuntimeException) throw (java.lang.RuntimeException) e;
        throw new java.lang.RuntimeException(e);
      }
    }
  }

  private final java.util.concurrent.atomic.AtomicReference<kz.greetgo.home.stand.beans.CrossOriginFilterRegistration> cachedValue_native_CrossOriginFilterRegistration_3 = new java.util.concurrent.atomic.AtomicReference<>(null);
  private final kz.greetgo.depinject.core.BeanGetter<kz.greetgo.home.stand.beans.CrossOriginFilterRegistration> getter_native_CrossOriginFilterRegistration_3 = this::get_native_CrossOriginFilterRegistration_3;
  private kz.greetgo.home.stand.beans.CrossOriginFilterRegistration get_native_CrossOriginFilterRegistration_3 () {
    {
      kz.greetgo.home.stand.beans.CrossOriginFilterRegistration x = cachedValue_native_CrossOriginFilterRegistration_3.get();
      if (x != null) return x;
    }
    synchronized (forSynchronizedBlocks) {
      {
        kz.greetgo.home.stand.beans.CrossOriginFilterRegistration x = cachedValue_native_CrossOriginFilterRegistration_3.get();
        if (x != null) return x;
      }
      try {
        kz.greetgo.home.stand.beans.CrossOriginFilterRegistration localValue = new kz.greetgo.home.stand.beans.CrossOriginFilterRegistration();
        cachedValue_native_CrossOriginFilterRegistration_3.set(localValue);
        return localValue;
      } catch (java.lang.Exception e) {
        if (e instanceof java.lang.RuntimeException) throw (java.lang.RuntimeException) e;
        throw new java.lang.RuntimeException(e);
      }
    }
  }

  private final java.util.concurrent.atomic.AtomicReference<kz.greetgo.home.stand.beans.JettyControllerRegistration> cachedValue_native_JettyControllerRegistration_4 = new java.util.concurrent.atomic.AtomicReference<>(null);
  private final kz.greetgo.depinject.core.BeanGetter<kz.greetgo.home.stand.beans.JettyControllerRegistration> getter_native_JettyControllerRegistration_4 = this::get_native_JettyControllerRegistration_4;
  private kz.greetgo.home.stand.beans.JettyControllerRegistration get_native_JettyControllerRegistration_4 () {
    {
      kz.greetgo.home.stand.beans.JettyControllerRegistration x = cachedValue_native_JettyControllerRegistration_4.get();
      if (x != null) return x;
    }
    synchronized (forSynchronizedBlocks) {
      {
        kz.greetgo.home.stand.beans.JettyControllerRegistration x = cachedValue_native_JettyControllerRegistration_4.get();
        if (x != null) return x;
      }
      try {
        kz.greetgo.home.stand.beans.JettyControllerRegistration localValue = new kz.greetgo.home.stand.beans.JettyControllerRegistration();
        localValue.controllerList = (kz.greetgo.depinject.core.BeanGetter<java.util.List<kz.greetgo.home.controller.utils.Controller>>)(java.lang.Object)getter_ref_list_Controller_10;
        localValue.view = (kz.greetgo.depinject.core.BeanGetter<kz.greetgo.mvc.interfaces.Views>)(java.lang.Object)getter_native_StandHomeViews_5;
        cachedValue_native_JettyControllerRegistration_4.set(localValue);
        return localValue;
      } catch (java.lang.Exception e) {
        if (e instanceof java.lang.RuntimeException) throw (java.lang.RuntimeException) e;
        throw new java.lang.RuntimeException(e);
      }
    }
  }

  private final java.util.concurrent.atomic.AtomicReference<kz.greetgo.home.stand.beans.StandHomeViews> cachedValue_native_StandHomeViews_5 = new java.util.concurrent.atomic.AtomicReference<>(null);
  private final kz.greetgo.depinject.core.BeanGetter<kz.greetgo.home.stand.beans.StandHomeViews> getter_native_StandHomeViews_5 = this::get_native_StandHomeViews_5;
  private kz.greetgo.home.stand.beans.StandHomeViews get_native_StandHomeViews_5 () {
    {
      kz.greetgo.home.stand.beans.StandHomeViews x = cachedValue_native_StandHomeViews_5.get();
      if (x != null) return x;
    }
    synchronized (forSynchronizedBlocks) {
      {
        kz.greetgo.home.stand.beans.StandHomeViews x = cachedValue_native_StandHomeViews_5.get();
        if (x != null) return x;
      }
      try {
        kz.greetgo.home.stand.beans.StandHomeViews localValue = new kz.greetgo.home.stand.beans.StandHomeViews();
        cachedValue_native_StandHomeViews_5.set(localValue);
        return localValue;
      } catch (java.lang.Exception e) {
        if (e instanceof java.lang.RuntimeException) throw (java.lang.RuntimeException) e;
        throw new java.lang.RuntimeException(e);
      }
    }
  }

  private final java.util.concurrent.atomic.AtomicReference<kz.greetgo.home.stand.beans.StandServer> cachedValue_native_StandServer_6 = new java.util.concurrent.atomic.AtomicReference<>(null);
  private final kz.greetgo.depinject.core.BeanGetter<kz.greetgo.home.stand.beans.StandServer> getter_native_StandServer_6 = this::get_native_StandServer_6;
  private kz.greetgo.home.stand.beans.StandServer get_native_StandServer_6 () {
    {
      kz.greetgo.home.stand.beans.StandServer x = cachedValue_native_StandServer_6.get();
      if (x != null) return x;
    }
    synchronized (forSynchronizedBlocks) {
      {
        kz.greetgo.home.stand.beans.StandServer x = cachedValue_native_StandServer_6.get();
        if (x != null) return x;
      }
      try {
        kz.greetgo.home.stand.beans.StandServer localValue = new kz.greetgo.home.stand.beans.StandServer();
        localValue.webAppContextRegistration = (kz.greetgo.depinject.core.BeanGetter<java.util.List<kz.greetgo.home.stand.utils.WebAppContextRegistration>>)(java.lang.Object)getter_ref_list_WebAppContextRegistration_11;
        localValue.afterInject();
        cachedValue_native_StandServer_6.set(localValue);
        return localValue;
      } catch (java.lang.Exception e) {
        if (e instanceof java.lang.RuntimeException) throw (java.lang.RuntimeException) e;
        throw new java.lang.RuntimeException(e);
      }
    }
  }

  private final java.util.concurrent.atomic.AtomicReference<kz.greetgo.home.stand.beans.UtfFilterRegistration> cachedValue_native_UtfFilterRegistration_7 = new java.util.concurrent.atomic.AtomicReference<>(null);
  private final kz.greetgo.depinject.core.BeanGetter<kz.greetgo.home.stand.beans.UtfFilterRegistration> getter_native_UtfFilterRegistration_7 = this::get_native_UtfFilterRegistration_7;
  private kz.greetgo.home.stand.beans.UtfFilterRegistration get_native_UtfFilterRegistration_7 () {
    {
      kz.greetgo.home.stand.beans.UtfFilterRegistration x = cachedValue_native_UtfFilterRegistration_7.get();
      if (x != null) return x;
    }
    synchronized (forSynchronizedBlocks) {
      {
        kz.greetgo.home.stand.beans.UtfFilterRegistration x = cachedValue_native_UtfFilterRegistration_7.get();
        if (x != null) return x;
      }
      try {
        kz.greetgo.home.stand.beans.UtfFilterRegistration localValue = new kz.greetgo.home.stand.beans.UtfFilterRegistration();
        cachedValue_native_UtfFilterRegistration_7.set(localValue);
        return localValue;
      } catch (java.lang.Exception e) {
        if (e instanceof java.lang.RuntimeException) throw (java.lang.RuntimeException) e;
        throw new java.lang.RuntimeException(e);
      }
    }
  }

  private final java.util.concurrent.atomic.AtomicReference<kz.greetgo.home.stand.register_impl.AuthRegisterStandImpl> cachedValue_native_AuthRegisterStandImpl_8 = new java.util.concurrent.atomic.AtomicReference<>(null);
  private final kz.greetgo.depinject.core.BeanGetter<kz.greetgo.home.stand.register_impl.AuthRegisterStandImpl> getter_native_AuthRegisterStandImpl_8 = this::get_native_AuthRegisterStandImpl_8;
  private kz.greetgo.home.stand.register_impl.AuthRegisterStandImpl get_native_AuthRegisterStandImpl_8 () {
    {
      kz.greetgo.home.stand.register_impl.AuthRegisterStandImpl x = cachedValue_native_AuthRegisterStandImpl_8.get();
      if (x != null) return x;
    }
    synchronized (forSynchronizedBlocks) {
      {
        kz.greetgo.home.stand.register_impl.AuthRegisterStandImpl x = cachedValue_native_AuthRegisterStandImpl_8.get();
        if (x != null) return x;
      }
      try {
        kz.greetgo.home.stand.register_impl.AuthRegisterStandImpl localValue = new kz.greetgo.home.stand.register_impl.AuthRegisterStandImpl();
        cachedValue_native_AuthRegisterStandImpl_8.set(localValue);
        return localValue;
      } catch (java.lang.Exception e) {
        if (e instanceof java.lang.RuntimeException) throw (java.lang.RuntimeException) e;
        throw new java.lang.RuntimeException(e);
      }
    }
  }

  private final java.util.concurrent.atomic.AtomicReference<kz.greetgo.home.stand.register_impl.TestRegisterImpl> cachedValue_native_TestRegisterImpl_9 = new java.util.concurrent.atomic.AtomicReference<>(null);
  private final kz.greetgo.depinject.core.BeanGetter<kz.greetgo.home.stand.register_impl.TestRegisterImpl> getter_native_TestRegisterImpl_9 = this::get_native_TestRegisterImpl_9;
  private kz.greetgo.home.stand.register_impl.TestRegisterImpl get_native_TestRegisterImpl_9 () {
    {
      kz.greetgo.home.stand.register_impl.TestRegisterImpl x = cachedValue_native_TestRegisterImpl_9.get();
      if (x != null) return x;
    }
    synchronized (forSynchronizedBlocks) {
      {
        kz.greetgo.home.stand.register_impl.TestRegisterImpl x = cachedValue_native_TestRegisterImpl_9.get();
        if (x != null) return x;
      }
      try {
        kz.greetgo.home.stand.register_impl.TestRegisterImpl localValue = new kz.greetgo.home.stand.register_impl.TestRegisterImpl();
        cachedValue_native_TestRegisterImpl_9.set(localValue);
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

  private final kz.greetgo.depinject.core.BeanGetter<java.util.List<kz.greetgo.home.controller.utils.Controller>> getter_ref_list_Controller_10 = this::get_ref_list_Controller_10;
  private java.util.List<kz.greetgo.home.controller.utils.Controller> get_ref_list_Controller_10() {
    java.util.List<kz.greetgo.home.controller.utils.Controller> list = new java.util.ArrayList<>();
    list.add(getter_native_AuthController_1.get());
    list.add(getter_native_TestController_2.get());
    return list;
  }

  private final kz.greetgo.depinject.core.BeanGetter<java.util.List<kz.greetgo.home.stand.utils.WebAppContextRegistration>> getter_ref_list_WebAppContextRegistration_11 = this::get_ref_list_WebAppContextRegistration_11;
  private java.util.List<kz.greetgo.home.stand.utils.WebAppContextRegistration> get_ref_list_WebAppContextRegistration_11() {
    java.util.List<kz.greetgo.home.stand.utils.WebAppContextRegistration> list = new java.util.ArrayList<>();
    list.add(getter_native_CrossOriginFilterRegistration_3.get());
    list.add(getter_native_JettyControllerRegistration_4.get());
    list.add(getter_native_UtfFilterRegistration_7.get());
    return list;
  }
  
  //
  // Getter creations
  //
}
