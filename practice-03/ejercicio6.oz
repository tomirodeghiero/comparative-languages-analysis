local Max in
  Max = proc {$ X Y R}
    if X >= Y then R = X else R = Y end
  end
  local A in
    A = 3
    local B in
      B = 2
      local R in
        {Max A B R}
        {Browse R}
      end
    end
  end
end
