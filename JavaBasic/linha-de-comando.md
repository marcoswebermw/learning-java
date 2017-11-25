## Usando Java na linha de comando
  
### Compilando um arquivo via linha de comando

`javac arquivo.java`  
  
Será gerado o bytecode `arquivo.class`.  
  
Para compilar usando determinada versão do compilador use o `source`.  
  
`javac arquivo.java -source 1.9`

### Executando arquivo
  
`java arquivo`  
  
### Recebendo parâmetros
  
> ImprimirNome.java

```java
package impressao;

public class ImprimirNome{
    public static void main(String... args){
        String nome = args[0];
        System.out.println("Olá " + nome);
    }
}
```
  
`javac impressao/ImprimirNome.java`
  
`java impressao.ImprimirNome Marcos`
  
