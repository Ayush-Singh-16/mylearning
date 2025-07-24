#include<stdio.h>
int main(){
    int a,sum=0;
    char c[10];
    
    while(1){
        printf("Enter number for sum (X to End):\n");
        scanf("%s",&c);
        if(c[0]=='x'||c[0]=='X'){
            break;
            }
        sscanf(c,"%d",&a);
        sum+=a;
    }
    printf("The Sum is=%d",sum);
    return 0;

}