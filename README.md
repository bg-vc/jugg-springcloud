服务注册与发现Eureka:
jugg-eureka-server(两台 高可用)：
nohup java -Xms20m -Xmx50m -jar jugg-eureka-server-1.0.0.jar --spring.profiles.active=server1 >jugg-eureka-server1.out 2>&1 &
nohup java -Xms20m -Xmx50m -jar jugg-eureka-server-1.0.0.jar --spring.profiles.active=server2 >jugg-eureka-server2.out 2>&1 &

配置管理：enableEurekaClient + spring-cloud-conifg + spring-cloud-bus + kafka-binder
jugg-config-server

服务网关: enableDiscoveryClient + restTemplate-ribbon + hystrix
jugg-gateway

服务提供者: enableDiscoveryClient
jugg-payment

Hystrix监控: hystrix-dashboard + hystrix-turbine
jugg-hystrix-dashboard：
jugg-hystrix-turbine：

服务链接跟踪: sleuth + zikpin + mysql + kafka
pay-zipkin-server:
