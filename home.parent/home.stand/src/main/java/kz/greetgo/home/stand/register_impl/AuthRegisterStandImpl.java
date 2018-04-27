package kz.greetgo.home.stand.register_impl;

import kz.greetgo.depinject.core.Bean;
import kz.greetgo.home.controller.model.AuthModel;
import kz.greetgo.home.controller.register.AuthRegister;

@Bean
public class AuthRegisterStandImpl implements AuthRegister {
    @Override
    public AuthModel checkPassword(String username, String password) {
        AuthModel authModel = new AuthModel();
        authModel.text = "authenticated";
        return authModel;
    }
}
