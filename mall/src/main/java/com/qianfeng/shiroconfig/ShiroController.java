package com.qianfeng.shiroconfig;

import com.alibaba.druid.pool.DruidDataSource;
import org.apache.shiro.realm.jdbc.JdbcRealm;
import org.apache.shiro.spring.web.ShiroFilterFactoryBean;
import org.apache.shiro.web.mgt.DefaultWebSecurityManager;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.util.LinkedHashMap;

/**
 * Created by Administrator on 2017/11/7 0007.
 */
@Configuration
public class ShiroController {
    @Bean
    public ShiroFilterFactoryBean filterFactoryBean(DefaultWebSecurityManager ds){
        ShiroFilterFactoryBean bean = new ShiroFilterFactoryBean();
        bean.setSecurityManager(ds);
        bean.setLoginUrl("/");

        bean.setUnauthorizedUrl("/noqu.html");
        LinkedHashMap<String, String> data = new LinkedHashMap<>();
//有类别管理权限才能访问findAllCategory
        data.put("/findAllCategory","perms[类别管理]");
        //保护所有页面除了index.html
        data.put("/index.html","anon");
        //登录后才能访问html
        data.put("/test.html","authc");
        data.put("/**","anon");
        bean.setFilterChainDefinitionMap(data);
        return bean;
    }
@Bean
public DefaultWebSecurityManager securityManager(JdbcRealm realm){
    DefaultWebSecurityManager ds = new DefaultWebSecurityManager();
        ds.setRealm(realm);
    return ds;
}

    @Bean
    public JdbcRealm jdbcRealm(DruidDataSource druidDataSource){
        JdbcRealm realm = new JdbcRealm();
        realm.setPermissionsLookupEnabled(true);
        realm.setDataSource(druidDataSource);
        realm.setAuthenticationQuery("select pwd from users where account=?");
        realm.setUserRolesQuery("select r.name from role r left join user_role ur on ur.rid=r.id left join users u on ur.uid=u.id where u.account=?");
        realm.setPermissionsQuery("select re.text from res re left join role_res rr on rr.resid=re.id left join role r on rr.roleid=r.id where r.name=? ");
        return realm;


    }


    @Bean
    @ConfigurationProperties(prefix = "spring.datasource")
public DruidDataSource druidDataSource(){
        DruidDataSource druidDataSource=new DruidDataSource();
        return druidDataSource;


}
}
