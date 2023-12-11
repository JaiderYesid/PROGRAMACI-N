Algoritmo NUMEROS_PRIMOS
	Definir limite, n, i Como Entero
	Definir esPrimo Como Lógico
	Escribir 'Ingrese un valor menor que 100:'
	Leer limite
	Escribir 'Números primos menores a ', limite, ':'
	Si limite>100 Entonces
		Escribir 'Supero el limite intentelo de nuevo'
	SiNo
		Si limite<2 Entonces
			Escribir 'No hay numeros para mostar intentelo de nuevo'
		FinSi
		Mientras n<limite Hacer
			esPrimo <- Verdadero
			i <- 2
			Mientras i<=Raiz(n) Y esPrimo Hacer
				Si n MOD i=0 Entonces
					esPrimo <- Falso
				FinSi
				i <- i+1
			FinMientras
			Si esPrimo Entonces
				numerosPrimos <- numerosPrimos+' '+ConvertirATexto(n)
			FinSi
			n <- n+1
		FinMientras
	FinSi
	n <- 2
	Escribir numerosPrimos
FinAlgoritmo
