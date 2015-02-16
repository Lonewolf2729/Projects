#include <iostream>
using namespace std;
int main(){
int watt, kilo;
float time, kilowatt, newk, neww, input;
double price, bill;
 cout << "Watt:";
 cin >> watt;
 cout << "Kilo watt:" << "1\n";
 cout << "Time in hours:";
 cin >> time;
 cout << "any other numbers: ";
 cin >> input;
if(input == 0){
    kilowatt = (watt*1*time);
    newk = kilowatt/1000;
    cout << newk<<" kWh\n";
    cout << "How much do u pay per kWh:";
    cin >> price;
    bill = newk*price;
    cout << "you pay: " << "$" << bill << " in total";

}
else{
    kilowatt = watt*1*time*input;
    neww = kilowatt/1000;
    cout << neww << "\n";
    cout << "How much do u pay per kWh:";
    cin >> price;
    bill = neww*price;
    cout << "you pay: " << "$" << bill << " in total";
    cout<<"\n"<<"Press any key to continue";
    cin.get();
    cin.clear();
}
}
