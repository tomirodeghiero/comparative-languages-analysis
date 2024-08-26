#include <stdio.h>
#include <stdlib.h>
#include <dlfcn.h>

int main() {
    void *handle;
    double (*cosine)(double);

    // Load the math library
    handle = dlopen("libm.dylib", RTLD_LAZY);
    if (!handle) {
        fprintf(stderr, "Error: %s\n", dlerror());
        exit(EXIT_FAILURE);
    }

    // Get the "cos" function; we get a function pointer
    dlerror();  // Clear any existing error
    cosine = (double (*)(double)) dlsym(handle, "cos");
    char *error = dlerror();
    if (error != NULL) {
        fprintf(stderr, "Error loading cos: %s\n", error);
        dlclose(handle);
        exit(EXIT_FAILURE);
    }

    printf("%f\n", cosine(2.0));
    dlclose(handle);
    exit(EXIT_SUCCESS);
}
