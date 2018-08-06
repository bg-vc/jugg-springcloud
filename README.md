服务注册与发现:
jugg-eureka-server(两台 高可用)：
nohup java -Xms50m -Xmx100m -jar jugg-eureka-server-1.0.0.jar --spring.profiles.active=server1 >jugg-eureka-server1.out 2>&1 &
nohup java -Xms50m -Xmx100m -jar jugg-eureka-server-1.0.0.jar --spring.profiles.active=server2 >jugg-eureka-server2.out 2>&1 &

配置管理jugg-config-server：enableEurekaClient + spring-cloud-conifg + spring-cloud-bus + kafka-binder

服务网关jugg-gateway: enableDiscoveryClient + restTemplate-ribbon + hystrix

服务提供者jugg-payment: enableDiscoveryClient

Hystrix监控jugg-hystrix-dashboard、jugg-hystrix-turbine: hystrix-dashboard + hystrix-turbine

服务链接跟踪 pay-zipkin-server: sleuth + zikpin + mysql + kafka
