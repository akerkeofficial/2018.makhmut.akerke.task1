package kz.greetgo.home.stand.register_impl;

import kz.greetgo.depinject.core.Bean;
import kz.greetgo.home.controller.register.TestRegister;

@Bean
public class TestRegisterImpl implements TestRegister {


    @Override
    public String getText() {
        return "It is Stand Version";
    }
}
