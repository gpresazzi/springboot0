Scope of this project is to test spring boot + docker

## Build

### Build app
```
cd app
./gradlew build
```

### Build Docker
```
docker build --tag spring_app:1.0 .
```

### Run docker
```
docker run --publish 8000:8080 --detach spring_app:1.0
```

### Test

```
curl localhost:8000
```