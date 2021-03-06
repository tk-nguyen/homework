#include <string>
#include <iostream>

using namespace std;

/* Node of a singly linked list of strings */
class AList {
protected:
    int* a;	// dynamically allocated array of ints
    long maxSize, size;	// logic size of the array(not the allocated size)

public:
    /* Default constructor that creates an empty list */
    AList(int maxSize) {
        this->maxSize = maxSize;
        a = new int[maxSize];
        size = 0;
    }
    //clean up all the memory that has been allocated in the constructor.
    ~AList() {
        delete[] a;
    }
    // ... update and search methods would go here ...
    long getSize() { return size; }
    int isEmpty() { return size <= 0; }
    int isFull() {
        return size == maxSize;
    };

    //add a number to the end of the array
    //return index of the new entry
    //do nothing and return -1 if the array is already full
    int addLast(int n) {
        if (this->isFull()) return -1;
        else 
        {
            size += 1;
            int * tmp = new int[maxSize];
            for (int i = 0; i < this->getSize(); i++)
            {
                tmp[i] = a[i];
            }
            
            tmp[this->getSize()] = n;
            
            delete[] a;
            a = tmp;
           
            return this->getSize();
        }
    }

    //insert a number to the entry indexed i in the array
    // if i is too big (>size) then add the new entry to the end instead
    // do nothing if the array is already full
    void insert(int n, int i) {
        if (i > this->getSize() - 1) this->addLast(n);
        else if (!this->isFull())
        {
            size++;
            int * tmp = new int[maxSize];
            for (int pos = 0; pos < i + 1; pos++)
                tmp[pos] = a[pos];
            
            tmp[i+1] = n;
            for (int pos = i + 2; pos <= this->getSize(); pos++)
                tmp[pos] = a[pos];
            
            delete[] a;
            a = tmp;
        }
    }

    //remove entry with index i, shift all entries from i+1 to the left
    // do nothing if there is no entry i
    void removeIndex(int i) {
        if (i <= this->getSize() - 1)
        {
            size--;
            int * tmp = new int[maxSize];
            for (int pos = 0; pos < i + 1; pos++)
                tmp[pos] = a[pos];
            for (int pos = i + 2; pos < this->getSize(); pos++)
                tmp[pos-1] = a[pos];
            
            delete[] a;
            a = tmp;
        }
    }

    //remove all the entries with value n, 
    // shift entries to the left to cover the deleted slots.
    void removeData(int n) {
        int index = 0;
        int * tmp = new int[maxSize];
        for (int pos = 0; pos < this->getSize(); pos++)
        {
            if (a[pos] != n)
            {
                tmp[index] = a[pos];
                index++;
            }
        }
        delete[] a;
        a = tmp;
        
        size = index;
            
    }

    //display the array's data in order 
    void print() {
        for (int i = 1; i <= this->getSize(); i++)
            cout << a[i] << " ";
        cout << endl;
    }
};

int main(void)
{
    // your code to test class AList
    AList * test = new AList(20);
    for (int i = 0; i < 9; i++)
        test->addLast(i);

    cout << "Original array: ";
    test->print();
    
    cout << "After insert at an index: ";
    test->insert(100, 5);
    test->insert(50, 3);
    test->print();

    cout << "After remove at an index: ";
    test->removeIndex(5);
    test->print();

    cout << "After remove a specific data: ";
    test->removeData(4);
    test->print();

    return 0;
}
