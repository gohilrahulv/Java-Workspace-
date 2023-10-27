#include<stdio.h>


int main() {
    int asciiCode;
    
    // Prompt the user to enter an ASCII code
    printf("Enter an ASCII code: ");
    scanf("%d", &asciiCode);
    
    // Convert the ASCII code to a character
    char characterValue = (char)asciiCode;
    
    // Display the character value
    printf("Character: %c\n", characterValue);
    
    return 0;
}
