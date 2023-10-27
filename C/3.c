#include <stdio.h>

int main() {
    double base, height, area;

    // Prompt the user to enter the base and height of the triangle
    printf("Enter the base of the triangle: ");
    scanf("%lf", &base);

    printf("Enter the height of the triangle: ");
    scanf("%lf", &height);

    // Calculate the area of the triangle
    area = (0.5) * base * height;  // Using 0.5 instead of (1/2)

    // Display the area
    printf("Area of the Triangle: %lf\n", area);

    return 0;
}
