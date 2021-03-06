#include <iostream>
#include <stack>
#include <string>
using namespace std;

bool checkParentenses(stack<char> mystack, string input)
{
    for (int i = 0; i < input.length(); i++)
    {
        if (input[i] == '(' || input[i] == '[' || input[i] == '{')
            mystack.push(input[i]);
        else if (input[i] == ')' || input[i] == ']' || input[i] == '}')
        {
            if (mystack.empty()) return false;
            else
            {
                if (input[i] == ')' && mystack.top() == '(' || input[i] == ']' && mystack.top() == '[' || input[i] == '}' && mystack.top() == '{')
                    mystack.pop();
                else return false;
            }
        }
    }
    if (mystack.empty()) return true;
    else return false;
}


int main()
{
    stack<char> mystack;

    string input;
    cin >> input;
    
    if (checkParentenses(mystack, input)) cout << "Correct!";
    else cout << "Incorrect!";
    

    return 0;
}