import inspect

# 1. Verificar si un argumento es una clase
class MyClass:
    pass

def is_class(obj):
    return inspect.isclass(obj)

# Ejemplo de uso
print("¿Es clase MyClass?", is_class(MyClass))  # True
print("¿Es clase 5?", is_class(5))  # False


# 2. Verificar si un argumento es un método de una clase
class Example:
    def instance_method(self):
        pass

    @classmethod
    def class_method(cls):
        pass

# Ejemplo de uso
example = Example()
print("¿Es método de instancia?", inspect.ismethod(example.instance_method))  # True
print("¿Es función en la clase?", inspect.isfunction(Example.class_method))  # True


# 3. Mostrar la jerarquía de clases dada una clase
class A:
    pass

class B(A):
    pass

class C(B):
    pass

def show_hierarchy(cls):
    mro = inspect.getmro(cls)
    print("Jerarquía de clases para", cls.__name__)
    for base in mro:
        print(base)

# Muestra la jerarquía de C
show_hierarchy(C)


# 4. Listar los métodos y atributos de una clase
class Sample:
    def __init__(self):
        self.value = 10

    def method_one(self):
        pass

    def method_two(self):
        pass

def list_methods(cls):
    methods = inspect.getmembers(cls, predicate=inspect.isfunction)
    print("Métodos de la clase", cls.__name__)
    for name, func in methods:
        print(f"Method: {name}")

list_methods(Sample)


# 5. Determinar si un objeto es una función, un método o un atributo de datos
class ExampleClass:
    class_attr = 5
    
    def instance_method(self):
        pass

    @staticmethod
    def static_method():
        pass

example = ExampleClass()

print("¿Es atributo de datos class_attr?", inspect.isdatadescriptor(inspect.getattr_static(ExampleClass, 'class_attr')))  # True
print("¿Es método instance_method?", inspect.ismethod(example.instance_method))  # True
print("¿Es función static_method?", inspect.isfunction(ExampleClass.static_method))  # True
