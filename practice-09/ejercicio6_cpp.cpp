#include <iostream>
using namespace std;

class A {
public:
    void display() {
        cout << "Clase A" << endl;
    }
};

class B : virtual public A {
};

class C : virtual public A {
};

class D : public B, public C {
};

int main() {
    D obj;
    obj.display(); // Llama a `display` de `A` sin ambigüedad
    return 0;
}
