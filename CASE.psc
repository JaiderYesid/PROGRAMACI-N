Algoritmo sin_titulo
	Escribir 'Digite la opcion decametros, kilometros, decimetros o centimetros'
	Leer opc
	Segun opc Hacer
		"decametros":
			Definir metros, decametros como real
			Escribir 'Digite la medida en metros'
			Leer metros
			decametros <- metros/10
			Escribir 'Los decametros en total son ', decametros
		"kilometros":
			Definir metros, kilometros como real
			Escribir 'Digite la medida en metros'
			Leer metros
			kilometros <- metros/1000
			Escribir 'Los kilometros en total son ', kilometros
		"decimetros":
			Definir metros, decimetros como real
			Escribir 'Digite la medida en metros'
			Leer metros
			decimetros <- metros*10
			Escribir 'Los decimetros en total son ', decimetros
		"centimetros":
			Definir metros, centimetros como real
			Escribir 'Digite la medida en metros'
			Leer metros
			centimetros <- metros*100
			Escribir 'Los centimetros en total son ', centimetros
		De Otro Modo:
			Escribir 'opcion invalida'
	FinSegun
FinAlgoritmo
