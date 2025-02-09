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
    if(head==NULL){
        insertAtHead(head, val);
        return;
    }
    Node *temp = head;
    while(temp->next!=NULL){
        temp = temp->next;
    }
    temp->next = new_node;
}

void rotate(Node* &head,int k){
    if(k==0||head==NULL){
        return;
    }
    for (int i = 0; i < k;i++){
        Node *cur = head;
        while(cur->next!=NULL){
            cur = cur->next;
        }
        cur->next = head;
        cur = cur->next;
        head = head->next;
        cur->next = NULL;
    }
}

bool search(Node* head,int key){
    Node *temp = head;
    while(temp!=NULL){
        if(temp->val==key){
            return true;
        }
        temp = temp->next;
    }
    return false;
}

void display(Node* head){
    Node *temp = head;
    while(temp!=NULL){
        cout << temp->val << "->";
        temp=temp->next;
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
    search(head, 10);
    rotate(head, 3);
    display(head);
    cout<<search(head, 10)<<endl;
    return 0;
}