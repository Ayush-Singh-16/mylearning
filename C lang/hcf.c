#include<stdio.h>
int main(){
    int num1,num2,a=1,b=1;
    printf("Enter two numbers:\n");
    scanf("%d%d",&num1,&num2);
    while(a<=num1&&a<=num2){
        if(num1%a==0&&num2%a==0){
            b=a;
            a=a+1;
        }
        else{
            a=a+1;
        }
    }
    printf("HCF of %d,%d is=%d",num1,num2,b);
    return 0;
}