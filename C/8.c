#include<stdio.h>

int main()
{
    double side,circumference;

    printf("Enter The Side Of Square : ");
    scanf("%lf",&side);

    circumference = 4*side;

    printf("circumference Of Square is: %lf",circumference);
}