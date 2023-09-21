# Matriz
 
Matriz Bidimensional (Array 2D):

Uma matriz bidimensional é uma estrutura de dados em forma de tabela com duas dimensões: linhas e colunas. É semelhante a uma planilha, onde você pode armazenar dados em formato de grade.

Exemplo de declaração e inicialização de uma matriz bidimensional em Java:

```
int[][] matriz2D = new int[3][4]; // Declara uma matriz de 3 linhas e 4 colunas
```

Exemplo de acesso a elementos da matriz bidimensional:
```
matriz2D[0][0] = 1; // Define o valor na primeira linha e primeira coluna
int valor = matriz2D[1][2]; // Obtém o valor da segunda linha e terceira coluna
```
Matriz Tridimensional (Array 3D):

Uma matriz tridimensional é uma estrutura de dados com três dimensões: altura, largura e profundidade. Ela é como uma pilha de matrizes bidimensionais.

Exemplo de declaração e inicialização de uma matriz tridimensional em Java:

```
int[][][] matriz3D = new int[2][3][4]; // Declara uma matriz 3D com 2 camadas, 3 linhas e 4 colunas em cada camada
```

Exemplo de acesso a elementos da matriz tridimensional:
```
matriz3D[0][1][2] = 42; // Define o valor na primeira camada, segunda linha e terceira coluna
int valor = matriz3D[1][0][3]; // Obtém o valor na segunda camada, primeira linha e quarta coluna
```
