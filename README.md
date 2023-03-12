# Projeto Individual Módulo 4 - Todas Mídia em Todo Lugar ao Mesmo Tempo.

## Contexto
Para desenvolver esse projeto deveriamos modelar a biblioteca digital de mídias dos usuários de um serviço de streaming, que disponibiliza músicas, filmes, séries, e demais mídias. Sendo assim, precisariamos Criar as classes e objetos que representam as mídias do serviço de streaming, bem como as bibliotecas dos usuários.


## Modelagem
Classes   | Métodos     | Herda de:        |
:--------:|:-----------:|:----------------:|
Mídia     | Getters e Setters       | Classe Mãe          |
Artista  | Getters e Setters       | Classe Mãe          |
Filme     | Getters e Setters       | Herda de Mídia        |
Música | Getters e Setters       | Herda de Mídia      |
Ator | Getters e Setters       | Herda de Artista      |
Musico | Getters e Setters       | Herda de Artista      |
Biblioteca | Getters, Setters, Tocar Playlist, Adicione Item Midia e Remova Item Midia      | Classe Mãe     |
Playlist | Getters, Setters, Tocar Playlist, Adicione Item Midia e Remova Item Midia      | Classe Mãe     |
   
# Tecnologias Utilizadas

 ![NodeJS](https://img.shields.io/badge/node.js-6DA55F?style=for-the-badge&logo=node.js&logoColor=white)
 ![JavaScript](https://img.shields.io/badge/javascript-%23323330.svg?style=for-the-badge&logo=javascript&logoColor=%23F7DF1E)
 ![image](https://user-images.githubusercontent.com/116887504/218183177-0dd59c6b-3898-41f1-99e1-23e448052ccf.png)
