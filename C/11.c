#include <stdio.h>

int main() {
    int number;

    // Prompt the user to enter a number
    printf("Enter a number: ");
    scanf("%d", &number);

    // Display the character corresponding to the ASCII code
    printf("ASCII Character: %c\n", number);

    return 0;
}
