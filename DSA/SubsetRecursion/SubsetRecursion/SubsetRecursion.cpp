#include <iostream>
#include <vector>

using namespace std;

void findSubset(vector<int> arr, vector< vector<int> > &listOfSubsets, vector<int>& subset, int pos)
{
    for (int i = pos; i < arr.size(); i++)
    {
        subset.push_back(arr[i]);
        listOfSubsets.push_back(subset);

        findSubset(arr, listOfSubsets, subset, i + 1);
        
        subset.pop_back();
    }
} 

int main()
{
    int n;
    cin >> n;
    vector<int> arr;
    for (int i = 1; i <= n; i++)
        arr.push_back(i);

    vector< vector<int> > listOfSubsets;
    vector<int> subset;
    
    listOfSubsets.push_back(subset);
    findSubset(arr, listOfSubsets, subset, 0);

    for (int i = 0; i < listOfSubsets.size(); i++)
    {
        for (int j = 0; j < listOfSubsets[i].size(); j++)
            cout << listOfSubsets[i][j] << " ";

        cout << endl;
    }
    return 0;
}

