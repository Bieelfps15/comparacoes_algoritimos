<h1>Comparações de algoritimos</h1>
Comparações de algoritimos, atividade realizada na FATEC.

<h2>Selection Sort, Insertion Sort e Bubble Sort</h2>
Para realizar os testes foi usado 3 valores diferentes para cada algoritmo, os
valores são: 10.000, 100.000 e 1.000.000. Com esses valores foi feito a comparação de
cada um deles, em ordem crescente, decrescente e Random, com o tempo em ms
(milissegundo).

<h4>Valores 10.000</h4>
Nos valores de 10.000, o Insertion Sort mostrou ter uma performance mais rápida nos testes,
enquanto o Bubble Sort teve uma performance bem próximo ao Insertion Sort em crescente,
no decrescente e Random acabou levando muito mais tempo comparado ao Insertion Sort e
Selection Sort.

<h3>Valores 100.000</h3>
Nos valores de 100.000 a ordem das exceções foi praticamente a mesma de 10.000, Insertion
Sort continuo sendo o mais eficaz nos testes.

<h3>Valores 1.000.000</h3>
Nos valores de 1.000.000 o Bubble Sort se mostrou ser mais eficaz em crescente variando na
média de uma diferença de 9 ms com a Insertion Sort, mas já em decrescente e Random o
Insertion Sort se mostrou mais uma vez eficaz, enquanto o Bubble Sort se mostrou ser o
menos eficaz.

###
Conclusão
###
Segundo minhas análises para valores menores e maiores em ordem crescente o Insertion Sort
e o Bubble Sort se saíram melhor. Para ordem decrescente com valor menores e maiores o
Insertion Sort e Selection Sort se saíram melhor, e Random o que se saiu melhor em relação
aos outros foi o Insertion Sort.

###

<h2>Merge Sort, Quick Sort e Arrays.sort()</h2>
Para realizar os testes foi usado 3 valores diferentes para cada algoritmo, os
valores são: 10.000, 100.000 e 1.000.000. Com esses valores foi feito a comparação de
cada um deles, em ordem crescente, decrescente e Random, com o tempo em ms
(milissegundo).

<h3>Valores 10.000</h3>
Nos valores de 10.000, o Arrays.sort se saiu melhor em todos os testes, para a ordem de
crescente e descrente o Marge Sort se saiu melhor do que o Quick Sort, mas no Random o
Quick Sort saiu melhor do que o Marge Sort.

<h3>Valores 100.000</h3>
Nos valores de 100.000, na ordem crescente e descrente o Arrays.sort se saiu melhor, mas já
em Random não se saiu bem. O Quick Sort se saiu melhor em Random seguido do Marge Sort.

<h3>Valores 1.000.000</h3>
Nos valores de 1.000.000, o Arrays.sort voltou a se sair melhor em todas as ordens, em
seguida de Quick Sort e Marge Sort, seguindo essa sequência em todas as ordens.

###

Conclusão
###
Como podemos perceber na análise do gráfico o Arrays.sort teve o melhor desempenho no
teste em ordem crescente, ele se mostrou ser eficaz com números
grande e pequenos, no teste de ordem decrescente o Arrays.sort ainda se mostrou eficaz,
na Random o Arrays.sort só não foi melhor nos valores de 10.000, aonde o Quick Sort se
mostrou melhor.


Especificações das ferramentas utilizadas
###
• Processador: Intel(R) Core(TM) i3-8130U CPU @ 2.20GHz 2.21 GHz
###
• Editor de texto: Geany
