## Dicas de Java
  
* Podem existir vários construtores em uma classe;  
* Um construtor se diferencia de um método pois o construtor tem o mesmo nome da 
classe e não tem retorno. Porém o construtor pode ter um `return;` vazio;  
* A assinatura de um método é formada apenas pelo `nome` do método e os `tipos` dos parâmetros;  
* Podem existir métodos com o mesmo nome da classe e não são construtores;  
* Se uma classe está no pacote padrão, ela só poderá ser usada dentro dele e jamais importada por outros pacotes.  
* O `*` só importa as classes do pacote. Para importar subpacotes temos que referenciar os subpacotes em outras linhas.  
* Use o `import static` para importar todos os métodos e atributos estáticos de uma classe. `import static pacote.*`.  
  
  
### Várias classes ou interfaces em um mesmo arquivo
  
* Não existe ordem para declará-las;  
* Só pode existir uma classe ou interface pública;  
* O arquivo deve conter o nome da classe ou interface pública;  
* Qualquer nome pode ser dado ao arquivo caso não haja classe ou interface pública;  

