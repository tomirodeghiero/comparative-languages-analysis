% Caso base: Una lista vacía es subconjunto de cualquier lista.
sub_set(_, []).

% Caso recursivo: Si un elemento es parte del subconjunto, se puede elegir o no elegir para formar subconjuntos
sub_set([H|T], [H|R]) :-
    sub_set(T, R).  % Caso en que H es incluido en el subconjunto
sub_set([_|T], R) :-
    sub_set(T, R).  % Caso en que H no es incluido
