package kz.greetgo.home.register.bean.postgres;

import kz.greetgo.depinject.core.Bean;
import kz.greetgo.depinject.core.BeanGetter;
import kz.greetgo.home.register.util.AbstractMybatisDaoImplFactory;
import org.apache.ibatis.session.Configuration;
import org.apache.ibatis.session.SqlSession;

@Bean
public class DaoImplFactory extends AbstractMybatisDaoImplFactory {

  public BeanGetter<DbSessionFactory> dbSessionFactory;

  @Override
  protected SqlSession getSqlSession() {
    return dbSessionFactory.get().sqlSession();
  }

  @Override
  protected Configuration getConfiguration() {
    return dbSessionFactory.get().getConfiguration();
  }
}
