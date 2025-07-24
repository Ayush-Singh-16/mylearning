#include<stdio.h>
int main(){
    int num,b;
    int n;
    printf("Enter divident:\n");
    scanf("%d",&num);
    printf("Enter the limit:\n");
    scanf("%d",&n);
    for(b=1;b<=n;b++)
    {
        printf("\n%d x %d = %d",num,b,num*b);
       
    }
    return 0;
}