#include <iostream>
#include "squeue.h"

using namespace std;



int main()
{
    SQueue* stringQueue = new SQueue();
    string s1 = "1", s2 = "2", s3 = "3", s4 = "4", s5 = "5";

    stringQueue->addLast(&s1);
    stringQueue->print();
   
    stringQueue->addLast(&s2);
    stringQueue->print();
    
    stringQueue->addLast(&s3);
    stringQueue->print();
    
    stringQueue->addLast(&s4);
    stringQueue->print();
    
    stringQueue->addLast(&s5);
    stringQueue->print();

    stringQueue->removeFirst();
    stringQueue->print();

    stringQueue->removeFirst();
    stringQueue->print();
    
    stringQueue->removeFirst();
    stringQueue->print();

    stringQueue->removeFirst();
    stringQueue->print();

    stringQueue->removeFirst();
    stringQueue->print();
    return 0;
}

