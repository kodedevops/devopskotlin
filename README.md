# Getting Started
Public Url to Test After deployment
```
http://IP_ADDRESS:PORT/kotlin-service/first/
http://IP_ADDRESS:PORT/kotlin-service/first/health
http://IP_ADDRESS:PORT/kotlin-service/first/hello
http://IP_ADDRESS:PORT/kotlin-service/first/list
http://IP_ADDRESS:PORT/kotlin-service/first/map
```



# devopskotlin
```
docker login
docker buildx create --use
docker buildx inspect --bootstrap

docker buildx build --platform linux/amd64,linux/arm64 -t santoshmondal/devopskotlin:latest --push .
docker buildx build --platform linux/amd64,linux/arm64 -t santoshmondal/devopskotlin:1.0.0 --push .

docker run -p 8080:8080 santoshmondal/devopskotlin
```
