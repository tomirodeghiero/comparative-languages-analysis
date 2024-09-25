% Predicado sin corte:
pertenece(X, [X|_]).
pertenece(X, [_|L]) :- pertenece(X, L).

% Predicado con corte:
pertenece_corte(X, [X|_]) :- !.
pertenece_corte(X, [_|L]) :- pertenece_corte(X, L).
