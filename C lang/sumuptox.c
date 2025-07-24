#include<stdio.h>
int main(){
    int a=0,sum;
    char c;
    
    while(a!=120){
        printf("Enter number for sum:\n");
        scanf("%c",&c);
        a=(int)c;
        sum+=a;
    }
    printf("The Sum is=%d",sum);
    

}