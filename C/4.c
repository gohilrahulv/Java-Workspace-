#include <stdio.h>

int main() {
    double width, length,area;

    // Prompt the user to enter the base and height of the triangle
    printf("Enter the width of the Rectangle: ");
    scanf("%lf", &width);

    printf("Enter the length of the Rectangle: ");
    scanf("%lf", &length);

    // Calculate the area of the triangle
    area = width * length;  // Using 0.5 instead of (1/2)

    // Display the area
    printf("Area of the Rectangle: %lf\n", area);

    return 0;
}
