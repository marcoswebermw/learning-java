## Mais sobre linha de comando
  
### Propriedades pela linha de comando
  
Também é possível passar propriedades para a JVM. Use o `-D` para tal. 
Veja o exemplo:   
  
`java -Djava.ext.dirs=$JAVA_HOME/jre/lib/ext`  
  
### Achando classes com o -classpath ou -cp
  
O classpath indica onde se encontram as bibliotecas, jars ou zips que contenham nossas classes.  

`javac -cp /caminho/para/biblioteca.jar App.java`  
  
`java -cp /caminho/para/biblioteca.jar App`  
  
Passando vários arquivos de uma vez no Windows(;):  
  
`javac -cp /caminho/para/biblioteca.jar;/caminho/para/arquivo.zip App.java`  
`java -cp /caminho/para/biblioteca.jar;/caminho/para/arquivo.zip App`  
  
Passando vários arquivos de uma vez no Linux(:):  
  
`javac -cp /caminho/para/biblioteca.jar:/caminho/para/arquivo.zip App.java`  
`java -cp /caminho/para/biblioteca.jar:/caminho/para/arquivo.zip App`    
  