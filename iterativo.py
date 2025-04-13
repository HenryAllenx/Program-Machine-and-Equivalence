def soma_numeros(n):

    soma = 0

    for i in range(1, n+1):
        soma += i
    
    return soma

n = int(input("Digite um numero: "))
print(f"Soma de 1 até {n}: ", soma_numeros(n))