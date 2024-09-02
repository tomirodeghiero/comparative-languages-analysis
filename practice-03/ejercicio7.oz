local X in
  X = 1
  local P in
    P = proc {$ Y R1}
      local P in
        local A in
          P = proc {$ Z R2}
            R2 = 10
          end
          local R2 in
            {P 0 R2}
            A = R2
            R1 = A + Y
          end
        end
      end
    end
    local R1 in
      {P X R1}
      {Browse R1}
    end
  end
end
