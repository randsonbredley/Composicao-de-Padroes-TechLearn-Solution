# Atividade – Padrões de Projeto

## 1. Descrição do Projeto

Este projeto consiste na implementação de um sistema de catálogo de cursos para a plataforma TechLearn, desenvolvido em Java, com o objetivo de aplicar conceitos de Programação Orientada a Objetos e padrões de projeto.

O sistema permite organizar conteúdos educacionais em uma estrutura hierárquica, composta por módulos e aulas, além de percorrer os componentes do catálogo e filtrar aulas conforme sua duração.

## 2. Objetivos

- Aplicar o padrão de projeto **Composite** para organizar aulas e módulos em uma estrutura hierárquica.
- Aplicar o padrão de projeto **Iterator** para percorrer os componentes de um módulo.
- Utilizar abstração, herança e polimorfismo para estruturar o código.
- Organizar as responsabilidades das classes, facilitando a manutenção e a evolução do sistema.
- Implementar a filtragem de aulas com duração de até 45 minutos.

## 3. Tecnologias Utilizadas

- **Linguagem:** Java
- **Paradigma:** Programação Orientada a Objetos
- **Padrões de projeto:** Composite e Iterator
- **IDE:** ambiente de desenvolvimento Java utilizado na atividade

## 4. Estrutura do Projeto

```text
src/
└── techlearn/
    ├── Main.java
    ├── FiltroConteudo.java
    ├── composite/
    │   ├── ComponenteCatalogo.java
    │   ├── Aula.java
    │   └── Modulo.java
    ├── iterator/
    │   ├── Iterator.java
    │   ├── ModuloIterator.java
    │   └── NullIterator.java
    └── logging/
        └── LoggerService.java
```

## 5. Padrões de Projeto Implementados

### 5.1. Composite

O padrão Composite permite tratar objetos individuais e agrupamentos de objetos de maneira uniforme.

Neste projeto, a classe `ComponenteCatalogo` representa a abstração comum dos elementos do catálogo. A classe `Aula` representa os conteúdos individuais, enquanto `Modulo` agrupa outros componentes, como aulas e outros módulos.

Essa organização permite construir uma hierarquia de conteúdos educacionais.

### 5.2. Iterator

O padrão Iterator permite percorrer uma coleção de elementos sem expor diretamente sua estrutura interna.

No projeto, a interface `Iterator` define as operações necessárias para percorrer os componentes. A classe `ModuloIterator` implementa a navegação pelos elementos de um módulo, enquanto `NullIterator` representa um iterador sem elementos a percorrer.

## 6. Funcionalidades

O sistema contempla as seguintes funcionalidades:

- Criação de aulas com nome e duração.
- Organização das aulas em módulos.
- Organização hierárquica dos conteúdos do catálogo.
- Exibição dos detalhes dos componentes.
- Percurso dos componentes por meio do padrão Iterator.
- Filtragem de aulas com duração igual ou inferior a 45 minutos.
- Registro de mensagens de execução por meio do serviço de logging.

## 7. Filtragem de Aulas

A funcionalidade de filtragem tem como objetivo identificar e exibir somente as aulas cuja duração seja menor ou igual a 45 minutos.

A implementação utiliza polimorfismo para delegar o comportamento de filtragem aos próprios componentes do catálogo, evitando a necessidade de verificar explicitamente o tipo de cada objeto com `instanceof`.

## 8. Conclusão

A atividade demonstra como os padrões Composite e Iterator podem ser utilizados em conjunto para organizar e percorrer estruturas hierárquicas de conteúdo.

O Composite facilita a representação de aulas e módulos em uma mesma estrutura, enquanto o Iterator permite percorrer seus elementos de maneira organizada. A separação dessas responsabilidades contribui para um código mais modular, legível e fácil de manter.

## 9. Resposta à Pergunta da Atividade

Como a separação entre os padrões Composite e Iterator ajuda na manutenção e na flexibilidade do sistema?

A separação entre os padrões Composite e Iterator facilita a manutenção e aumenta a flexibilidade do sistema porque cada padrão possui uma responsabilidade específica.

O padrão Composite é responsável por organizar os componentes do catálogo em uma estrutura hierárquica, permitindo que aulas e módulos sejam tratados de maneira uniforme. Já o padrão Iterator é responsável por percorrer os elementos dessa estrutura sem expor diretamente a organização interna das coleções.

Dessa forma, alterações na maneira como os conteúdos são organizados podem ser realizadas sem exigir mudanças significativas na lógica de navegação. Da mesma forma, modificações na forma de percorrer os componentes podem ser implementadas sem alterar a estrutura hierárquica do catálogo.

Essa separação de responsabilidades reduz o acoplamento entre as classes, facilita a reutilização do código e torna o sistema mais simples de manter, testar e expandir.
