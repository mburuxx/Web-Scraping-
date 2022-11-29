
#include <stdio.h>
#include <stdlib.h>

typedef struct node {
    int data;
    struct node* next;
} Node;

typedef struct linkedlist {
    Node* head;
    int size;
} LinkedList;

LinkedList* createLinkedList();
void insertNode(LinkedList* ll, int data);
void printLinkedList(LinkedList* ll);

int compare(const void* a, const void* b) {
    return (*(int*) a - *(int*) b);
}

LinkedList* sort(LinkedList* ll, int(f)(const void, const void*));

int main() {
    LinkedList* ll = createLinkedList();
    insertNode(ll, 4);
    insertNode(ll, 2);
    insertNode(ll, 1);
    insertNode(ll, 3);
    printLinkedList(ll);
    ll = sort(ll, compare);
    printLinkedList(ll);
    return 0;
}

LinkedList* createLinkedList() {
    LinkedList* ll = (LinkedList*) malloc(sizeof (LinkedList));
    ll->head = NULL;
    ll->size = 0;
    return ll;
}

void insertNode(LinkedList* ll, int data) {
    Node* newNode = (Node*) malloc(sizeof (Node));
    newNode->data = data;
    newNode->next = ll->head;
    ll->head = newNode;
    ll->size++;
}

void printLinkedList(LinkedList* ll) {
    if (ll == NULL) {
        printf("Linked list is empty\n");
        return;
    }
    Node* temp = ll->head;
    while (temp != NULL) {
        printf("%d ", temp->data);
        temp = temp->next;
    }
    printf("\n");
}

LinkedList* sort(LinkedList* ll, int(f)(const void, const void*)) {
    int i, size;
    Node* current;
    int* array;
    LinkedList* newLinkedList = createLinkedList();

    size = ll->size;
    array = (int*) malloc(size * sizeof (int));
    current = ll->head;

    for (i = 0; i < size; i++) {
        array[i] = current->data;
        current = current->next;
    }

    qsort(array, size, sizeof (int), f);

    for (i = 0; i < size; i++) {
        insertNode(newLinkedList, array[i]);
    }
    return newLinkedList;
}