program CallToCV2;

{$linklib libmylib}

procedure inc_y; external;

var
  x: integer;

begin
  x := 1;
  inc_y;
  writeln(x);
end.
