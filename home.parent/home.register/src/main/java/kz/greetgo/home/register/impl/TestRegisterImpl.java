package kz.greetgo.home.register.impl;

import kz.greetgo.depinject.core.Bean;
import kz.greetgo.depinject.core.BeanGetter;
import kz.greetgo.home.controller.register.TestRegister;
import kz.greetgo.home.register.dao.TestDao;

@Bean
public class TestRegisterImpl implements TestRegister{

    public BeanGetter<TestDao> testDao;

    @Override
    public String getText() {
        return testDao.get().getTestText();
    }
}
