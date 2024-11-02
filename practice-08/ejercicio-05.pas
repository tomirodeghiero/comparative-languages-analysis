program GarbageExample;
var
  ptr: ^Integer;
  anotherPtr: ^Integer;
begin
  New(ptr);
  ptr^ := 100;

  New(anotherPtr);   
  anotherPtr^ := 200;

  ptr := anotherPtr;
end.
