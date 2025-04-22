#include <stdio.h>

int main() {
    int n, i = 1, soma = 0;

    printf("Digite um numero: ");
    scanf("%d", &n);

inicio:
    if (i <= n) {
        soma = soma + i;
        i = i + 1;
        goto inicio;
    }

    printf("Soma de 1 ate %d: %d\n", n, soma);

    return 0;
}
