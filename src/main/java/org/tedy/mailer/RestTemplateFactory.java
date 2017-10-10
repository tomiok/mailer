package org.tedy.mailer;

import org.springframework.beans.factory.FactoryBean;
import org.springframework.beans.factory.InitializingBean;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.http.client.ClientHttpRequestInterceptor;
import org.springframework.http.client.support.BasicAuthorizationInterceptor;
import org.springframework.stereotype.Component;
import org.springframework.web.client.RestTemplate;
import org.springframework.web.util.DefaultUriTemplateHandler;

import java.util.ArrayList;
import java.util.List;
import java.util.Properties;

/**
 * Created by tedy on 10/1/17.
 */
@Component
public class RestTemplateFactory implements FactoryBean<RestTemplate>, InitializingBean {
    @Autowired
    @Qualifier("mailer")
    private Properties props;

    private RestTemplate restTemplate;

    public RestTemplate getObject() {
        return restTemplate;
    }
    public Class<RestTemplate> getObjectType() {
        return RestTemplate.class;
    }
    public boolean isSingleton() {
        return true;
    }

    @Override
    public void afterPropertiesSet() {
        this.restTemplate = new RestTemplate();
        // set basic auth
        List<ClientHttpRequestInterceptor> interceptors = new ArrayList<ClientHttpRequestInterceptor>();
        interceptors.add( new BasicAuthorizationInterceptor(props.getProperty("mailer.user"), props.getProperty("mailer.key")));
        restTemplate.setInterceptors(interceptors);

        // set a baseurl from props
        DefaultUriTemplateHandler uriTemplateHandler = new DefaultUriTemplateHandler();
        uriTemplateHandler.setBaseUrl(props.getProperty("mailer.url.protocol")+props.getProperty("mailer.url.dc")+props.getProperty("mailer.url.base"));
        restTemplate. setUriTemplateHandler(uriTemplateHandler);
    }
}