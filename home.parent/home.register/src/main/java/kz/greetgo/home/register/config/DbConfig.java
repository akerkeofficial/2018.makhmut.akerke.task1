package kz.greetgo.home.register.config;

import kz.greetgo.conf.hot.DefaultStrValue;

public interface DbConfig {

    @DefaultStrValue("jdbc:postgresql://localhost:5432/home")
    String url();

    @DefaultStrValue("home")
    String username();

    @DefaultStrValue("home")
    String password();
}
