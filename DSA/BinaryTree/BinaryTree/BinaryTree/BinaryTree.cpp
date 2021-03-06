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
            if (n != root) cout << "(";
            printExpression(n->left);
        }
        cout << *(n->data);
        if (n->right != NULL)
        {
            printExpression(n->right);
            if (n != root) cout << ")";
        }
    }
    Node* getRoot() { return root; }

    int evaluateExpression(Node* n)
    {
        if (n->isExternal())
            return *(n->data) - '0';
        else
        {
            int x = evaluateExpression(n->left);
            int y = evaluateExpression(n->right);
            if (*(n->data) == '+') return x + y;
            else if (*(n->data) == '-') return x - y;
            else if (*(n->data) == '*') return x * y;
            return x / y;
        }
    }

    void inorderTraversal(Node* n)
    {
        if (n->isInternal())
            inorderTraversal(n->left);
        cout << *(n->data) << " ";
        if (n->isInternal())
            inorderTraversal(n->right);
    }

    void preorderTraversal(Node* n)
    {
        cout << *(n->data) << " ";
        if (n->isInternal())
        {
            preorderTraversal(n->left);
            preorderTraversal(n->right);
        }
    }

};

int main()
{
    BinaryTree* test = new BinaryTree();
    Node* root = test->getRoot();
    Node* n1 = new Node(), *n2 = new Node(), *n3 = new Node(), *n4 = new Node(), *n5 = new Node(), *n6 = new Node(), *n7 = new Node(), *n8 = new Node();

    char add = '+', minus = '-', multiply = '*', divide = '/';
    
    char num1 = '7', num2 = '9', num3 = '2', num4 = '3';
    
    root->data = &add;
    root->left = n1; n1->data = &multiply;
    root->right = n2; n2->data = &multiply;
    
    n1->left = n3; n3->data = &num1;
    n1->right = n4; n4->data = &minus;

    n4->left = n5; n5->data = &num2;
    n4->right = n6; n6->data = &num3;

    n2->left = n7; n7->data = &num4;
    n2->right = n8; n8->data = &num1;

    cout << "Expression: ";
    test->printExpression(root);
    cout << endl;

    cout << "Value: ";
    cout << test->evaluateExpression(root);
    cout << endl;

    cout << "Inorder traversal: ";
    test->inorderTraversal(root);
    cout << endl;

    cout << "Preorder traversal: ";
    test->preorderTraversal(root);
    
    return 0;
}