def multiplica_numeros(n):

    multi = 1

    for i in range (1, n + 1):
         multi *= i
        

    return multi


n = int(input("Digite um numero: "))
print(f"multiplicação de 1 até {n}: ", multiplica_numeros(n))