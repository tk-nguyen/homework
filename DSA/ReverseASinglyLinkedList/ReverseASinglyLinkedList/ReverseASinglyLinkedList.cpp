#include <iostream>
#include "slist.h"

using namespace std;

SNode* reverseList(SList* list, SNode* head)
{
    SNode* current = head;
    head = head->next;
    SNode* after = head->next;
    current->next = NULL;
    while (head != NULL)
    {
        head->next = current;
        current = head;
        head = after;
        if (after != NULL) after = after->next;
    }
    
    return current;
}

int main()
{
    SList* list = new SList();
    string s1 = "1", s2 = "2", s3 = "3", s4 = "4", s5 = "5";

    list->addFirst(&s1);
    list->addFirst(&s2);
    list->addFirst(&s3);
    list->addFirst(&s4);
    list->addFirst(&s5);

    cout << "Original list: ";
    list->print();

    SNode* tmp = reverseList(list, list->getTop());
    cout << "Reversed list: ";
    while (tmp != NULL)
    {
        cout << *tmp->getElement() << ", ";
        tmp = tmp->next;
    }
    return 0;
}
