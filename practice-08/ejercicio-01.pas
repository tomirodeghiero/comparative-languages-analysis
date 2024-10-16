program Experimento;
type
  DiaSemana = (Dom, Lun, Mar, Mie, Jue, Vie, Sab, Festivo, NoLaborable);
var
  s: Set of DiaSemana;
  dia: DiaSemana;
  // b: Integer absolute s;  (* b comparte la memoria de s *)
  b: byte absolute s;  (* b comparte la memoria de s *)
begin
  s := [Lun, Mie, Vie];  (* Asignación de tres días al conjunto s *)

  writeln('El conjunto tiene los siguientes días:');
  for dia := Dom to Sab do
  begin
    if dia in s then
      writeln(dia, ' SI está en el conjunto.')
    else
      writeln(dia, ' NO está en el conjunto.');
  end;

  writeln('Representación interna de s: ', b);  (* Mostrar la representación en entero *)
end.
