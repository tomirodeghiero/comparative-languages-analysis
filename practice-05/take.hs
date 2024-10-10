take' :: Int -> [a] -> [a]
take' n xs = takeAux n xs []
  where
    takeAux 0 _ acc = reverse acc
    takeAux _ [] acc = reverse acc
    takeAux n (x:xs) acc = takeAux (n-1) xs (x:acc)
