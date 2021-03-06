#include <iostream>
#include <vector>
#include <algorithm>
using namespace std;

void swapRecursion(vector<int>& arr, int i, int j)
{
    if (i >= j) return;
    swap(arr[i], arr[j]);
    swapRecursion(arr, i + 1, j - 1);
}


int main()
{
    vector<int> arr;
    int size;
    cin >> size;
    for (int i = 0; i < size; i++)
    {
        int tmp;
        cin >> tmp;
        arr.push_back(tmp);
    }
    
    cout << "Original array: " << endl;
    for (int i = 0; i < size; i++)
    {
        cout << arr[i] << " ";
    }
    cout << endl;

    int begin, end;
    cout << "Enter begin and end index: ";
    cin >> begin >> end;

    swapRecursion(arr, begin, end);
    cout << "Swapped array: " << endl;
    for (int i = 0; i < size; i++)
    {
        cout << arr[i] << " ";
    }
    return 0;
}
