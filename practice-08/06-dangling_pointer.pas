program DanglingPointerExample;
var
  ptr: ^Integer;
begin
  New(ptr);
  ptr^ := 100;

  Dispose(ptr);

  WriteLn(ptr^);
end.
