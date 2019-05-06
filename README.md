# exercicio-multithread
Simulação de um serviço de jantar.

# Problema do Jantar dos Canibais
Uma tribo de canibais selvagens está jantando os missionários capturados. Eles ficam ao redor de um grande caldeirão contendo M porções de ensopado de missionário cozido. Quando um selvagem tem fome, ele se serve no caldeirão, a menos que esteja vazio. Quando o caldeirão estiver vazio, um canibal selvagem precisam acordar o cozinheiro para que ele prepare uma nova porção de ensopado e encha o caldeirão novamente. Se o caldeirão estiver vazio, o selvagem vai dormir após acordar o cozinheiro para esperar  o banquete. Após encher o caldeirão, o cozinheiro acorda os canibais selvagens que estavam esperando o ensopado ficar pronto e volta a dormir.

# Detalhes do Programa
O programa deve conter o processo  "canibal()" e o processo "cozinheiro()" que devem funcionar concorrentemente. Além disso deve usar um buffer compartilhado "caldeirão" de tamanho M=5.
**Canibal()**
Cada canibal deve ter o seguinte comportamento, inicia acordado, vai se servir(), comer() continuamente. O tempo que cada canibal leva para se servir é 1 segundo e o tempo para comer é 3 segundos.
Considere que haja 3 canibais para comer. Se o caldeirão estiver vazio, o canibal acorda o cozinheiro e vai dormir.
**Cozinheiro()**
O cozinheiro apresenta o seguinte comportamento: inicia dormindo, quando é acordado prepara o ensopado e prepara_jantar() e depois volta a dormir. Existe apenas um cozinheiro na tribo. O tempo de preparação do jantar é 5 segundos.

# Restrições

Canibais não podem se servir ao mesmo tempo.
Canibais podem comer ao mesmo tempo.
Canibais não podem se servir se o caldeirão estiver vazio.
Canibais só podem se servir depois que o cozinheiro terminar de preparar o jantar.
Se o caldeirão estiver vazio, os canibais esperam dormindo.
O cozinheiro só pode encher o caldeirão quando ele estiver vazio.

# Tarefa
O programa deve funcionar durante 2 min sem deadlock ou starvation. Indicar durante a execução do programa os eventos: canibais servindo, comendo e dormindo, cozinheiro preparando ou dormindo. Ao final da execução mostrar quantas vezes o cozinheiro precisou encher o caldeirão, quantas vezes cada canibal comeu.
