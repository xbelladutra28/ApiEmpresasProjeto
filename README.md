# ApiEmpresasProjeto

### Estes documento README tem como objetivo indicar informações sobre a API criada.

## Como foi feita? 

#### A API foi criada utilizando-se JAVA 8 com o framawork Spring Boot. Utilizei banco de dados PostgreSQL. Fiz uma tratativa alternativa para o acesso de dados caso não consigam acessar, utilizei um arquivo properties de teste para gerar uma carga no banco quando subir a aplicação com spring.profiles.active=true ( que se encontra no arquivo application.properties). No arquivo DBService se encontra uma instanciação das entidades.

#### A API possui validação oAuth2. Ao utilizar os dados abaixo na requisição /oauth/token é gerado um Bearer Token (access_token)  que será utilizado nas outras requisições para ter acesso as respostas. Utilizei o Basic Auth.

# Dados 

#### Url Local : http://localhost:8080
#### Basic Auth :  username : empresasApi , senha : 123
#### Versão da API: v1







