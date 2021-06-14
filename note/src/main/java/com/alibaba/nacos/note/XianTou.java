package com.alibaba.nacos.note;

import com.alibaba.nacos.core.cluster.ServerMemberManager;
import com.alibaba.nacos.core.code.SpringApplicationRunListener;
import com.alibaba.nacos.core.listener.LoggingApplicationListener;
import com.alibaba.nacos.core.listener.StartingApplicationListener;
/**
 * 线头：即程序启动时的逻辑入口
 * 目前已知的随项目启动而初始化的方法有：
 * 线头类型1：通过Bean的构造函数初始化，Bean在被加载到容器中时，会进行初始化，从而启动
 * 线头类型2：Bean实现ApplicationListener<WebServerInitializedEvent>，通过复写onApplicationEvent()方法来启动
 * 线头类型3：结合使用META-INF/spring.factories与实现SpringApplicationRunListener接口，从而启动，且该类型对应的类中的逻辑可以贯穿从应用
 *          启动到容器ready的整个生命流程，因此才无法使用类型1和2，因为前两者要求容器ready
 */
public class XianTou {
    /** 线头1  属于线头类型1 & 线头类型2
     * {@link ServerMemberManager}
     *
     */

    /** 线头3
     * {@link SpringApplicationRunListener}
     * 在静态代码块中初始化两个Listener：{@link LoggingApplicationListener}和{@link StartingApplicationListener}
     * 然后通过SpringApplicationRunListener中的hook接口来带动上述两个Listener中定义的逻辑的执行
     * * {@link LoggingApplicationListener}:作用是加载日志的配置文件META-INF/logback/nacos.xml
     * * {@link StartingApplicationListener}:初始化environment配置，并监控nacos的启动过程，并在控制台实时输出
     */

}














