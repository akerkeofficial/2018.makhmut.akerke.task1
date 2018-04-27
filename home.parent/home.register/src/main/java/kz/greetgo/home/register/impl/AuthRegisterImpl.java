package kz.greetgo.home.register.impl;

import kz.greetgo.depinject.core.Bean;
import kz.greetgo.depinject.core.BeanGetter;
import kz.greetgo.home.controller.model.AuthModel;
import kz.greetgo.home.controller.register.AuthRegister;
import kz.greetgo.home.register.dao.AuthDao;

@Bean
public class AuthRegisterImpl implements AuthRegister{

    public BeanGetter<AuthDao> authDao;

    @Override
    public AuthModel checkPassword(String username, String password) {
        String usernameString = authDao.get().getUsernameByUsernameAndPassword(username, password);
        AuthModel authModel = new AuthModel();
        if(usernameString!=null) authModel.text = "authenticated";
        return authModel;
    }
}
