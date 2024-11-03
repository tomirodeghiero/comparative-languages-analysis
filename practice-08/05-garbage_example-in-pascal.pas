Program basura;
  var p, q: ^Integer;
Begin
  New(p);
  New(q);
  p^ := 100;
  p := q;
  WriteLn('Valor de p = ', p^);
  WriteLn('Valor de q = ', q^);
End.
