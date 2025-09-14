#include <iostream>
#include <iomanip>   // For formatting output
#include <limits>    // For input validation
using namespace std;

// Constant for minimum insurance percentage
const double MIN_INSURANCE_PERCENT = 0.80;

int main() {
    double replacementCost = 0.0;
    double minInsurance = 0.0;

    cout << "----------------------------------------\n";
    cout << "   Minimum Insurance Calculator\n";
    cout << "----------------------------------------\n";

    // Prompt user to enter replacement cost
    cout << "Enter the replacement cost of the building: $";

    // Input validation to ensure a positive value is entered
    while (!(cin >> replacementCost) || replacementCost <= 0) {
        cout << "Invalid input. Please enter a positive number.\n";
        cin.clear();  // Clear error flag
        cin.ignore(numeric_limits<streamsize>::max(), '\n'); // Discard bad input
        cout << "Enter the replacement cost of the building: $";
    }

    // Calculate minimum insurance
    minInsurance = replacementCost * MIN_INSURANCE_PERCENT;

    // Display results
    cout << fixed << setprecision(2); // Format numbers to 2 decimal places
    cout << "\n----------------------------------------\n";
    cout << "Replacement Cost of Building: $" << replacementCost << endl;
    cout << "Minimum Insurance (80% Rule): $" << minInsurance << endl;
    cout << "----------------------------------------\n";
    cout << "Recommendation: To ensure full coverage in case of loss,\n";
    cout << "insure your property for at least 80% of its replacement value.\n";
    cout << "----------------------------------------\n";

    return 0;
}
