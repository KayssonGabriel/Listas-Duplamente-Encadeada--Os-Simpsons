# Lista duplamente encadeada — Os Simpsons

Exercício em Java que demonstra uma lista com referências para o próximo nó e para o nó anterior. A demonstração insere, remove, busca e exibe personagens de *Os Simpsons*, com percursos do primeiro ao último e do último ao primeiro.

## Como executar

Com JDK 17 ou superior, compile os arquivos na raiz do repositório pelo PowerShell.

```powershell
$fontes = Get-ChildItem -Path src -Recurse -Filter '*.java' | ForEach-Object FullName
javac -encoding UTF-8 -d build $fontes
java -cp build listaDupla.ProjetoListaDuplamenteEncadeada
```

O programa imprime cada estado da lista conforme executa a sequência de operações do exercício.

## Arquivos

- [ListaDupla.java](src/listaDupla/ListaDupla.java) mantém as extremidades, conta os elementos e implementa as operações.
- [Celula.java](src/listaDupla/Celula.java) representa um nó com dois vínculos.
- [TheSimpsons.java](src/listaDupla/TheSimpsons.java) representa um personagem.
- [ProjetoListaDuplamenteEncadeada.java](src/listaDupla/ProjetoListaDuplamenteEncadeada.java) contém a demonstração.
