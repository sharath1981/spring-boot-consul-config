# spring-boot-consul-config

docker run -d --name docker-consul -p 8500:8500 -e CONSUL_BIND_INTERFACE=eth0 consul

config/consul-config-app/data

custom:
  prop: Hello, How are you?
management:
  endpoints:
    web:
      exposure:
        include: '*'
