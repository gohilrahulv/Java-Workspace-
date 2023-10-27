#include <stdio.h>

int main() {
    double side_a, side_b, side_c, perimeter;

    // Prompt the user to enter the lengths of the three sides of the triangle
    printf("Enter the length of side a: ");
    scanf("%lf", &side_a);

    printf("Enter the length of side b: ");
    scanf("%lf", &side_b);

    printf("Enter the length of side c: ");
    scanf("%lf", &side_c);

    // Calculate the perimeter (circumference) of the triangle
    perimeter = side_a + side_b + side_c;

    // Display the perimeter
    printf("Perimeter (Circumference) of the Triangle: %lf\n", perimeter);

    return 0;
}
