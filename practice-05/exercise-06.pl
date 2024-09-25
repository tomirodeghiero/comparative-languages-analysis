% Caso base: si la lista de entrada está vacía, la lista de salida también lo está
multiplica_lista([], F, []).

% Caso recursivo: multiplica el primer elemento de L1 por F y continúa con el resto
multiplica_lista([H|T], F, [H2|T2]) :-
    H2 is H * F,            % Multiplica el elemento de la cabeza por F
    multiplica_lista(T, F, T2).  % Llama recursivamente con el resto de la lista
