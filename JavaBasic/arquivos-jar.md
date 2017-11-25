## Usando arquivos JAR
  
Arquivos jar são arquivos 'zipados' com extensão '.jar' que contém o diretório 
da nossa aplicação/biblioteca com seus arquivos.  
  
### Criando arquivos JAR
  
`jar -cf app.jar meu_diretorio`  
  
### Executando arquivos JAR
  
`java -cp app.jar meu_diretorio.Aplicacao`  
  
### Arquivo de manifesto
  
É possível indicar qual é a classe principal dentro do arquivo '.jar'. 
Para isso é necessário ter um diretório de configurações do jar chamado 'META-INF'. 
Dentro dele é preciso criar um arquivo chamado 'manifesto.mf' com o seguinte conteúdo: 
  
`Main-Class: meu_diretorio.Aplicacao`  
  
Depois é só gerar o jar:  
  
`jar -cfm app.jar manifesto.mf meu_diretorio`
  

