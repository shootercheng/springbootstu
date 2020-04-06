package com.scd.boot.factory;

import org.springframework.beans.factory.FactoryBean;
import org.springframework.boot.autoconfigure.condition.ConditionalOnProperty;
import org.springframework.context.annotation.Conditional;
import org.springframework.context.annotation.Configuration;

/**
 * @author James
 */
@Configuration
@ConditionalOnProperty(prefix = "bean.factory", name = "type", havingValue = "prototype")
public class SqlSessionPrototypeFactoryBean implements FactoryBean<SqlSession> {
    @Override
    public SqlSession getObject() throws Exception {
        return new SqlSession();
    }

    @Override
    public Class<?> getObjectType() {
        return SqlSession.class;
    }

    @Override
    public boolean isSingleton() {
        return false;
    }
}
