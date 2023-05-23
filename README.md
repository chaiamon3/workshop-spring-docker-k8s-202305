# Workshop :: Develop Microservices with Spring Boot
* Docker
* Kubernetes + Minikube

## Working with Docker compose
1. Create file `docker-compose.yml`

2. Build image 
```
$docker compose build
```

3. Run container
```
$docker compose up -d
$docker-compose ps
```

4. Remove all containers
```
$docker compose down
```


## Working with Docker Swarm

Create a cluster
```
$docker swarm init

$docker node ls
```

Deploy 
```
$docker stack deploy --compose-file docker-compose-deploy.yml dev

$docker stack ls
$docker service ls
```

Scaling
```
$docker service scale dev_service1=5

dev_service1 scaled to 5
overall progress: 5 out of 5 tasks 
1/5: running   
2/5: running   
3/5: running   
4/5: running   
5/5: running   
verify: Service converged
```

Leave from Docker swarm
```
$docker swarm leave --force
```

## Working with Kubernetes
* [Deployment with K8s + miniKube](https://github.com/up1/workshop-spring-docker-k8s-202305/wiki/Deployment-with-K8S)
