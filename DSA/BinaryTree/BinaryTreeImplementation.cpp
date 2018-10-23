#include <iostream>

using namespace std;

struct Node
{
    char* data;
    Node* left;
    Node* right;
    Node()
    {
       left = NULL;
       right = NULL;
       data = NULL;
    }
    bool isInternal() { return left != NULL || right != NULL; }
    bool isExternal() { return !isInternal(); }

};

class BinaryTree
{
protected:
    Node* root;
public:
    BinaryTree()
    {
        root = new Node();
    }

    void printExpression(Node* n)
    {
        if (n->left != NULL)
        {
            cout << "(";
            printExpression(n->left);
        }
        cout << n->data;
        if (n->right != NULL)
        {
            printExpression(n->right);
            cout << ")";
        }
    }
    Node* getRoot() { return root; }

};

int main()
{
    BinaryTree* test = new BinaryTree();
    Node* root = test->getRoot();
    Node* n1 =


    return 0;
}
