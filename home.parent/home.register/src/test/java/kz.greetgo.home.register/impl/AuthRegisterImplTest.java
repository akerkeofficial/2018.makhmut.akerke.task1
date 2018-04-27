package kz.greetgo.home.register.impl;

import kz.greetgo.depinject.testng.AbstractDepinjectTestNg;
import kz.greetgo.depinject.testng.ContainerConfig;
import kz.greetgo.home.register.test.util.BeanContainerForTest;
import org.testng.annotations.Test;

@ContainerConfig(BeanContainerForTest.class)
public class AuthRegisterImplTest extends AbstractDepinjectTestNg {

    @Test
    public void checkPassword(){

    }
}
