# Sistema de Gerenciamento de Hackathons Universitários

> **Atividade desenvolvida para a disciplina de Programação Modular, ministrada pelo professor Daniel Kansaon, do curso de Engenharia de Software. Projeto realizado pelos alunos Pedro Henrique Santos Vieira e Italo Vinhas Antunes Silva.**

## Introdução

Este projeto é uma implementação em Java para gerenciar **Projetos** e **Equipes** participantes de Hackathons Universitários, conforme proposto no exercício da disciplina de Programação Modular. O sistema foi desenvolvido a partir de um diagrama UML fornecido e segue rigorosamente os requisitos do enunciado, incluindo a modelagem de entidades como Instituição, Pessoa, Equipe, Projeto, Banca, Jurado, Sala e Apresentação.

O objetivo principal é permitir o cadastro e gerenciamento de equipes (cada uma com 5 alunos), a associação de projetos a essas equipes, a criação de bancas avaliadoras compostas por jurados, o cálculo da nota final dos projetos (com base na média das notas dos jurados) e a listagem dos projetos aprovados (nota final ≥ 7,0), tudo isso utilizando coleções Singleton para garantir integridade e unicidade dos dados em memória.

O projeto não utiliza banco de dados: **todos os dados são mantidos em memória**, facilitando o entendimento da lógica de negócio e o uso de coleções Java.

---

## Como funciona

- **Equipes**: Cada equipe possui 5 estudantes e pode ser criada facilmente pelo construtor e método de adição.
- **Projetos**: Cada equipe possui um projeto, que é avaliado por uma banca de 4 jurados.
- **Bancas**: Cada banca recebe as notas dos jurados e calcula a média, que é atribuída ao projeto.
- **Coleções Singleton**: As classes `Equipes` e `Apresentacoes` garantem que todas as equipes e apresentações sejam gerenciadas de forma centralizada e única durante a execução do sistema.
- **Listagem de aprovados**: Utilizando Java Streams, o sistema exibe todos os projetos com nota final igual ou superior a 7,0.

---

## Exemplo de uso no `main`

```java
public static void main(String[] args) {
    // 1️⃣ Criar 2 equipes com 5 alunos cada
    Equipe equipeA = new Equipe("Equipe Alfa");
    equipeA.adicionarAlunos("Ana", "Bruno", "Carla", "Diego", "Eduardo");

    Equipe equipeB = new Equipe("Equipe Beta");
    equipeB.adicionarAlunos("Fabiana", "Gustavo", "Helena", "Igor", "Joana");

    // 2️⃣ Criar um projeto para cada equipe
    Projeto projA = new Projeto("App Saúde", equipeA);
    Projeto projB = new Projeto("Plataforma Verde", equipeB);

    // 3️⃣ Criar banca avaliadora (4 jurados) para cada projeto
    projA.definirBanca("Jur1", "Jur2", "Jur3", "Jur4");
    projB.definirBanca("Jur5", "Jur6", "Jur7", "Jur8");

    // 4️⃣ Registrar notas e calcular média
    projA.registrarNotas(8.5, 7.0, 9.0, 8.0);
    projB.registrarNotas(6.0, 6.5, 7.0, 6.5);

    // 5️⃣ Listar projetos aprovados (nota ≥ 7.0)
    Projetos.streamAprovados(7.0).forEach(System.out::println);
}
```

---

## Estrutura de classes

O projeto segue o diagrama UML proposto, com as seguintes entidades principais:

- **Instituição** (Universidade, Empresa)
- **Pessoa** (Estudante, Profissional, Jurado, Orientador)
- **Equipe**
- **Projeto**
- **Banca** (implementa Avaliavel)
- **Sala**
- **Apresentação**
- **Coleções Singleton**: `Equipes`, `Apresentacoes`

---

## Observações

- O sistema é totalmente orientado a objetos e utiliza boas práticas de encapsulamento e organização.
- O cálculo da nota final do projeto é feito automaticamente após a avaliação da apresentação.
- O código está pronto para ser executado em qualquer ambiente Java, sem dependências externas.

---

## Como executar

1. Importe o projeto em sua IDE Java (ex: VS Code, Eclipse, IntelliJ).
2. Compile e execute a classe `Main`.
3. Confira no console a listagem dos projetos aprovados e o fluxo completo do gerenciamento do Hackathon.

---

## Entrega

- **Projeto Java completo** (código-fonte)
- **Arquivo PDF** com o diagrama UML final

---

Este projeto é uma base sólida para sistemas de gerenciamento de eventos acadêmicos e pode ser expandido para incluir novas funcionalidades conforme a necessidade.

