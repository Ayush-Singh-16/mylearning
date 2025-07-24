#include<stdio.h>

int main() {
    int num1, num2;
    printf("Enter two numbwers:\n");
    scanf("%d%d", &num1, &num2);
    int a = num1;
    int b = num2;
    while (num1 != num2) {
        if (num1 > num2) {
            num2 += b;
        } else {
            num1 += a;
        }
    }

    printf("The LCM is = %d", num1);
    return 0;
}