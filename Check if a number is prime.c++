#include <iostream>

int main() {
    int num, i;
    bool isPrime = true;

    std::cout << "Enter a positive integer: ";
    std::cin >> num;

    if (num < 2)
        isPrime = false;
    else {
        for (i = 2; i * i <= num; ++i) {
            if (num % i == 0) {
                isPrime = false;
                break;
            }
        }
    }

    if (isPrime)
        std::cout << num << " is a prime number." << std::endl;
    else
        std::cout << num << " is not a prime number." << std::endl;

    return 0;
}
