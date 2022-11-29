
#include <iostream>
#include <fstream>
#include <sstream>
#include <string>

int main()
{
    std::ifstream in;
    std::string file_name, line, word;
    int value;

    std::cout << "Enter the file name: ";
    std::cin >> file_name;

    in.open(file_name);

    if (in.is_open())
    {
        while (getline(in, line))
        {
            std::istringstream iss(line);

            while (iss >> word)
            {
                if (std::all_of(word.begin(), word.end(), ::isdigit))
                {
                    value = std::stoi(word);
                    std::cout << value << '\n';
                }
            }
        }
    }

    in.close();

    return 0;
}