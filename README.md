#微服务框架DEMO

## 1.模块说明
### 1.common-entity 
存放公共实体
### 2.eureka-server
注册中心服务端
### 3.gateway-zuul
网关服务，用于统一访问资源
### 4.order-service
订单服务，包含消费user-service服务的DEMO
### 5.user-service
用户服务
## 2.组件介绍
### 1.Eureka
Eureka 是 Spring Cloud Netflix 微服务套件中的一部分，可以与 Springboot 构建的微服务很容易的整合起来。

Eureka 支持高可用的配置，当集群中有分片出现故障时，Eureka 就会转入自动保护模式，它允许分片故障期间继续提供服务的发现和注册，当故障分片恢复正常时，集群中其他分片会把他们的状态再次同步回来。

Eureka 包含了服务器端和客户端组件。

服务器端，也被称作是服务注册中心，用于提供服务的注册与发现。

客户端组件包含服务消费者与服务生产者。

在应用程序运行时，Eureka 客户端向注册中心注册自身提供的服务并周期性的发送心跳来更新它的服务租约。同时也可以从服务端查询当前注册的服务信息并把他们缓存到本地并周期性的刷新服务状态。

作者：panzhangbao

链接：https://www.jianshu.com/p/9e27009a7a7d

来源：简书

简书著作权归作者所有，任何形式的转载都请联系作者获得授权并注明出处。

### 2.Feign
Feign 是一个声明 web 服务客户端，这便得编写 web 服务客户端更容易。

使用Feign 创建一个接口并对它进行注解，它具有可插拔的注解支持包括 Feign 注解与 JAX-RS 注解，Feign 还支持可插拔的编码器与解码器。

Spring Cloud 增加了对 Spring MVC 的注解，Spring Web 默认使用了HttpMessageConverters, Spring Cloud 集成 Ribbon 和 Eureka 提供的负载均衡的 HTTP 客户端 Feign。

作者：panzhangbao

链接：https://www.jianshu.com/p/46953aac938f

来源：简书

简书著作权归作者所有，任何形式的转载都请联系作者获得授权并注明出处。

### 3.Hystrix
在一个分布式系统里，许多依赖不可避免的会调用失败，比如超时、异常等，如何能够保证在一个依赖出问题的情况下，不会导致整体服务失败，这个就是Hystrix需要做的事情。

Hystrix提供了熔断、隔离、Fallback、cache、监控等功能，能够在一个、或多个依赖同时出现问题时保证系统依然可用。

作者：panzhangbao

链接：https://www.jianshu.com/p/73750f868ffd

来源：简书

简书著作权归作者所有，任何形式的转载都请联系作者获得授权并注明出处。

### 4.Zuul
Zuul的主要功能是路由转发和过滤器。路由功能是微服务的一部分，比如／api/user转发到到user服务，/api/shop转发到到shop服务。zuul默认和Ribbon结合实现了负载均衡的功能。

zuul有以下功能：

- Authentication
- Insights
- Stress Testing
- Canary Testing
- Dynamic Routing
- Service Migration
- Load Shedding
- Security
- Static Response handling
- Active/Active traffic management

版权声明：本文为CSDN博主「方志朋」的原创文章，遵循CC 4.0 by-sa版权协议，转载请附上原文出处链接及本声明。

原文链接：https://blog.csdn.net/forezp/article/details/81041012