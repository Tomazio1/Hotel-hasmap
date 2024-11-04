# Sistema de Reservas de Hotel

## Sobre o Projeto

Este projeto é um programa de realizar reservas em um sistema de hotel, armazenando os dados dos hóspedes em um HashMap, além de permitir a recuperação e manipulação dos dados dos hóspedes. O sistema também possibilita a realização do checkout.

## Tecnologias/Ferramentas Utilizadas

- **Java**
- **IntelliJ**
- **Biblioteca java.util.HashMap**

## Funcionamento da hashmap:

A função recebe o número da reserva, depois disso, o valor da reserva é divido por 3, o resultado da divisão é somado com 10, depois, o resultado da soma é dividido por 9, do resultado da divisão, é feito o módulo por cem, e o resultado passa pela função abs, para que se o valor obtido seja negativo vire positivo obtendo o valor absoluto do número, após isso, o valor é passado para a variavel chave e é retornado.
