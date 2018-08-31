FROM registry.cn-beijing.aliyuncs.com/bases/java8:base
MAINTAINER duanml1@yonyou.com
EXPOSE 12051
ADD target/eureka-server-dev.jar /home/app.jar
ENTRYPOINT java -jar /home/app.jar