package questions;

public class Question04 {

	fórmula de distância, velocidade e tempo: d = v*t
	distância entre Ribeirão Preto e Franca é de 100 km
	carro está indo em direção a Franca e o caminhão está indo em direção a Ribeirão Preto. 
	Seja x a distância percorrida pelo carro até o ponto de cruzamento e 
	y a distância percorrida pelo caminhão.
	Para o carro, temos: t1 = x / 110. Já para o caminhão, o tempo é t2 = (y + 10) / 80, 
	pois ele leva 5 minutos a mais para passar em cada pedágio.
	A soma das distâncias percorridas deve ser igual à distância total de 100 km: x + y = 100.
	Podemos isolar y na equação acima e substituir em t2:

		y = 100 - x
		t2 = (100 - x + 10) / 80 = (110 - x) / 80

		Agora podemos igualar os tempos t1 e t2:

		t1 = t2
		x / 110 = (110 - x) / 80
		80x = 110(110 - x)
		80x = 12100 - 110x
		190x = 12100
		x = 63.68 km
		Portanto, o carro percorreu 63.68 km até o ponto de cruzamento, 
		e o caminhão percorreu 36.32 km. Como o ponto de cruzamento 
		está mais próximo de Ribeirão Preto do que de Franca, podemos concluir 
		que o carro está mais próximo de Ribeirão Preto no momento do cruzamento.
}
