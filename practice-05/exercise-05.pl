% pertenece(L, L1) - Verifica si L pertenece a la lista L1
pertenece(X, [X|_]) :- !.
pertenece(X, [_|T]) :- pertenece(X, T).  % Busca en el resto de la lista

% elimina(L, YS, ZS) - Elimina el elemento L de la lista YS, resultando en ZS
elimina(L, [L|T], T) :- !.  % Si L es la cabeza, lo eliminamos y devolvemos el resto de la lista
elimina(L, [H|T], [H|T1]) :- elimina(L, T, T1).  % Si no es la cabeza, buscamos en el resto de la lista

% my_length(L, N) - Calcula la longitud de la lista L, resultando en N
my_length([], 0).  % La longitud de una lista vacía es 0
my_length([_|T], N) :- my_length(T, N1), N is N1 + 1.  % Suma 1 por cada elemento

% interseccion(L1, L2, R) - Calcula la intersección de las listas L1 y L2, resultando en R
interseccion([], _, []).  % Si L1 está vacía, la intersección es vacía
interseccion([H|T], L2, [H|L3]) :- pertenece(H, L2), interseccion(T, L2, L3), !.  % Si H está en L2, lo añadimos
interseccion([_|T], L2, L3) :- interseccion(T, L2, L3).  % Si no, seguimos buscando
