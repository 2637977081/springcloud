echo "version : "
read  version
docker login --username=ccyonyou registry.cn-beijing.aliyuncs.com
docker build -t registry.cn-beijing.aliyuncs.com/rndealer/eureka-server:$version .
docker push registry.cn-beijing.aliyuncs.com/rndealer/eureka-server:$version
