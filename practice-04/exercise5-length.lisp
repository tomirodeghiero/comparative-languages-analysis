; Ejercicio 5 - Definir función length en Lisp
(defun my-length (lst)
  (if (null lst)
      0
      (+ 1 (my-length (cdr lst)))))

; Ejemplo de uso
(format t "La longitud de la lista es: ~a~%" (my-length '(1 2 3 4 5)))
