package kz.greetgo.home.controller.register;

import kz.greetgo.home.controller.model.AuthModel;

public interface AuthRegister {

    AuthModel checkPassword(String username, String password);
}
