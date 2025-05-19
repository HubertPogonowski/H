#include <iostream>
#include <string>

int main() {
    std::string imie;

    std::cout << "Jak masz na imie? ";
    std::getline(std::cin, imie);

    std::cout << "Czekaj, " << imie << "!" << std::endl;
    std::cout << "Twoje imie ma " << imie.length() << " znakow." << std::endl;

    return 0;
}
