#include <iostream>
#include <fstream>
#include <sstream>
#include <string>
#include <vector>

int main()
{
    std::string fileName;
    std::cout << "Enter file name: ";
    std::cin >> fileName;

    std::ifstream inFile(fileName);
    std::string line, word;
    std::vector<std::string> words;

    if (inFile.is_open())
    {
        while (std::getline(inFile, line))
        {
            std::istringstream iss(line);
            while (iss >> word)
                words.push_back(word);
        }
    }

    for (const auto& w : words)
        std::cout << w << " ";
    std::cout << std::endl;

    return 0;
}