# Exercícios de Orientação a Objetos em Java

Repositório com projetos práticos em Java voltados ao estudo de **Programação Orientada a Objetos (POO)**. Cada pasta é um exercício independente, organizado para uso no **Visual Studio Code** com a extensão [Extension Pack for Java](https://marketplace.visualstudio.com/items?itemName=vscjava.vscode-java-pack).

## Sobre o repositório

Os exemplos cobrem conceitos fundamentais de POO, como encapsulamento, herança, classes abstratas, interfaces e polimorfismo. O código foi desenvolvido como material de estudo e prática, com nomes e cenários inspirados em exercícios comuns de cursos de Java.

## Estrutura

Cada projeto segue o mesmo padrão:

```
<NomeDoProjeto>/
├── .vscode/
│   └── settings.json   # configuração do VS Code
└── src/
    ├── App.java        # ponto de entrada (quando existir)
    └── ...             # demais classes
```

Os arquivos compilados são gerados na pasta `bin/` (padrão do VS Code Java).

## Projetos

| Pasta | Conceitos principais | Descrição |
|-------|----------------------|-----------|
| [Animal](Animal/) | Classe abstrata, herança, polimorfismo | Hierarquia de animais (`Mamiferos`, `Peixe`, `Repitil`, `Ave`) com métodos abstratos (`locomover`, `alimentar`, `emitirSom`) |
| [Atividade](Atividade/) | Entrada de dados, laços | Programa com `Scanner` que coleta altura e sexo de 10 pessoas e exibe estatísticas |
| [Biblioteca](Biblioteca/) | Interface, composição | `Livro` implementa a interface `Publicacao`; associação com `Pessoa` (leitor) |
| [ContaBanco](ContaBanco/) | Encapsulamento, modificadores de acesso | Conta bancária com atributos `public`, `protected` e `private` e operações de abertura, depósito, saque e mensalidade |
| [ControleRemoto](ControleRemoto/) | Interface, implementação | `ControleRemoto` implementa `Controlador` (ligar, volume, play, pausa, etc.) |
| [HerancaPt1](HerancaPt1/) | Herança, construtores | Hierarquia `Pessoa` → `Aluno`, `Professor`, `Funcionario` |
| [LutaEmoji](LutaEmoji/) | Classes, associação, `Random` | Sistema de lutas com `Lutador` e `Luta` (categorias por peso, vitórias, derrotas e empates) |
| [OrientacaoObjeto](OrientacaoObjeto/) | Pacotes, encapsulamento | Uso de pacotes (`Aplicacao`, `Filho`) e modificadores de acesso em atributos |
| [Pessoas](Pessoas/) | Classe abstrata, herança | `Pessoa` abstrata com subclasses `Aluno`, `Professor`, `Tecnico`, `Bolsista` e `Visitante` |

## Pré-requisitos

- [JDK](https://www.oracle.com/java/technologies/downloads/) (Java 8 ou superior)
- [Visual Studio Code](https://code.visualstudio.com/)
- Extensão **Extension Pack for Java** (ou **Language Support for Java**)

## Como executar

1. Clone o repositório:

   ```bash
   git clone https://github.com/WalissonMariano/exercicios-orientacao-objeto-java.git
   ```

2. Abra a pasta do projeto desejado no VS Code (por exemplo, `Animal/`).

3. Abra o arquivo `src/App.java` (ou a classe com método `main`).

4. Execute de uma das formas:
   - Botão **Run** acima do método `main`
   - Atalho `F5` (depuração) ou `Ctrl+F5` (executar sem depurar)
   - Terminal: compile e execute manualmente

   ```bash
   cd Animal
   javac -d bin src/*.java
   java -cp bin App
   ```

> **Dica:** Para trabalhar com todos os exercícios de uma vez, abra a raiz do repositório no VS Code. Cada subpasta será tratada como um projeto Java separado na visão **JAVA PROJECTS**.

## Tecnologias

- Linguagem: **Java**
- IDE recomendada: **Visual Studio Code**
- Gerenciamento de projeto: extensão Java do VS Code (sem Maven/Gradle)

## Observações

- Alguns projetos (`Biblioteca`, `Pessoas`) ainda possuem `App.java` com estrutura inicial — as classes de domínio já estão implementadas para estudo e expansão.
- Os READMEs dentro de cada subpasta são o template padrão gerado pelo VS Code; a documentação principal deste repositório está neste arquivo.

## Licença

Este repositório é destinado a fins educacionais. Consulte o autor do repositório para informações sobre uso e redistribuição.
