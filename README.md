Calculadora de Média Ponderada (AC1, AC2, AC3, AF)

Este projeto calcula a média ponderada de um aluno com base em quatro avaliações, cada uma com um peso específico, e determina se ele foi **Aprovado (média ≥ 6)** ou **Reprovado**.  

Funcionalidades 
Calcula a média ponderada com pesos pré-definidos:  
AC1 (15%)
AC2 (30%)  
AC3 (10%)  
AF (45%)**  

 Exibe a situação do aluno (**Aprovado/Reprovado**)  
 Mostra a contribuição individual de cada nota na média final  

Como Executar

Pré-requisitos 
- Java JDK instalado (versão 8 ou superior)  

Passos
1. Clone o repositório ou copie o código.  
2. Compile o programa:  
   ```bash
   javac ProvaMedia.java
   ```
3. Execute:  
   ```bash
   java ProvaMedia
   ```
4. Insira as notas conforme solicitado.  

Exemplo de Saída
```
Calcule a sua média  
Digite a nota da AC1: 7.0  
Digite a nota da AC2: 8.0  
Digite a nota da AC3: 5.0  
Digite a nota da AF: 6.0  

Sua média é: 6.45  
Aprovado!  
AC1: 1.05  
AC2: 2.4  
AC3: 0.5  
AF: 2.7  
```

Personalização
Você pode alterar os pesos modificando os valores no código:  
```java
double prova1 = scanner.nextDouble() * 0.15; // Altere o peso (0.15 = 15%)
```


Sugestões e melhorias são bem-vindas! Sinta-se à vontade para abrir issues ou enviar pull requests 

