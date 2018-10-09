#ifndef __SQUEUE_H
#define __SQUEUE_H

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

class SQueue {
protected:		// data member
    SNode* head;
    long size;		// number of nodes in the queue

public:
    /* Default constructor that creates an empty list */
    SQueue() {
        head = NULL;
        size = 0;
    }
    // ... update and search methods would go here ...
    long getSize() { return size; }
    int isEmpty() { return size <= 0; }

    SNode* addLast(string* s)
    {
        SNode* newNode = new SNode(s, NULL);
        SNode* tmp = head;
        if (head == NULL) head = newNode;
        else
        {
            while (tmp->next != NULL)
                tmp = tmp->next;

            tmp->next = newNode;
            size++;
            
            return head;
        }
    }

    string* removeFirst() {
        if (head == NULL) return NULL;
        string* s = head->element;
        SNode * t = head;
        head = head->next;
        delete t;
        size--;
        return s;
    }


    void print() {
        SNode* iter = head;
        while (iter != NULL) {
            iter->print();
            cout << ", ";
            iter = iter->next;
        }
        cout << endl;
    }
};

#endif