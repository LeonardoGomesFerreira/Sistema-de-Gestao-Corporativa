
<div align="center">

# Sistema de Gestão Corporativa

### Gerenciamento de funcionários com Java

Projeto acadêmico desenvolvido para praticar Programação Orientada a Objetos,
aplicando conceitos fundamentais de Java em um sistema de console.

![Java](https://img.shields.io/badge/Java-ED8B00?style=for-the-badge&logo=openjdk&logoColor=white)
![POO](https://img.shields.io/badge/POO-Orientação%20a%20Objetos-2563EB?style=for-the-badge)
![Status](https://img.shields.io/badge/Status-Em%20desenvolvimento-yellow?style=for-the-badge)

</div>

---

## Sobre o projeto

O Sistema de Gestão Corporativa é uma aplicação de console
desenvolvida em Java para exercitar conceitos de orientação a objetos
por meio de um sistema de gerenciamento de funcionários.

## Funcionalidades

- Cadastro de desenvolvedores, gerentes e estagiários.
- Cálculo de bônus salariais.
- Cálculo de imposto para gerentes.
- Listagem dos funcionários cadastrados.
- Contagem de funcionários.
- Validação de dados.
- Tratamento de entradas inválidas.

## Tecnologias e conceitos

- Java
- Programação Orientada a Objetos
- Herança e abstração
- Polimorfismo e sobrescrita de métodos
- Interfaces
- Atributos e métodos `static`
- Constantes com `final`
- `ArrayList`
- Tratamento de exceções
- Estruturas de decisão e repetição

## Estrutura do projeto

```text
Sistema-de-Gestao-Corporativa/
├── src/
│   ├── Main.java
│   ├── Funcionario.java
│   ├── Desenvolvedor.java
│   ├── Gerente.java
│   ├── Estagiario.java
│   ├── Tributavel.java
│   ├── Empresa.java
│   ├── ValidacaoUtil.java
│   └── SalarioInvalidoException.java
├── .gitignore
└── README.md
```

## Regras de negócio

| Funcionário | Bônus |
|---|---:|
| Desenvolvedor | 10% do salário |
| Gerente | 15% do salário |
| Estagiário | 5% do salário |

O imposto do gerente corresponde a 5% do salário, conforme definido
para este projeto acadêmico.

## Como executar

### Pré-requisitos

- JDK instalado.
- Terminal ou IDE compatível com Java.

### Pelo terminal

Na pasta raiz do projeto, compile os arquivos:

```bash
javac src/*.java
```

Execute a aplicação:

```bash
java -cp src Main
```

No PowerShell do Windows, esses comandos também funcionam
com os caminhos separados por `/`.

## Observações

Os dados ficam armazenados em memória durante a execução.
O sistema não utiliza banco de dados.

## Autor

**Leonardo Gomes Ferreira**

Projeto desenvolvido para fins de estudo e aprimoramento
das habilidades em Java.

---

<div align="center">

Desenvolvido com Java para aprender, praticar e evoluir.

</div>
