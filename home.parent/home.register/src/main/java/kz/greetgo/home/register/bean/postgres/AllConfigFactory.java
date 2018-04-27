package kz.greetgo.home.register.bean.postgres;

import kz.greetgo.home.register.config.DbConfig;
import kz.greetgo.home.register.util.App;
import kz.greetgo.conf.hot.HotConfigFactory;
import kz.greetgo.depinject.core.Bean;

@Bean
public class AllConfigFactory extends HotConfigFactory {

    @Bean
    public DbConfig createDbConfig(){
        return createConfig(DbConfig.class);
    }

    @Override
    protected String getBaseDir() {
        return App.appDir() + "/conf";
    }
}
