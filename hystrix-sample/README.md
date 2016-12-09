#Hystrix
断路由主要是一种保护机制,如果系统运行中某一个服务由于某种原因,导致无法响应,占用更多系统资源
最终导致,服务器压力负荷较大,整体运行缓慢,断路由的保护机制主要是,默认5秒20次失败,则开启路由保护
所有的请求将走fallback逻辑,服务器运行正常后,断路由将关闭,可以正常请求服务.

该服务主要应用于注册服务器中服务之间的调用,一般通过Feign的fallback集成使用.

## 知识点

[hystrix-javanica](https://github.com/Netflix/Hystrix/tree/master/hystrix-contrib/hystrix-javanica) java型语法,主要通过注解的形式
介绍了hystrix 的基本使用方法.
1. @HystrixCommand .同步执行
    
    1.1 groupKey: 默认为当前类名
    1.2 commandKey: 默认为当前方法名称

2. AsyncResult. 异步执行 ,详情参见说明.
3. fallback : 断路由开启之后的调用方法,其中也包括同步,异步.
4. ignoreExceptions: 忽略异常
5. @HystrixProperty: 详细配置了属性,线程数....


## 总结

一般使用中,单独使用的概率较低,通过Feign 组合简单使用,复杂的配置可以通过上述文章介绍进行定制.
