#include <stdio.h>

int main() {
    double length, width, circumference;

    // Prompt the user to enter the length and width of the rectangle
    printf("Enter the length of the rectangle: ");
    scanf("%lf", &length);

    printf("Enter the width of the rectangle: ");
    scanf("%lf", &width);

    // Calculate the circumference (perimeter) of the rectangle
    circumference = 2 * (length + width);

    // Display the circumference
    printf("Circumference of the Rectangle: %lf\n", circumference);

    return 0;
}
