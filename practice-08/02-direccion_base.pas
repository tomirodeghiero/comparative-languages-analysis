program DireccionBaseEjemplo;

const
    li = 1;
    ls = 5;
    li0 = 1;
    ls0 = 3;
    li1 = 1;
    ls1 = 4;
    sizeofT = 4;  { Tamaño en bytes de T, por ejemplo, entero de 4 bytes }

var
    dir_base: integer;

function direccion_vector(i: integer): integer;
begin
    direccion_vector := dir_base + (i - li) * sizeofT;
end;

function direccion_matriz(i, j: integer): integer;
begin
    direccion_matriz := dir_base + ((i - li0) * (ls1 - li1 + 1) + (j - li1)) * sizeofT;
end;

begin
    dir_base := 1000;  { Se supone que la dirección base es 1000 }

    writeln('Dirección del elemento 3 en el vector: ', direccion_vector(3));
    writeln('Dirección del elemento (2, 3) en la matriz: ', direccion_matriz(2, 3));
end.
