# Sistema de Gerenciamento de Hackathons Universitários

## Visão geral
Este projeto implementa a parte responsável por **Projetos** e **Equipes** dentro de um sistema de gerenciamento de Hackathons Universitários.  
A aplicação é inteiramente em **Java** e mantém todos os dados **em memória** (sem persistência em banco), empregando coleções Singleton para garantir uma única instância global de cada repositório.

---

## Entrega

| Item | Detalhes |
|------|----------|
| **Prazo** | <span style="color:red">**23 h 59 min do dia estipulado no Canvas**</span> |
| **Formato** | • Arquivo `.zip` contendo o projeto Java completo<br>• Arquivo `.pdf` com o **UML final** |
| **Atrasos** | Entregas em atraso **não serão aceitas** |

---

## Requisitos funcionais

1. **Gerenciar Equipes**  
   - Cada Equipe possui 5 Alunos.  
   - Criar classe‑coleção `Equipes` (Singleton) para inclusão e busca.

2. **Gerenciar Projetos**  
   - Cada Projeto pertence a uma única Equipe.  
   - Cada Projeto tem uma **Banca Avaliadora** composta por 4 Jurados.  
   - Criar classe‑coleção `Apresentacoes` (Singleton) para inclusão e busca.

3. **Cálculo de nota**  
   - A nota final do Projeto é a **média aritmética** das notas atribuídas pelos jurados.

4. **Listagem**  
   - Exibir, via **Streams**, todos os Projetos com **nota final ≥ 7,0**.

---

## Estrutura de classes (Figura 1)

> ⚠️ Adicione os **atributos** e **métodos** que julgar necessários para cada classe do diagrama.  
> As coleções `Equipes` e `Apresentacoes` **devem** seguir o **padrão Singleton**.

*(Inserir o diagrama UML final no arquivo PDF de entrega.)*

---

## Exemplo mínimo no `main`

> *Não é necessário implementar menu.*

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

