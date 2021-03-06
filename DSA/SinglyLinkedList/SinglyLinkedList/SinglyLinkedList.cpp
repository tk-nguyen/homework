#include <string>
#include <iostream>

using namespace std;

/* Node of a singly linked list of strings */
struct SNode {
    string* element;
    SNode *next; // Pointer to the next node

    /* Creates a node. */
    SNode(string* e, SNode* n) {
        element = e;
        next = n;
    }
    string* getElement() { return element; }
    void print() { cout << *element; }
};

class SList {
protected:		// data member
    SNode* head;
    long size;		// number of nodes in the list

public:
    /* Default constructor that creates an empty list */
    SList() {
        head = NULL;
        size = 0;
    }

    // ... update and search methods would go here ...
    long getSize() { return size; }
    int isEmpty() { return size <= 0; }

    // add a new node to the begining of the list
    SNode* addFirst(string* s) {
        SNode* newNode = new SNode(s, head);
        head = newNode;
        size++;
        return newNode;
    }

    //remove the first node in the list
    string* removeFirst() {
        if (head == NULL) return NULL;
        SNode* s = head->next;
        delete head;
        head = s;
        return s->element;
    }

    // insert a new node after node n and store the string s there
    void insertAfter(SNode* n, string* s) {
        SNode* newNode = new SNode(s, n->next);
        n->next = newNode;
    }

    // delete node n and return the string stored in n
    string* insertAfter(SNode* n) {
        SNode* iter = head;
        while (iter->next != n)
            iter = iter->next;

        iter->next = n->next;
        string* result = n->element;
        delete n;
        return result;
    }

    //display the list's data in order from head to tail
    void print() {
        SNode* iter = head;
        while (iter != NULL) {
            iter->print();
            iter = iter->next;
        }
        cout << endl;
    }
};

int main(void)
{
    // You should modified this function to test list's methods.

    SList* dl = new SList();
    string s1 = "1";
    SNode* p = dl->addFirst(&s1);
    dl->print();

    string s2 = "2";
    dl->addFirst(&s2);
    dl->print();

    string s3 = "3";
    dl->addFirst(&s3);
    dl->print();

    string insert = "x";
    dl->insertAfter(p, &insert);
    dl->print();

    string s4 = "4";
    dl->addFirst(&s4);
    dl->print();

    string s5 = "5";
    dl->addFirst(&s5);
    dl->print();

    dl->removeFirst();
    dl->print();
    dl->removeFirst();
    dl->print();
    dl->removeFirst();
    dl->print();

    return 0;
}
