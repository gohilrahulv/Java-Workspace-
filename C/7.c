#include <stdio.h>

int main() {
    double length, width, height, surfaceArea;

    // Prompt the user to enter the length, width, and height of the rectangular prism
    printf("Enter the length of the rectangular prism: ");
    scanf("%lf", &length);

    printf("Enter the width of the rectangular prism: ");
    scanf("%lf", &width);

    printf("Enter the height of the rectangular prism: ");
    scanf("%lf", &height);

    // Calculate the surface area of the rectangular prism
    surfaceArea = 2 * (width * length + height * length + height * width);

    // Display the surface area
    printf("Surface Area of the Rectangular Prism: %lf\n", surfaceArea);

    return 0;
}
