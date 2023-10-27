#include <stdio.h>

int main() {
    double sideLength, surfaceArea;

    // Prompt the user to enter the side length
    printf("Enter the length of the cube's side: ");
    scanf("%lf", &sideLength);

    // Calculate the surface area of the cube
    surfaceArea = 6.0 * sideLength * sideLength;

    // Display the surface area
    printf("Surface Area of the Cube: %lf\n", surfaceArea);

    return 0;
}
