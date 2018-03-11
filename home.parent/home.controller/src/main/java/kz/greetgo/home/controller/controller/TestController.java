package kz.greetgo.home.controller.controller;

import kz.greetgo.depinject.core.Bean;
import kz.greetgo.depinject.core.BeanGetter;
import kz.greetgo.home.controller.register.TestRegister;
import kz.greetgo.home.controller.utils.Controller;
import kz.greetgo.mvc.annotations.Mapping;
import kz.greetgo.mvc.annotations.ToJson;

@Bean
public class TestController  implements Controller{

    public BeanGetter<TestRegister> testRegisterBean;

    @ToJson
    @Mapping("/getMainText")
    public String getText(){
//        System.out.println("asdasdasdsa");
//        return "Everything is ok";
        return testRegisterBean.get().getText();
    }
}
