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
    Node *new_node = new Node(val);
    Node *temp = head;
    while(temp->next!=NULL){
        temp = temp->next;
    }
    temp->next = new_node;
}

void deleteDuplicates(Node* &head){
    Node *curtemp = head;
    while(curtemp!=NULL){
        while(curtemp->next!=NULL && curtemp->val==curtemp->next->val){
            Node *temp = curtemp->next;
            curtemp->next = temp->next;
            delete temp;
        }
        curtemp = curtemp->next;
    }
}

Node* reverseLL(Node* &head){
    Node *preptr = NULL;
    Node *curptr = head;
    while(curptr!=NULL){
        Node* nextptr = curptr->next;
        curptr->next = preptr;
        preptr = curptr;
        curptr = nextptr;
    }
    Node *new_node = preptr;
    return new_node;
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
    insertAtHead(head, 3);
    insertAtHead(head, 2);
    insertAtHead(head, 2);
    insertAtHead(head, 1);
    insertAtTail(head, 4);
    deleteDuplicates(head);
    display(head);
}