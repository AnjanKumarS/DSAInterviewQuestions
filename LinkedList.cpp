#include <iostream>
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
    Node *newNode = new Node(val);
    newNode->next = head;
    head = newNode;
}

void insertAtTail(Node* &head,int val){
    Node *new_node = new Node(val);
    if(head==NULL){
        head = new_node;
        return;
    }
    Node *temp = head;
    while (temp->next!=NULL){
        temp = temp->next;
    }
    temp->next = new_node;
}

void insertAtPosition(Node* &head,int val,int pos){
    if(pos==0){
        insertAtHead(head, val);
        return;
    }
    Node *new_node = new Node(val);
    Node *temp = head;
    int curpos = 0;
    while(curpos!=pos-1){
        temp = temp->next;
        curpos++;
    }
    new_node->next = temp->next;
    temp->next = new_node;
}

void update(Node* &head,int val,int pos){
    int curpos = 0;
    Node *temp = head;
    while(curpos!=pos-1){
        temp = temp->next;
        curpos++;
    }
    temp->val = val;
}

void deleteAtHead(Node* &head){
    Node *temp = head;
    head = head->next;
    free(temp);
}

void deleteAtTail(Node* &head){
    Node *secLast = head;
    while(secLast->next->next!=NULL){
        secLast = secLast->next;
    }
    Node *temp = secLast->next;
    secLast->next = NULL;
    free(temp);
}

void deleteAtPos(Node* &head,int pos){
    if(pos==0){
        deleteAtHead(head);
        return;
    }
    Node *pre = head;
    int curPos = 0;
    while(curPos!=pos-1){
        pre = pre->next;
        curPos++;
    }
    Node *temp = pre->next;
    pre->next = pre->next->next;
    free(temp);
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
        cout << temp->val <<"->";
        temp = temp->next;
    }
    cout << "NULL"<<endl;
}

int main(){
    Node *head = NULL;
    insertAtHead(head, 1);
    display(head);
    insertAtHead(head, 2);
    display(head);
    insertAtTail(head, 3);
    display(head);
    insertAtPosition(head, 8, 2);
    display(head);
    update(head, 10, 2);
    display(head);
    cout << search(head,5) << endl;
    return 0;
}