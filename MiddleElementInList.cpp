#include<iostream>
using namespace std;

class Node{
    public:
        int val;
        Node *next;
        Node(int data){
            val = data;
            next = NULL;
        }
};

void insertAtHead(Node* &head,int val){
    Node *new_node = new Node(val);
    new_node->next = head;
    head = new_node;
}

void insertAtTail(Node* &head,int val){
    Node *newnode = new Node(val);
    if(head==NULL){
        insertAtHead(head, val);
        return;
    }
    Node *temp = head;
    while(temp->next!=NULL){
        temp = temp->next;
    }
    temp->next = newnode;
}

void middleNode(Node* head){
    Node *temp = head;
    int length = 0;
    while(temp!=NULL){
        temp = temp->next;
        length++;
    }
    temp = head;
    int n = length / 2;
    while(n!=0){
        temp = temp->next;
        n--;
    }
    cout << temp->val << endl;
}

void display(Node* head){
    Node *temp = head;
    while(temp!=NULL){
        cout << temp->val << "->";
        temp = temp->next;
    }
    cout << "NULL" << endl;
}

int main(){
    Node *head = NULL;
    insertAtHead(head,30);
    insertAtHead(head, 20);
    insertAtHead(head, 10);
    insertAtTail(head, 40);
    insertAtTail(head, 50);
    display(head);
    middleNode(head);
    return 0;
}