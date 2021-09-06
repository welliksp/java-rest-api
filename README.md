# java-rest-api
 Java Rest-API

 Esta API tem como finalidade a insercao e consulta de dados.

 #1 - Docker 
 Para o banco de dados estaremos utilizando MongoDB.

Com o docker já instalado, executar no terminal o comando abaixo para realizar o download do mirror.
docker pull mongo

Após a conclusao do download executar o comando abaixo para rodar o container do mongo db

docker run --name mongodb -p 27017:27017 -e MONGO_INITDB_ROOT_USERNAME=balta -e MONGO_INITDB_ROOT_PASSWORD=e296cd9f mongo

#2 - End-Point

CURL para insersao dos dados:

curl --location --request POST 'localhost:8080/create' \
--header 'Content-Type: application/json' \
--data-raw '{
    "status": "ACTIVE",
    "givenName": "Wellik",
    "familiyName": "Perroni",
    "birthDate": "15-11-1995",
    "address": {
        "type": "PHYSICAL",
        "zipcode": 55,
        "state": "PR",
        "city": "Curitiba",
        "street": "Rua Joao Bosco",
        "number": 76,
        "complement": "Em frente ao Atacadao",
        "district": ""
    },
    "phones": {
        "phone1": "5541998870987"
    }
}'


CURL para a consulta de dados:

curl --location --request GET 'localhost:8080/client'

  