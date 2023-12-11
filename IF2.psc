Algoritmo BONIFICACION_POR_VENTAS
	Definir BONIFICACION, Ventas Como Entero
	Escribir 'ingresar valor de ventas'
	Leer Ventas
	Si Ventas>25000000 Entonces
		Escribir 'Bonificación del 10%'
		BONIFICACION <- (Ventas*10)/100
		Escribir 'Su bonificación es', BONIFICACION
	SiNo
		Escribir 'sin bonificación'
	FinSi
FinAlgoritmo
