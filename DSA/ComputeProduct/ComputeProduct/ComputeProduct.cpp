#include <iostream>
#include <ctime>
using namespace std;

int computeProduct(int m, int n)
{
    if (n == 1) return m;
    else if (n == 0 || m == 0) return 0;
    else return m + computeProduct(m, n - 1);
}

int main()
{
    int m, n;
    cin >> m >> n;

    cout << computeProduct(m, n);

    
    return 0;
}
