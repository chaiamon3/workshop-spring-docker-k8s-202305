#!/bin/bash

docker compose -f docker-compose-deploy.yml down
docker compose -f docker-compose-deploy.yml up -d

echo "Service starting ..."

status="starting"
while [  "$status" != "healthy" ]
do
    status=$(docker container inspect --format {{.State.Health.Status}} demo-service1-1)
    echo "Service status = $status"
    sleep 5
done

echo "Service started ..."