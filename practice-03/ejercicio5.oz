local X in
  X = 1
  local Y in
    Y = 2 + X
    local R in
      if X > Y then
        R = X
      else
        R = Y
      end
      {Browse R}
    end
  end
end
