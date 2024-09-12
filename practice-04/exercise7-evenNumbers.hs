-- Ejercicio 7 - Lista de enteros pares positivos en Haskell
evenNumbers :: [Int]
evenNumbers = [x | x <- [1..], even x]

-- Ejemplo de uso
main :: IO ()
main = print (take 10 evenNumbers)
