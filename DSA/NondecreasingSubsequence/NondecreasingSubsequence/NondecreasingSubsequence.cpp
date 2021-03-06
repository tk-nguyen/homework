#include <iostream>
#include <vector>

using namespace std;

int nonDecreasingSubsequence(vector<int> arr, vector<int> & longestSequence)
{
    for (int i = 0; i < arr.size(); i++)
    {
        for (int j = 0; j < i; j++)
        {
            if (arr[j] <= arr[i] && 1 + longestSequence[j] > longestSequence[i])
                longestSequence[i] = 1 + longestSequence[j];
        }
    }

    int longest = 0, index = 0;
    for (int i = 0; i < longestSequence.size(); i++)
    {
        if (longestSequence[i] > longest)
        {
            longest = longestSequence[i];
            index = i;
        }
    }
    return index;
}

void printLongestSequence(vector<int> arr, vector<int> & longestSequence)
{
    int index = nonDecreasingSubsequence(arr, longestSequence);
    vector<int> sequence;
    sequence.push_back(arr[index]);
    while (index != 0)
    {
        for (int i = index - 1; i >= 0; i--)
        {
            if (1 + longestSequence[i] == longestSequence[index])
            {
                sequence.push_back(arr[i]);
                index = i;
                break;
            }
        }
    }
    reverse(sequence.begin(), sequence.end());
    cout << "The longest sequence is: ";
    for (int i = 0; i < sequence.size(); i++)
        cout << sequence[i] << " ";
}

int main()
{
    int size;
    cin >> size;
    
    vector<int> arr;
    for (int i = 0; i < size; i++)
    {
        int tmp;
        cin >> tmp;
        arr.push_back(tmp);
    }

    vector<int> longestSequence(size, 1);
    printLongestSequence(arr, longestSequence);
    return 0;
}

