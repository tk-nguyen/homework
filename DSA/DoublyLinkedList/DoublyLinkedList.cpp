#include <string>
#include <iostream>

using namespace std;

/* Node of a singly linked list of strings */
struct DNode {
    string* element;
    DNode *next; // Pointer to the next node
    DNode *prev;
   /* Creates a node. */
    DNode(string* e, DNode* n, DNode* p)  {
        element = e;
        next = n;
        prev = p;
   }
    string* getElement() { return element; }
    void print() { cout << *element; }
};

class DList {
protected:		// data member
    DNode* head,*tail;
    long size;		// number of nodes in the list

public:
    /* Default constructor that creates an empty list */
    DList() {
        head = NULL;
        tail = NULL;

        size = 0;
    }
    // ... update and search methods would go here ...
    long getSize() { return size; }
    int isEmpty() { return size<=0; }

    //remove the first node in the list
    string* removeFirst() {
        if (head==NULL) return NULL;
        DNode* s = head->next;
        delete head;
        head = s;
        return s->getElement();
    }

    // insert a new node after node n and store the string s there
    DNode* insertAfter (string* s, DNode* n) {
        DNode * newNode = new DNode(s, NULL, NULL);
        if (n == NULL)
        {
            head = newNode;
            tail = newNode;
        }
        else
        {

            newNode->next = n->next;
            if (n->next != NULL)
                n->next->prev = newNode;
            else tail = newNode;
            newNode->prev = n;
            n->next = newNode;
        }
        return newNode;
    }

    // delete node n and return the string stored in n
    string* insertAfter (DNode * n)
    {
        n->prev->next = n->next;
        n->next->prev = n->prev;
        string* result = n->getElement();
        delete n;
        return result;
    }

    //display the list's data in order from head to tail
    void print() {
        DNode* iter = head;
        while (iter!=NULL) {
            iter->print();
            iter = iter->next;
        }
        cout << endl;
    }

    DNode* getHead() { return head; }
    DNode* getTail() { return tail; }
};

int main(void)
{
   // You should modified this function to test list's methods.

   DList* dl = new DList();
   string s1 = "1";
   DNode* p = dl->insertAfter(&s1, dl->getHead());
   dl->print();


   string s2 = "2";
   dl->insertAfter(&s2, p);
   dl->print();


   string s3 = "3";
   dl->insertAfter(&s3, p->next);
   dl->print();

   string s4 = "4";
   dl->insertAfter(&s4, p->next);
   dl->print();

   string s5 = "5";
   dl->insertAfter(&s5, p->next);
   dl->print();

   dl->removeFirst();
   dl->print();
   dl->removeFirst();
   dl->print();
   dl->removeFirst();
   dl->print();

   return 0;
}
