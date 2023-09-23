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

Arrays irregulares, também conhecidos como arrays multidimensionais irregulares ou arrays de arrays, são estruturas de dados que consistem em arrays de diferentes tamanhos aninhados uns dentro dos outros. Diferentemente dos arrays multidimensionais regulares, onde cada dimensão tem o mesmo tamanho, os arrays irregulares permitem que as dimensões tenham tamanhos diferentes. Isso os torna úteis quando você precisa lidar com dados que não se encaixam em uma estrutura regular.

Aqui está uma explicação simples e uma demonstração em Java de como criar e usar arrays irregulares:

Explicação:

Imagine que você deseja armazenar informações sobre alunos em diferentes turmas de uma escola, e cada turma tem um número diferente de alunos. Usar um array irregular seria útil nesse caso, já que o número de alunos em cada turma pode variar.
```
public class ArraysIrregularesDemo {
    public static void main(String[] args) {
        // Declarando um array irregular para representar turmas com diferentes números de alunos
        int[][] turmas = new int[3][]; // 3 turmas, mas o tamanho de cada turma ainda não foi definido
        
        // Inicializando o array com diferentes tamanhos para cada turma
        turmas[0] = new int[] { 85, 92, 78 }; // Primeira turma com 3 alunos
        turmas[1] = new int[] { 67, 88, 72, 95, 90 }; // Segunda turma com 5 alunos
        turmas[2] = new int[] { 77, 80 }; // Terceira turma com 2 alunos
        
        // Acessando e exibindo o número de alunos em cada turma
        for (int i = 0; i < turmas.length; i++) {
            int numeroDeAlunos = turmas[i].length;
            System.out.println("Turma " + (i + 1) + ": " + numeroDeAlunos + " alunos");
        }
    }
}
```
Neste exemplo, criei um array turmas de tamanho 3 para representar três turmas diferentes, mas inicializamos cada turma com um tamanho diferente usando arrays irregulares. Isso nos permite armazenar o número variável de alunos em cada turma. Em seguida, percorremos o array e exibimos o número de alunos em cada turma.
Os arrays irregulares em Java são arrays de arrays, e cada subarray pode ter seu próprio tamanho, permitindo flexibilidade na manipulação de dados com estruturas variáveis.
