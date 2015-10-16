# things
Pequena framework para criação de tudo. (Yep, tudo mesmo)


Este projeto foi inspirado pelo app Nested por Orteil (https://twitter.com/Orteil42)

É possivel criar coisas (literalmente) usando essa linguagem definida especificamente para o projeto.

```
[THING]
@testthing{
	is{
		[ID|testthing]
		[Seed|#seed]
		[Nome|TestThing]
		[Peso|50 Kg]
		[Descricao|Uma coisa feita de coisas para testar coisas dentro de coisas]
	}
	has{
		[testthing|100|1..100]
	}
}
```

No exemplo a cima, podemos ver uma coisa com ID "testthing" o mesmo é usado na declaração da "coisa". O nome desta coisa é "TestThing".
Ela pesa 50 Kg, tem uma descrição, e, é fita de mais "testthing"s, mas precisamente de um número arbitrário de "testthing"s, entre 1 e 100.

Segue uma melhor explicação do código:


```
[THING] 
```
Não mude isso!
```
@testthing{
```
isto deve ser igual ao ID, e ao nome do arquivo .thing

```
	is{
```
Aqui definimos o que a coisa é.

```
		[ID|testthing]
		[Seed|#seed]
		[Nome|TestThing]
		[Peso|50 Kg]
		[Descricao|Uma coisa feita de coisas para testar coisas dentro de coisas]
```
Aqui definimos do que a coisa é feita

```
	}
	has{
```
    [ID da coisa|Probabilidade de ocorrência|Quantidade uma vez que exista]
		[testthing|100|1..100]
	}
}
```
