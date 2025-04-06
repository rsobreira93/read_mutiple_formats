Usando o padrão delegate para leitura de arquivos com spring batch

Para rodar o arquivo como argumento


````bash
./mvnw spring-boot:run -Dspring-boot.run.arguments="arquivoClientes=file:files/clientes.txt"
```` 

Ler vários aqruivos da mesma extensão: (o nome do argumento esperado mudou de arquivoClientes para arquivosClientes)
````bash
./mvnw spring-boot:run -Dspring-boot.run.arguments="arquivosClientes=file:files/clientes*"
```` 