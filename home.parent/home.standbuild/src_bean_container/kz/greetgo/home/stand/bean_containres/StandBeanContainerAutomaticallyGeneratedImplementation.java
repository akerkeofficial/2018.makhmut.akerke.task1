package kz.greetgo.home.stand.bean_containres;
public final class StandBeanContainerAutomaticallyGeneratedImplementation implements kz.greetgo.home.stand.bean_containres.StandBeanContainer{

  private final java.lang.Object forSynchronizedBlocks = new java.lang.Object();

  //
  // Bean container methods
  //

  @java.lang.Override
  public kz.greetgo.home.stand.beans.StandServer standServer() {
    return getter_native_StandServer_1.get();
  }

  //
  // Bean creations
  //

  private final java.util.concurrent.atomic.AtomicReference<kz.greetgo.home.stand.beans.StandServer> cachedValue_native_StandServer_1 = new java.util.concurrent.atomic.AtomicReference<>(null);
  private final kz.greetgo.depinject.core.BeanGetter<kz.greetgo.home.stand.beans.StandServer> getter_native_StandServer_1 = this::get_native_StandServer_1;
  private kz.greetgo.home.stand.beans.StandServer get_native_StandServer_1 () {
    {
      kz.greetgo.home.stand.beans.StandServer x = cachedValue_native_StandServer_1.get();
      if (x != null) return x;
    }
    synchronized (forSynchronizedBlocks) {
      {
        kz.greetgo.home.stand.beans.StandServer x = cachedValue_native_StandServer_1.get();
        if (x != null) return x;
      }
      try {
        kz.greetgo.home.stand.beans.StandServer localValue = new kz.greetgo.home.stand.beans.StandServer();
        localValue.webAppContextRegistration = (kz.greetgo.depinject.core.BeanGetter<java.util.List<kz.greetgo.home.stand.utils.WebAppContextRegistration>>)(java.lang.Object)getter_ref_list_WebAppContextRegistration_3;
        localValue.afterInject();
        cachedValue_native_StandServer_1.set(localValue);
        return localValue;
      } catch (java.lang.Exception e) {
        if (e instanceof java.lang.RuntimeException) throw (java.lang.RuntimeException) e;
        throw new java.lang.RuntimeException(e);
      }
    }
  }

  private final java.util.concurrent.atomic.AtomicReference<kz.greetgo.home.stand.beans.UtfFilterRegistration> cachedValue_native_UtfFilterRegistration_2 = new java.util.concurrent.atomic.AtomicReference<>(null);
  private final kz.greetgo.depinject.core.BeanGetter<kz.greetgo.home.stand.beans.UtfFilterRegistration> getter_native_UtfFilterRegistration_2 = this::get_native_UtfFilterRegistration_2;
  private kz.greetgo.home.stand.beans.UtfFilterRegistration get_native_UtfFilterRegistration_2 () {
    {
      kz.greetgo.home.stand.beans.UtfFilterRegistration x = cachedValue_native_UtfFilterRegistration_2.get();
      if (x != null) return x;
    }
    synchronized (forSynchronizedBlocks) {
      {
        kz.greetgo.home.stand.beans.UtfFilterRegistration x = cachedValue_native_UtfFilterRegistration_2.get();
        if (x != null) return x;
      }
      try {
        kz.greetgo.home.stand.beans.UtfFilterRegistration localValue = new kz.greetgo.home.stand.beans.UtfFilterRegistration();
        cachedValue_native_UtfFilterRegistration_2.set(localValue);
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

  private final kz.greetgo.depinject.core.BeanGetter<java.util.List<kz.greetgo.home.stand.utils.WebAppContextRegistration>> getter_ref_list_WebAppContextRegistration_3 = this::get_ref_list_WebAppContextRegistration_3;
  private java.util.List<kz.greetgo.home.stand.utils.WebAppContextRegistration> get_ref_list_WebAppContextRegistration_3() {
    java.util.List<kz.greetgo.home.stand.utils.WebAppContextRegistration> list = new java.util.ArrayList<>();
    list.add(getter_native_UtfFilterRegistration_2.get());
    return list;
  }
  
  //
  // Getter creations
  //
}