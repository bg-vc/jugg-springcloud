服务注册与发现Eureka:
jugg-eureka-server(一台)：
http://localhost:2001
jugg-eureka-server(两台 高可用)：
nohup java -Xms20m -Xmx50m -jar jugg-eureka-server-1.0.0.jar --spring.profiles.active=server1 >jugg-eureka-server1.out 2>&1 &
nohup java -Xms20m -Xmx50m -jar jugg-eureka-server-1.0.0.jar --spring.profiles.active=server2 >jugg-eureka-server2.out 2>&1 &
http://localhost:2001
http://localhost:2002

配置管理：enableEurekaClient + spring-cloud-conifg + spring-cloud-bus + kafka-binder
jugg-config-server:
nohup java -Xms50m -Xmx100m -jar jugg-config-server-1.0.0.jar >jugg-config-server.out 2>&1 &
获取配置信息: http://localhost:2101/jugg-gateway/dev/master

服务网关: enableDiscoveryClient + restTemplate-ribbon + hystrix
jugg-gateway:
nohup java -Xms50m -Xmx100m -jar jugg-gateway-1.0.0.jar >jugg-gateway.out 2>&1 &
http://localhost:2102/swagger-ui.html

服务提供者: enableDiscoveryClient
jugg-payment: 
nohup java -Xms50m -Xmx100m -jar jugg-payment-1.0.0.jar >jugg-payment.out 2>&1 &
http://localhost:2103/api/value

Hystrix监控: hystrix-dashboard + pay-hystrix-turbine
jugg-hystrix-dashboard：
nohup java -Xms50m -Xmx100m -jar jugg-hystrix-dashboard-1.0.0.jar >jugg-hystrix-dashboard.out 2>&1 &
http://localhost:2104/hystrix
http://localhost:2102/hystrix.stream
jugg-hystrix-turbine：
nohup java -Xms50m -Xmx100m -jar jugg-hystrix-turbine-1.0.0.jar >jugg-hystrix-turbine.out 2>&1 &
http://localhost:2105/turbine.stream

服务链接跟踪: sleuth + zikpin + mysql + kafka
pay-zipkin-server:
nohup java -Xms50m -Xmx100m -jar jugg-zipkin-server-1.0.0.jar >jugg-zipkin-server.out 2>&1 &
http://localhost:2106
