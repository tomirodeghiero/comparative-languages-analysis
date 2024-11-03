class A:
    def display(self):
        print("Clase A")

class B(A):
    pass

class C(A):
    pass

class D(B, C):
    pass

# Crear una instancia de D
obj = D()
obj.display()  # Llama al método de A sin ambigüedad

# Ver el orden de resolución de métodos
print(D.__mro__)
