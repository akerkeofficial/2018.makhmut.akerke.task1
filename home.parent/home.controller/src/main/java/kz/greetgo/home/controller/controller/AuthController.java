package kz.greetgo.home.controller.controller;

import kz.greetgo.depinject.core.Bean;
import kz.greetgo.depinject.core.BeanGetter;
import kz.greetgo.home.controller.model.AuthModel;
import kz.greetgo.home.controller.register.AuthRegister;
import kz.greetgo.home.controller.utils.Controller;
import kz.greetgo.mvc.annotations.Mapping;
import kz.greetgo.mvc.annotations.Par;
import kz.greetgo.mvc.annotations.ToJson;

@Bean
public class AuthController implements Controller{

    public BeanGetter<AuthRegister> authRegister;

    @Mapping("/login")
    @ToJson
    public AuthModel checkAuth(@Par("username")String username, @Par("password")String password){
        return authRegister.get().checkPassword(username,password);
    }
}
