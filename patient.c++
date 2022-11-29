
#include <iostream>
#include <fstream>
#include <string>
#include <vector>
#include <algorithm>

using namespace std;

struct Patient {
   string firstName;
   string lastName;
   int birthYear;
};

bool comparePatients(Patient p1, Patient p2) {
   return p1.birthYear < p2.birthYear;
}

int main() {
   ifstream fin1("patients1.txt");
   ifstream fin2("patients2.txt");
   vector<Patient> patients;
   Patient p;

   // read in the patients from the first file
   while (fin1 >> p.firstName >> p.lastName >> p.birthYear) {
      patients.push_back(p);
   }

   // read in the patients from the second file
   while (fin2 >> p.firstName >> p.lastName >> p.birthYear) {
      patients.push_back(p);
   }

   // sort the patients by birth year
   sort(patients.begin(), patients.end(), comparePatients);

   // output the list of patients
   for (int i = 0; i < patients.size(); i++) {
      cout << patients[i].firstName << " "
           << patients[i].lastName << " "
           << patients[i].birthYear << endl;
   }

   return 0;
}