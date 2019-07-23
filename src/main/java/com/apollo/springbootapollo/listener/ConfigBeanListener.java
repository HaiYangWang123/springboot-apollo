package com.apollo.springbootapollo.listener;

import com.ctrip.framework.apollo.model.ConfigChange;
import com.ctrip.framework.apollo.model.ConfigChangeEvent;
import com.ctrip.framework.apollo.spring.annotation.ApolloConfigChangeListener;
import org.springframework.stereotype.Component;

/**
 * @ClassName: ConfigBeanListener
 * @Description: todo java类作用描述
 * @Author: hywang
 * @CreateDate: 2018/10/12 10:43 AM
 * @Version: 1.0
 */
@Component
public class ConfigBeanListener {

    // config change listener for namespace application
    @ApolloConfigChangeListener("application")
    private void anotherOnChange(ConfigChangeEvent changeEvent) {

        System.out.println("namespace:"+changeEvent.getNamespace());
        ConfigChange change = changeEvent.getChange("baidu.url");
        if (null != change) {
            System.out.println(String.format("Found change - key: %s, oldValue: %s," + "newValue: %s, changeType: %s",
                    change.getPropertyName(), change.getOldValue(), change.getNewValue(), change.getChangeType()));
        }


    }


}
